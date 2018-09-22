package com.winds.admin.core.model.system;

import java.util.Date;

/**
* @author   :WindsJune/博客园：WindsJune
* @version  :1.1.0
* @date     :2018年9月19日 上午10:12:19
* @comments :session对象
*/

public class User {
	
	private String sessionId;
	
	private String userName;
	
	private String passWord;
	
	private String userCode;
	
	private Date createTime;
	
	private String comments;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
	
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "User [sessionId=" + sessionId + ", userName=" + userName + ", passWord=" + passWord + ", userCode="
				+ userCode + ", createTime=" + createTime + ", comments=" + comments + "]";
	}

}
