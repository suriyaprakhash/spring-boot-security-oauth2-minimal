package dynamind.oauth2.client;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class NullHostnameVerifier implements HostnameVerifier
{
public boolean verify(final String hostname, final SSLSession session)
{
return true;
}
}