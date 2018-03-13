package com.dto;

import java.util.Date;

public class EntrustAdminUserDTO {
	private long id;
	private String ownerName;
	private String ownerPhoneNum;
	private Date RentHouseDate;
	private long OwnerEntrustId;
	private long FollowAdminUserId;
	private Date FollowDateTime;
	private String status;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerPhoneNum() {
		return ownerPhoneNum;
	}
	public void setOwnerPhoneNum(String ownerPhoneNum) {
		this.ownerPhoneNum = ownerPhoneNum;
	}
	public Date getRentHouseDate() {
		return RentHouseDate;
	}
	public void setRentHouseDate(Date rentHouseDate) {
		RentHouseDate = rentHouseDate;
	}
	public long getOwnerEntrustId() {
		return OwnerEntrustId;
	}
	public void setOwnerEntrustId(long ownerEntrustId) {
		OwnerEntrustId = ownerEntrustId;
	}
	public long getFollowAdminUserId() {
		return FollowAdminUserId;
	}
	public void setFollowAdminUserId(long followAdminUserId) {
		FollowAdminUserId = followAdminUserId;
	}
	public Date getFollowDateTime() {
		return FollowDateTime;
	}
	public void setFollowDateTime(Date followDateTime) {
		FollowDateTime = followDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
