package com.dto;

import java.util.Date;

public class AdminLogDTO {
	private long id;
	private long adminUserId;
	private String adminUserName;
	private String adminPhoneNum;
	private Date createTime;
	private String message;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAdminUserId() {
		return adminUserId;
	}
	public void setAdminUserId(long adminUserId) {
		this.adminUserId = adminUserId;
	}
	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public String getAdminPhoneNum() {
		return adminPhoneNum;
	}
	public void setAdminPhoneNum(String adminPhoneNum) {
		this.adminPhoneNum = adminPhoneNum;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
