package model;

public class LoginInfo {
	
	private String uid;
	private String name;
	
	public LoginInfo() {
		uid= "cool";
		name ="����";
	}
	
	public LoginInfo(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}


	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "LoginInfo [uid=" + uid + ", name=" + name + "]";
	}

	
	
}
