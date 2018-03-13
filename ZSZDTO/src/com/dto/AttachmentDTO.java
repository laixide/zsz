package com.dto;

public class AttachmentDTO {
	private long id;
	private String name;
	private String IconName;
	private boolean isDeleted;
	
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
	public String getIconName() {
		return IconName;
	}
	public void setIconName(String iconName) {
		IconName = iconName;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}
