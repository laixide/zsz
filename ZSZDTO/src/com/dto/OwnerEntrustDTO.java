package com.dto;

import java.util.Date;

public class OwnerEntrustDTO {
	private long id;
	private String ownerName;
	private String phoneNum;
	private Date rentHouseDate;
	private long houseTypeId;
	private String houseTypeName;
	
	private long roomTypeId;
	private String roomTypeName;
	
	private long communityId;
	private String communityName;
	private long cityId;
	private String cityName;
	private long regionId;
	private String regionName;
	private int rent;
	private Date createDateTime;
	private Long followAdminUserId;
	private String adminUserName;
	private Date followDateTime;
	private String status;
	
	public long getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(long roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public String getRoomTypeName() {
		return roomTypeName;
	}
	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public String getAdminUserName() {
		return adminUserName;
	}
	public void setAdminUserName(String adminUserName) {
		this.adminUserName = adminUserName;
	}
	public long getFollowAdminUserId() {
		return followAdminUserId;
	}
	public void setFollowAdminUserId(Long followAdminUserId) {
		this.followAdminUserId = followAdminUserId;
	}
	public Date getFollowDateTime() {
		return followDateTime;
	}
	public void setFollowDateTime(Date followDateTime) {
		this.followDateTime = followDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
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
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getRentHouseDate() {
		return rentHouseDate;
	}
	public void setRentHouseDate(Date rentHouseDate) {
		this.rentHouseDate = rentHouseDate;
	}
	public long getHouseTypeId() {
		return houseTypeId;
	}
	public void setHouseTypeId(long houseTypeId) {
		this.houseTypeId = houseTypeId;
	}
	
	public String getHouseTypeName() {
		return houseTypeName;
	}
	public void setHouseTypeName(String houseTypeName) {
		this.houseTypeName = houseTypeName;
	}
	public long getCommunityId() {
		return communityId;
	}
	public void setCommunityId(long communityId) {
		this.communityId = communityId;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public long getCityId() {
		return cityId;
	}
	public void setCityId(long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getRegionId() {
		return regionId;
	}
	public void setRegionId(long regionId) {
		this.regionId = regionId;
	}
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
		
}
