package com.ty.hibernate_shopping.controller;

import com.ty.hibernate_shopping.services.UserServices;

public class ValidateUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		boolean res = userServices.validateUser("peter@mail.com", "131313");
		if (res) {
			System.out.println("Valid User");
		} else {
			System.out.println("email or password is incorrect");
		}

	}

}
