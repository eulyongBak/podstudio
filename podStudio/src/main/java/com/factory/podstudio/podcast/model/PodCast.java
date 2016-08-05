package com.factory.podstudio.podcast.model;

public class PodCast {

	// 팟캐스트번호
	private String podCastNo;
	// 회원번호
	private String userNo;
	// 카테고리번호1
	private String categoryNo1;
	// 카테고리번호2
	private String categoryNo2;
	// 카테고리 제목
	private String categoryMain;
	// 팟캐스트 제목
	private String podCastTitle;
	// 팟캐스트 부제목
	private String podCastSubTitle;
	// 공개방송가능여부
	private String podCastPublicBroadCast;

	public String getPodCastNo() {
		return podCastNo;
	}

	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getCategoryNo1() {
		return categoryNo1;
	}

	public void setCategoryNo1(String categoryNo1) {
		this.categoryNo1 = categoryNo1;
	}

	public String getCategoryNo2() {
		return categoryNo2;
	}

	public void setCategoryNo2(String categoryNo2) {
		this.categoryNo2 = categoryNo2;
	}

	public String getCategoryMain() {
		return categoryMain;
	}

	public void setCategoryMain(String categoryMain) {
		this.categoryMain = categoryMain;
	}

	public String getPodCastTitle() {
		return podCastTitle;
	}

	public void setPodCastTitle(String podCastTitle) {
		this.podCastTitle = podCastTitle;
	}

	public String getPodCastSubTitle() {
		return podCastSubTitle;
	}

	public void setPodCastSubTitle(String podCastSubTitle) {
		this.podCastSubTitle = podCastSubTitle;
	}

	public String getPodCastPublicBroadCast() {
		return podCastPublicBroadCast;
	}

	public void setPodCastPublicBroadCast(String podCastPublicBroadCast) {
		this.podCastPublicBroadCast = podCastPublicBroadCast;
	}

	@Override
	public String toString() {
		return "PodCast [podCastNo=" + podCastNo + ", userNo=" + userNo + ", categoryNo1=" + categoryNo1
				+ ", categoryNo2=" + categoryNo2 + ", categoryMain=" + categoryMain + ", podCastTitle=" + podCastTitle
				+ ", podCastSubTitle=" + podCastSubTitle + ", podCastPublicBroadCast=" + podCastPublicBroadCast + "]";
	}

}
