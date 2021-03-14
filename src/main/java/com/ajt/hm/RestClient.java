package com.ajt.hm;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


public class RestClient {
	
	public Invocation.Builder getTarget(String url, String contentType) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(url);
		return target.request(contentType);
	}

	public String getAjax(String url) {
		Response response = getTarget(url, MediaType.APPLICATION_JSON).get();
		String jsonResp = null;
		if (response.getStatus() == 200) {
			jsonResp = response.readEntity(String.class);
		}
		return jsonResp;
	}

	public void postAjax(String url, Object data) {
		Response response = getTarget(url, MediaType.APPLICATION_JSON).post(Entity.json(data));

	}

	public static void main(String[] args) {
		System.out.println("STARTED");
		RestClient client = new RestClient();
		// String s=client.getAjax("http://localhost:8080/WAOne/rest/api/employee");
		client.postAjax("http://localhost:8080/WAOne/rest/api/saveEmployee", "{\"id\":101,\"name\":\"Ajeet\"}");
	}
}
