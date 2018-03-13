package com.dto;

import java.util.Date;

public class HouseAppointmentDTO {
	private long id;//绉熸埧棰勭害id
	private Long userId;//鐢ㄦ埛id,鍙互涓簄ull
	private String Name;//瀹㈡埛濮撳悕
	private String phoneNum;//瀹㈡埛鎵嬫満鍙�
	
	private Date visitDate;//鐪嬫埧鏃堕棿
	private long houseId;//鎴垮瓙id
	private Date createDateTime;//鍒涘缓鏃堕棿
	private String status;//棰勭害鐘舵��
	private long followAdminUserId;//璺熻繘鍛樺伐id
	private String followAdminName;//璺熻繘鍛樺伐濮撳悕
	private Date followDateTime;//璺熻繘鏃堕棿
	
	private String regionName;//閭ｄ釜鍖虹殑
	private String communityName;//灏忓尯鍚嶅瓧
	
	public String getRegionName() {
		return regionName;
	}
	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Date getVisitDate() {
		return visitDate;
	}
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}
	public long getHouseId() {
		return houseId;
	}
	public void setHouseId(long houseId) {
		this.houseId = houseId;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getFollowAdminUserId() {
		return followAdminUserId;
	}
	public void setFollowAdminUserId(long followAdminUserId) {
		this.followAdminUserId = followAdminUserId;
	}
	public String getFollowAdminName() {
		return followAdminName;
	}
	public void setFollowAdminName(String followAdminName) {
		this.followAdminName = followAdminName;
	}
	public Date getFollowDateTime() {
		return followDateTime;
	}
	public void setFollowDateTime(Date followDateTime) {
		this.followDateTime = followDateTime;
	}
}
