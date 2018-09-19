package com.winds.admin.model.login;

/**
* @author   :WindsJune/博客园：WindsJune
* @version  :1.1.0
* @date     :2018年9月19日 上午10:12:19
* @comments :session对象
*/

public class User {
	
	private String sessionId;
	
	private String userName;
	
	private String userPass;
	
	private String userCode;
	
	private String comments;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getUserCode() {
		return userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@Override
	public String toString() {
		return "User [sessionId=" + sessionId + ", userName=" + userName + ", userPass=" + userPass + ", userCode="
				+ userCode + ", comments=" + comments + "]";
	}
	
	
	
}
