package com.t3g.cookbooks.session;

import java.sql.SQLException;
import java.util.List;

import com.t3g.cookbooks.db.Database;
import com.t3g.cookbooks.db.entities.User;
import com.t3g.cookbooks.util.FieldValidator;

public class SessionManager {
	private static boolean signedIn = false;
	private static User user = null;	
	
	public static boolean signIn(String username, String password) {
		if (signedIn) {
			System.out.println("Already signed in.");
			return false;
		}
		
		if (!FieldValidator.isEmail(username)) {
			System.out.println("Wrong username.");
			return false;
		}

		User userForQuery = new User();
		userForQuery.setEmail(username);
		List<User> userList = null;
		try {
			userList = Database.getUserDao().queryForMatching(userForQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		if (userList == null) {
			System.out.println("Database problem, userList is null.");
			return false;
		} else if (userList.isEmpty()) {
			System.out.println("User doesn't exist, userList is empty.");
			return false;
		} else if (userList.size() > 1) {
			System.out.println("Database problem, repeated username.");
			return false;
		} else if (userList.size() == 1) {
			if (!userList.get(0).getPassword().equals(password)){
				System.out.println("Invalid user and password");
				return false;
			}
			else {
				user = userList.get(0);
				signedIn = true;
				return true;
			}
		}

		System.out.println("Unknown sign in error.");		
		return false;
	}
	
	public static void signOut() {
		signedIn = false;
		user = null;
	}
	
	public static boolean isSignedIn() {
		return signedIn;
	}
	
	public static User getUser() {
		return user;
	}
}
