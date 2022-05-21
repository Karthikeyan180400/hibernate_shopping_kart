package com.ty.hibernate_shopping.controller;

import com.ty.hibernate_shopping.dto.User;
import com.ty.hibernate_shopping.services.UserServices;

public class DeleterUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = userServices.deleteUser(5);
		if (user != null) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not deleted");
		}

	}

}
