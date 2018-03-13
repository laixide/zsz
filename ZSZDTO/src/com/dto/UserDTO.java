package com.dto;

import java.util.Date;

public class UserDTO {
	private long id;
	//private String Name;
	private String phoneNum;
	private String passwordHash;
	private String passwordSalt;
	private Date createDateTime;
	private int loginErrorTimes;
	private Date lastloginErrorDateTime;
	private Long cityId;
	//private String cityName;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	/*public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}*/
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
	public String getPasswordSalt() {
		return passwordSalt;
	}
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public int getLoginErrorTimes() {
		return loginErrorTimes;
	}
	public void setLoginErrorTimes(int loginErrorTimes) {
		this.loginErrorTimes = loginErrorTimes;
	}
	public Date getLastloginErrorDateTime() {
		return lastloginErrorDateTime;
	}
	public void setLastloginErrorDateTime(Date lastloginErrorDateTime) {
		this.lastloginErrorDateTime = lastloginErrorDateTime;
	}
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	/*public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}*/
}
