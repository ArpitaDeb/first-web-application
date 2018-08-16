package com.comit;

public class UserValidationService {
	public boolean isUserValid(String username, String password){
		if (username != null && username.equals("Kyle")
				&& password!= null && password.equals("abc123")){
			return true;
		}
		return false;
	}
}
