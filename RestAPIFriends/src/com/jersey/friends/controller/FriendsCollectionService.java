package com.jersey.friends.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jersey.friends.controller.Friend;

public class FriendsCollectionService {
	
	
	static HashMap<Integer, Friend> friendsMap = getFriendsMap();
	
	public FriendsCollectionService() {
		// TODO Auto-generated constructor stub
		super();
		
		Friend f1 = new Friend(1, "Mahendra", "Palanpur");
		Friend f2 = new Friend(2,"Manoj", "Abu");
		Friend f3 = new Friend(3, "Yuko", "Tokyo");
		Friend f4 = new Friend(4, "Naren", "Jodhpur");
		Friend f5 = new Friend(5, "Adi", "Chennai");
		
		friendsMap = new HashMap<Integer, Friend>();
		
		friendsMap.put(1, f1);
		friendsMap.put(2, f2);
		friendsMap.put(3, f3);
		friendsMap.put(4, f4);
		friendsMap.put(5, f5);
	}

	public List<Friend> getAllFriends() {
		// TODO Auto-generated method stub		
		List<Friend> friends = new ArrayList<Friend>(friendsMap.values());
		return friends;
		
	}
	
	public static HashMap<Integer, Friend> getFriendsMap(){
		return friendsMap;
	}
	
	public Friend getFriendbyId(int myId)
	{
		Friend f = friendsMap.get(myId);
		System.out.println(f.id);
		return f;
	}
	
	public Friend updateFriend(Friend friend)
	{
		Friend f =  friendsMap.put(friend.getId(), friend);		 
		 System.out.println("updated: "+friend.location);
		 return f;
	}

	public Friend deleteFriend(int id) {
		// TODO Auto-generated method stub
		Friend f = friendsMap.remove(id);
		return f;
	}
	
	

}