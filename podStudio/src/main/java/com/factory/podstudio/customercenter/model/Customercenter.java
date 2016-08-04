package com.factory.podstudio.customercenter.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.user.model.User;

public class Customercenter {

	// 고객센터번호
	private String customercenterNo;
	// 회원번호
	private User user;
	// 카테고리번호 / 문의 카테고리번호를 가져옴
	private Category category;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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
		return "Customercenter [customercenterNo=" + customercenterNo + ", user=" + user + ", category=" + category
				+ ", customercenterTitle=" + customercenterTitle + ", customercenterContent=" + customercenterContent
				+ ", customercenterDate=" + customercenterDate + "]";
	}

}
