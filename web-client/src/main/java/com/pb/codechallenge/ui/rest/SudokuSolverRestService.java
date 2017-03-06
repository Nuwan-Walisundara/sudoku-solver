package com.pb.codechallenge.ui.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pb.codechallenge.ejb.Returnable;
import com.pb.codechallenge.model.SolutionDTO;
import com.pb.codechallenge.service.SudokuSolverDelegate;

@Path("/hello")
public class SudokuSolverRestService   {
	@GET
	@Path("/query")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg(@QueryParam("input") String msg) {

		try {
			SudokuSolverDelegate delegate = new SudokuSolverDelegate();
			Returnable dto=  delegate.compleInput(msg);
			return Response.status(200).entity(dto ).build();
		} catch (Exception e) {
			return Response.status(400).entity("{error:cannot be completed}").build();
		}
		

	}
}