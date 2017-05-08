package dynamind.oauth2.client;

import com.fasterxml.jackson.databind.JsonNode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController extends SimpleClientHttpRequestFactory{

   /* @Autowired
    private OAuth2RestOperations restTemplate;*/
    
    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Value("${config.oauth2.resourceURI}")
    private String resourceURI;

    @RequestMapping("/")
    public JsonNode home() {
    	//final MySimpleClientHttpRequestFactory factory = new MySimpleClientHttpRequestFactory(verifier);
    	//restTemplate.setRequestFactory(factory);
    	//Client.trustSelfSignedSSL();
        return restTemplate.getForObject(resourceURI, JsonNode.class);
    }

}