package com.findmyglober.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * Service calls
 * 
 * getByName
 * /findmyglober/glober/getByName/{name}
 * 
 * getByEmail
 * /findmyglober/glober/getByEmail/{email}
 * 
 * getByProject
 * /findmyglober/glober/getByProject/{project}
 * 
 * @author Gerardo Solorzano
 *
 */
@Path("/glober")
public class GloberService {

	@Path("/getByName/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByName(@PathParam("name") String globerName) throws JSONException {

		List<JSONObject> listResponse = new ArrayList<JSONObject>();
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", globerName);
		jsonObject1.put("email", "emailDummy1");
		jsonObject1.put("project", "projectDummy1");
		jsonObject1.put("site", "siteDummy1");

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", globerName);
		jsonObject2.put("email", "emailDummy2");
		jsonObject2.put("project", "projectDummy2");
		jsonObject2.put("site", "siteDummy2");

		listResponse.add(jsonObject1);
		listResponse.add(jsonObject2);

		return Response.status(Status.OK).entity(listResponse.toString()).build();
	}
	
	@Path("/getByEmail/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByEmail(@PathParam("email") String globerEmail) throws JSONException {

		List<JSONObject> listResponse = new ArrayList<JSONObject>();
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", "nameDummy1");
		jsonObject1.put("email", globerEmail);
		jsonObject1.put("project", "projectDummy1");
		jsonObject1.put("site", "siteDummy1");

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", "nameDummy2");
		jsonObject2.put("email", globerEmail);
		jsonObject2.put("project", "projectDummy2");
		jsonObject2.put("site", "siteDummy2");

		listResponse.add(jsonObject1);
		listResponse.add(jsonObject2);

		return Response.status(Status.OK).entity(listResponse.toString()).build();
	}
	
	@Path("/getByProject/{project}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByProject(@PathParam("project") String project) throws JSONException {

		List<JSONObject> listResponse = new ArrayList<JSONObject>();
		
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("name", "nameDummy1");
		jsonObject1.put("email", "emailDummy1");
		jsonObject1.put("project", project);
		jsonObject1.put("site", "siteDummy1");

		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("name", "nameDummy2");
		jsonObject2.put("email", "emailDummy2");
		jsonObject2.put("project", project);
		jsonObject2.put("site", "siteDummy2");

		listResponse.add(jsonObject1);
		listResponse.add(jsonObject2);

		return Response.status(Status.OK).entity(listResponse.toString()).build();
	}
}
