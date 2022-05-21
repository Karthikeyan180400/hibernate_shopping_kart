package com.ty.hibernate_shopping.controller;

import java.util.List;

import com.ty.hibernate_shopping.dto.User;
import com.ty.hibernate_shopping.services.UserServices;

public class GetAllUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		List<User> list = userServices.getAllUser();

		if (list.size() > 0) {
			for (User user : list) {
				System.out.println("Id is " + user.getId());
				System.out.println("Name is " + user.getName());
				System.out.println("Email is " + user.getEmail());
				System.out.println("Phone is " + user.getPhone());
				System.out.println("-------------------------");

			}
		} else {
			System.out.println("No users found");
		}

	}

}
