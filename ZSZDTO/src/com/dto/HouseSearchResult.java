package com.dto;

public class HouseSearchResult {
	private long totalCount;
	private HouseDTO[] result;
	public long getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
	}
	public HouseDTO[] getResult() {
		return result;
	}
	public void setResult(HouseDTO[] result) {
		this.result = result;
	}
}
