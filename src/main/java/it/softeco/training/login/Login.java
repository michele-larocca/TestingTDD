package it.softeco.training.login;

import javax.inject.Inject;

public class Login {

	@Inject
	User user;
	
	public Boolean isUserNull() {
		return user == null;
	}
}
