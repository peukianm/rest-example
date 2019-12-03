package com.test.rest;

import javax.ws.rs.*;


@Path("/")
public class RestService {

	@GET
	@Path("/score/wins")
	@Produces("text/plain")
	public int getWins() {
		return Score.WINS;
	}
  ms
	@GET
	@Path("/score/losses")
	@Produces("text/plain")
	public int getLosses() {
		return Score.LOSSES;
	}

	@GET
	@Path("/score/ties")
	@Produces("text/plain")
	public int getTies() {
		return Score.TIES;
	}
	
	
	@POST 
	@Path("/score/wins") 
	@Produces("text/plain")
	public int increaceWins() {
		return ++Score.WINS;
	}
	
	@POST
	@Path("/score/losses") 
	@Produces("text/plain")
	public int increaceLosses() {
		return ++Score.LOSSES;
	}
	
	@POST 
	@Path("/score/ties") 
	@Produces("text/plain")
	public int increaceTies() {
		return ++Score.TIES;
	}
	
	
	@GET
	@Path("/score")
	@Produces("application/json")
	public String getScore() {
	   String pattern = 
	      "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
	   return String.format(pattern,  Score.WINS, Score.LOSSES, Score.TIES);   
	}
	 
	
	@PUT
	@Path("/score")
	@Produces("application/json")
	public String update(@QueryParam("wins") int wins, 
	                        @QueryParam("losses") int losses, 
	                        @QueryParam("ties")   int ties) {
		Score.WINS = wins;
		Score.TIES = ties;
		Score.LOSSES = losses;
	   String pattern = 
	      "{ \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
	   return String.format(pattern,  wins, losses, ties );   
	}
	

}
