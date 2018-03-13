package com.dto;

import java.util.Date;

public class HouseDTO {
	private long id;
	private long regionId;//城区id
	private String regionName;//城区名字
	private long cityId;//城市id
	private String cityName;//城市名字
	private long communityId;//小区id
	private String communityName;//小区名字
	private String communityLocation;//小区位置
	private String communityTraffic;//交通
	private Integer communityBuiltYear;//建筑时间

	private long roomTypeId;//户型：三室一厅
	private String roomTypeName;//户型名
	private String address;//地址
	private int monthRent;//月租
	private long statusId;//房子状态的id
	private String statusName;//状态名
	private double area;//房屋面积
	
	private long decorateStatusId;//装修id
	private String decorateStatusName;//装修类型
	private int totalFloorCount;//最高楼层
	private int floorIndex;//房屋所在楼层
	private long typeId;//房屋类别：合租，整租
	private String typeName;
	
	private String direction;//朝向
	private Date lookableDateTime;//可看房时间
	private Date checkInDateTime;//可入住时间
	
	private String ownerName;//房主姓名
	private String ownerPhoneNum;//房主电话
	private Date createDateTime;//创建时间
	private String description;//房屋描述
	private boolean isDeleted;//软删除
	private String firstThumbUrl;//第一张略缩图地址
	private long[] attachmentIds;//房屋设施id
	
	private boolean isRecommend;//是否推荐房源
	private Date recommendTime;//推荐时间
	
	
	public boolean isRecommend() {
		return isRecommend;
	}
	public void setRecommend(boolean isRecommend) {
		this.isRecommend = isRecommend;
	}
	public Date getRecommendTime() {
		return recommendTime;
	}
	public void setRecommendTime(Date recommendTime) {
		this.recommendTime = recommendTime;
	}
	public String getCommunityTraffic() {
		return communityTraffic;
	}
	public void setCommunityTraffic(String communityTraffic) {
		this.communityTraffic = communityTraffic;
	}
	public Integer getCommunityBuiltYear() {
		return communityBuiltYear;
	}
	public void setCommunityBuiltYear(Integer communityBuiltYear) {
		this.communityBuiltYear = communityBuiltYear;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public String getCommunityLocation() {
		return communityLocation;
	}
	public void setCommunityLocation(String communityLocation) {
		this.communityLocation = communityLocation;
	}
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMonthRent() {
		return monthRent;
	}
	public void setMonthRent(int monthRent) {
		this.monthRent = monthRent;
	}
	public long getStatusId() {
		return statusId;
	}
	public void setStatusId(long statusId) {
		this.statusId = statusId;
	}
	public String getStatusName() {
		return statusName;
	}
	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public long getDecorateStatusId() {
		return decorateStatusId;
	}
	public void setDecorateStatusId(long decorateStatusId) {
		this.decorateStatusId = decorateStatusId;
	}
	public String getDecorateStatusName() {
		return decorateStatusName;
	}
	public void setDecorateStatusName(String decorateStatusName) {
		this.decorateStatusName = decorateStatusName;
	}
	public int getTotalFloorCount() {
		return totalFloorCount;
	}
	public void setTotalFloorCount(int totalFloorCount) {
		this.totalFloorCount = totalFloorCount;
	}
	public int getFloorIndex() {
		return floorIndex;
	}
	public void setFloorIndex(int floorIndex) {
		this.floorIndex = floorIndex;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public Date getLookableDateTime() {
		return lookableDateTime;
	}
	public void setLookableDateTime(Date lookableDateTime) {
		this.lookableDateTime = lookableDateTime;
	}
	public Date getCheckInDateTime() {
		return checkInDateTime;
	}
	public void setCheckInDateTime(Date checkInDateTime) {
		this.checkInDateTime = checkInDateTime;
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
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getFirstThumbUrl() {
		return firstThumbUrl;
	}
	public void setFirstThumbUrl(String firstThumbUrl) {
		this.firstThumbUrl = firstThumbUrl;
	}
	public long[] getAttachmentIds() {
		return attachmentIds;
	}
	public void setAttachmentIds(long[] attachmentIds) {
		this.attachmentIds = attachmentIds;
	}
	
}
