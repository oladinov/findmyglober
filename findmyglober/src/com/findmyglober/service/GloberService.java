package com.findmyglober.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

import com.findmyglober.bo.Glober;

@Path("/glober")
public class GloberService {

	@Path("/getByName/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByName(@PathParam("name") String globerName) throws JSONException {

		List<JSONObject> listGlobers = new ArrayList<JSONObject>();
		JSONObject jsonObject1 = new JSONObject();

		jsonObject1.put("name", globerName);
		jsonObject1.put("email", "emailDummy");
		jsonObject1.put("project", "projectDummy");
		jsonObject1.put("site", "siteDummy");

		JSONObject jsonObject2 = new JSONObject();

		jsonObject2.put("name", globerName);
		jsonObject2.put("email", "emailDummy");
		jsonObject2.put("project", "projectDummy");
		jsonObject2.put("site", "siteDummy");

		listGlobers.add(jsonObject1);
		listGlobers.add(jsonObject2);

		String result = "" + listGlobers;
		return Response.status(200).entity(result).build();
	}

}
