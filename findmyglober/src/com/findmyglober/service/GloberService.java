package com.findmyglober.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.json.JSONException;

import com.findmyglober.dao.GloberDao;
import com.findmyglober.vo.GloberVO;
import com.google.gson.Gson;

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
	
	GloberDao globerDao;

	@Path("/getByName/{name}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByName(@PathParam("name") String globerName) throws JSONException {		
		globerDao = new GloberDao();
		Gson gson = new Gson();
		
		List<GloberVO> listGlobers = globerDao.getGloberByName(globerName);		
		return Response.status(Status.OK).entity(gson.toJson(listGlobers)).build();
	}
	
	@Path("/getByEmail/{email}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByEmail(@PathParam("email") String globerEmail) throws JSONException {

		globerDao = new GloberDao();
		Gson gson = new Gson();
		
		List<GloberVO> listGlobers = globerDao.getGloberByEmail(globerEmail);		
		return Response.status(Status.OK).entity(gson.toJson(listGlobers)).build();
	}
	
	@Path("/getByProject/{project}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByProject(@PathParam("project") String project) throws JSONException {

		globerDao = new GloberDao();
		Gson gson = new Gson();
		
		List<GloberVO> listGlobers = globerDao.getGloberByProject(project);		
		return Response.status(Status.OK).entity(gson.toJson(listGlobers)).build();
	}
}
