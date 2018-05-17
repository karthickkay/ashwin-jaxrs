package com.jersey.friends.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.jersey.friends.controller.FriendsCollectionService;

@Path("/friends")
public class FriendsController {
	
	FriendsCollectionService friendsCollectionService = new FriendsCollectionService();
	
	//CRUD for friends
	
	//get the list of all friends
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Friend> getAllFriends(){
		System.out.println("Friends");
		List<Friend> allfriends = friendsCollectionService.getAllFriends();
		
		for(Friend f:allfriends){
			System.out.println(f.id + " " + f.name);
		}
		
		return allfriends;
	}
	
	//get the name of friend by id
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend getFriendById(@PathParam("id") int id){
		Friend f = friendsCollectionService.getFriendbyId(id);
		return f;
	}
	
	//update the friend
	@POST
	@Path("/update")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend updateFriend(Friend friend){
		Friend f = friendsCollectionService.updateFriend(friend);
		return f;
	}
	
	//delete the friend
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Friend deleteFriend(@PathParam("id") int id){
		Friend f = friendsCollectionService.deleteFriend(id);
		return f;
	}

}