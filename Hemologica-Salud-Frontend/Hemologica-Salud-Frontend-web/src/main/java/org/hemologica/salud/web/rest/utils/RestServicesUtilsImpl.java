package org.hemologica.salud.web.rest.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import com.google.gson.Gson;

public class RestServicesUtilsImpl implements IRestServicesUtils {

	@Override
	public String post(String url, Object o) throws IOException {
		
		HttpClient client = HttpClientBuilder.create().build();
    	HttpPost post = new HttpPost(url);
    	
    	Gson gson = new Gson();
    	
		/**
		 * Se pasa siempre un objto en formato JSON en el contenido del mensaje
		 */
		StringEntity entity = new StringEntity(gson.toJson(o));
		entity.setContentType("application/json");
		post.setEntity(entity);
		
		HttpResponse r = client.execute(post);
		
		/**
		 * status code 0 = success
		 */
		if(r.getStatusLine().getStatusCode() == 0){
		
			BufferedReader br = new BufferedReader(new InputStreamReader(r.getEntity().getContent()));
			StringBuilder sb = new StringBuilder();
			String s;

			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			return sb.toString();
		}else{
			return null;
			
		}
	}

	@Override
	public String get(String url, HashMap<String, String> parameters) throws ClientProtocolException, IOException, URISyntaxException {
		
		HttpClient client = HttpClientBuilder.create().build();
		
		/**
		 * Parametros de la URL
		 */
		URIBuilder builder = new URIBuilder();
		builder.setPath(url);
		if(parameters != null){
			for(String key : parameters.keySet()){
				
				builder.setParameter(key, parameters.get(key));
				
			}
		}
		
		URI uri = builder.build();
		HttpGet httpget = new HttpGet(uri);
		
		HttpResponse r = client.execute(httpget);
		
		/**
		 * status code 0 = success
		 */
		if(r.getStatusLine().getStatusCode() == 200){
		
			BufferedReader br = new BufferedReader(new InputStreamReader(r.getEntity().getContent()));
			StringBuilder sb = new StringBuilder();
			String s;

			while ((s = br.readLine()) != null) {
				sb.append(s);
			}
			return sb.toString();
		}else{
			return null;
			
		}
	}

}
