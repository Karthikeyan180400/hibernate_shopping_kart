package com.ty.hibernate_shopping.controller;

import com.ty.hibernate_shopping.dto.User;
import com.ty.hibernate_shopping.services.UserServices;

public class GetUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = userServices.getUserById(1);
		
		if(user != null) {
			System.out.println("Name is "+user.getName());
			System.out.println("Email is "+user.getEmail());
			System.out.println("Phone num is "+user.getPhone());
		} else {
			System.out.println("No user found for Given Id");
		}

	}

}
