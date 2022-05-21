package com.ty.hibernate_shopping.controller;

import com.ty.hibernate_shopping.dto.User;
import com.ty.hibernate_shopping.services.UserServices;

public class SaveUserController {

	public static void main(String[] args) {
		UserServices userServices = new UserServices();
		User user = new User();
		user.setName("Nishanth");
		user.setEmail("nishu@mail.com");
		user.setPhone(809889022);
		user.setPassword("131313");
		userServices.saveUser(user);

	}

}
