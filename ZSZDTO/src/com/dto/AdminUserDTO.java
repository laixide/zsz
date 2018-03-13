package com.dto;

import java.util.Date;

public class AdminUserDTO {
	private long id;
	private String name;
	private String phoneNum;
	private String passwordHash;
	private String email;
	private long cityId;
	private int loginErrorTimes;
	private Date lastLoginErrorDateTime;
	private boolean isDeleted;
	private Date createDateTime;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public int getLoginErrorTimes() {
		return loginErrorTimes;
	}
	public void setLoginErrorTimes(int loginErrorTimes) {
		this.loginErrorTimes = loginErrorTimes;
	}
	public Date getLastLoginErrorDateTime() {
		return lastLoginErrorDateTime;
	}
	public void setLastLoginErrorDateTime(Date lastLoginErrorDateTime) {
		this.lastLoginErrorDateTime = lastLoginErrorDateTime;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	
	
}
