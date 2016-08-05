package com.factory.podstudio.customercenter.model;


public class Customercenter {

	// 고객센터번호
	private String customercenterNo;
	// 회원번호
	private String userNo;
	// 유저 닉네임
	private String userNickname;
	// 카테고리번호 / 문의 카테고리번호를 가져옴
	private String categoryNo;
	// 카테고리메인 / 문의 내용이 무엇인지 가져옴
	private String categorySub;
	// 제목
	private String customercenterTitle;
	// 내용
	private String customercenterContent;
	// 작성일자
	private String customercenterDate;

	public String getCustomercenterNo() {
		return customercenterNo;
	}

	public void setCustomercenterNo(String customercenterNo) {
		this.customercenterNo = customercenterNo;
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

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getCategorySub() {
		return categorySub;
	}

	public void setCategorySub(String categorySub) {
		this.categorySub = categorySub;
	}

	public String getCustomercenterTitle() {
		return customercenterTitle;
	}

	public void setCustomercenterTitle(String customercenterTitle) {
		this.customercenterTitle = customercenterTitle;
	}

	public String getCustomercenterContent() {
		return customercenterContent;
	}

	public void setCustomercenterContent(String customercenterContent) {
		this.customercenterContent = customercenterContent;
	}

	public String getCustomercenterDate() {
		return customercenterDate;
	}

	public void setCustomercenterDate(String customercenterDate) {
		this.customercenterDate = customercenterDate;
	}

	@Override
	public String toString() {
		return "Customercenter [customercenterNo=" + customercenterNo + ", userNo=" + userNo + ", userNickname="
				+ userNickname + ", categoryNo=" + categoryNo + ", categorySub=" + categorySub
				+ ", customercenterTitle=" + customercenterTitle + ", customercenterContent=" + customercenterContent
				+ ", customercenterDate=" + customercenterDate + "]";
	}

	


}
