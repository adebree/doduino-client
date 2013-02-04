package nl.de_bree.android.doduino;

import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class DoDuinoClient {
//	static final String HOST = "http://192.168.0.11:80";
	static final String HOST = "http://178.84.203.207:81";
//	static final String HOST = "http://192.168.0.5:81";
	static final String CMD_SWITCH 	= "setSwitchChannel";
	static final String CMD_LIGHT 	= "setLightChannel";
//	static final String CMD_SET 	= "post.php";
	static final String CMD_SET 	= "set";
	
	private DefaultHttpClient httpClient;
	private HttpGet getRequest;	
	private HttpPost postRequest;
	
	public DoDuinoClient() {
		httpClient = new DefaultHttpClient();
		httpClient.getParams().setParameter("http.protocol.expect-continue", false);
	}
	
	private void doRequest( String url ) { 
		getRequest = new HttpGet( url );
		
		try {
			httpClient.execute( getRequest );
			
		} catch( NoHttpResponseException e ) {
			// Ignore, DoDuino web doesn't behave nicely when it comes down to responses
			//
			
		} catch( Exception e ) {
				
		}
	}
	
	public void set( List<NameValuePair> qparams )
	{
		String url;
		url = HOST + "/" + CMD_SET;		
		
    	postRequest = new HttpPost( url );
    	
       	postRequest.setHeader("User-Agent", "DoDuino for Android" );
    	postRequest.setHeader("Content-Type", "application/x-www-form-urlencoded");
    	
    	UrlEncodedFormEntity entity = null;
    	
    	try 
    	{
    		entity = new UrlEncodedFormEntity(qparams, "UTF-8");
    	}
    	catch ( Exception e )
    	{
    		
    	}

    	postRequest.setEntity( entity );
    	
    	try
    	{
    		httpClient.execute( postRequest );
		} catch( NoHttpResponseException e ) {
			// Ignore, DoDuino web doesn't behave nicely when it comes down to responses
			//			
		} catch( Exception e ) {
				
		}
	}
	
	public void setSwitch( int channel, int state )
	{
		String url;
		
		url = HOST + "/" + CMD_SWITCH + "/" + channel + "/" + state + "/0/0";
		
		doRequest( url );
	}
	
	public void setLight( int channel, int value )
	{
		String url;
		
		url = HOST + "/" + CMD_LIGHT + "/" + channel + "/" + value + "/0/0";
		
		doRequest( url );
	}
	
}
