package guestBook.model;

public class Message {
	
	private int mid;
	private String uname;
	private String upw;
	private String message;
	
	public Message() {
		
	}
	
	public Message(int mid, String uname, String upw, String message) {
		this.mid = mid;
		this.uname = uname;
		this.upw = upw;
		this.message = message;
	}

	/**
	 * @return the mid
	 */
	public int getMid() {
		return mid;
	}

	/**
	 * @param mid the mid to set
	 */
	public void setMid(int mid) {
		this.mid = mid;
	}

	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}

	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
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
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [mid=" + mid + ", uname=" + uname + ", upw=" + upw + ", message=" + message + "]";
	}
	

}
