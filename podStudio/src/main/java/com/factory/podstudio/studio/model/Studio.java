package com.factory.podstudio.studio.model;

public class Studio {
	// 스튜디오번호
	private String studioNo;
	// 회원번호
	private String userNo;
	// 회원 닉네임
	private String userNickname;
	// 결제번호
	private String pay;
	// 카테고리번호 / 지역
	private String categoryNo;
	// 스튜디오예약번호
	private String studioreservation;
	// 배너번호
	private String banner;
	// 스튜디오명
	private String studioName;
	// 스튜디오 내용
	private String studioContent;
	// 스튜디오 이미지
	private String studioImage;
	// 편집 가능가부
	private String studioEdit;
	// 평가
	private int studioFeedback;
	
	public String getStudioNo() {
		return studioNo;
	}
	public void setStudioNo(String studioNo) {
		this.studioNo = studioNo;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	public String getcategoryNo() {
		return categoryNo;
	}
	public void setcategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getStudioreservation() {
		return studioreservation;
	}
	public void setStudioreservation(String studioreservation) {
		this.studioreservation = studioreservation;
	}
	public String getBanner() {
		return banner;
	}
	public void setBanner(String banner) {
		this.banner = banner;
	}
	public String getStudioName() {
		return studioName;
	}
	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}
	public String getStudioContent() {
		return studioContent;
	}
	public void setStudioContent(String studioContent) {
		this.studioContent = studioContent;
	}
	public String getStudioImage() {
		return studioImage;
	}
	public void setStudioImage(String studioImage) {
		this.studioImage = studioImage;
	}
	public String getStudioEdit() {
		return studioEdit;
	}
	public void setStudioEdit(String studioEdit) {
		this.studioEdit = studioEdit;
	}
	public int getStudioFeedback() {
		return studioFeedback;
	}
	public void setStudioFeedback(int studioFeedback) {
		this.studioFeedback = studioFeedback;
	}
	
	@Override
	public String toString() {
		return "Studio [studioNo=" + studioNo + ", userNo=" + userNo + ", userNickname=" + userNickname + ", pay=" + pay
				+ ", categoryNo=" + categoryNo + ", studioreservation=" + studioreservation + ", banner=" + banner
				+ ", studioName=" + studioName + ", studioContent=" + studioContent + ", studioImage=" + studioImage
				+ ", studioEdit=" + studioEdit + ", studioFeedback=" + studioFeedback + "]";
	}

	

}
