package com.ty.hibernate_shopping.controller;

import com.ty.hibernate_shopping.dto.User;
import com.ty.hibernate_shopping.services.UserServices;

public class UpdateUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = new User();
		user.setId(3);
		user.setEmail("nishanth@mail.com");

		User user1 = userServices.updateUser(user);
		if(user1 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
