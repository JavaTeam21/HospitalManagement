package com.ajt.hm.rest;

import java.util.Objects;
import java.util.StringTokenizer;

import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.ajt.hm.util.Util;

@Path("/api")
public class RestService {

	@POST
	@Path("/auth")
	public Response authRequest(@HeaderParam("authorization") String authString) {
		if(Objects.isNull(authString) || "".equals(authString.trim())) {
			return Response.ok("Invalid username and password").status(Status.BAD_REQUEST).build();
		}
		System.out.println("authString=" + authString);
		authString = authString.replaceFirst("Basic ", "");
		System.out.println("authString=" + authString);
		
		authString=Util.decodeString(authString);
		System.out.println("authString=" + authString);
		
		StringTokenizer tokenizer=new StringTokenizer(authString, ":");
		String uname=tokenizer.nextToken();
		String password=tokenizer.nextToken();

		System.out.println("uname=" + uname);
		System.out.println("password=" + password);
		
		if("ajeet".equals(uname) && "dubey".equals(password)) {
			return Response.ok("Success!").build();
		} else {
			return Response.ok("Invalid username and password").status(Status.UNAUTHORIZED).build();
		}
	}

}
