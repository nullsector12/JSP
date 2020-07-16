package member.model;

public class LoginBean {
	
	private String uid;
	private String upw;
	private int result;
	public String getUserId () {
		return uid;
	}
	
	
	public LoginBean () {}
	
	public LoginBean (String uid, String upw) {
		this.uid = uid;
		this.upw = upw;		
	}
	


	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the upw
	 */
	public String getUpw() {
		return upw;
	}

	/**
	 * @param upw the upw to set
	 */
	public void setUpw(String upw) {
		this.upw = upw;
	}

	/**
	 * @return the result
	 */
	public int getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(int result) {
		this.result = result;
	}
	
	
}
