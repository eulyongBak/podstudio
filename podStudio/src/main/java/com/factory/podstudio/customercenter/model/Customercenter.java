package com.factory.podstudio.customercenter.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.user.model.User;

public class Customercenter {

	// �����͹�ȣ
	private String customercenterNo;
	// ȸ����ȣ
	private User user;
	// ī�װ���ȣ / ���� ī�װ���ȣ�� ������
	private Category category;
	// ����
	private String customercenterTitle;
	// ����
	private String customercenterContent;
	// �ۼ�����
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
