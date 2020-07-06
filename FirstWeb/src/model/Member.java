package model;

public class Member {
	
	
	private String name;
	private String email;
	
	
	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	
	}
