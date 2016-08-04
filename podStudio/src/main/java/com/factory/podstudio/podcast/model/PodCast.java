package com.factory.podstudio.podcast.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.user.model.User;

public class PodCast {

	// ��ĳ��Ʈ��ȣ
	private String podCastNo;
	// ȸ����ȣ
	private User user;
	// ī�װ���ȣ1
	private Category categoryNo1;
	// ī�װ���ȣ2
	private Category categoryNo2;
	// ��ĳ��Ʈ ����
	private String podCastTitle;
	// ��ĳ��Ʈ ������
	private String podCastSubTitle;
	// ������۰��ɿ���
	private String podCastPublicBroadCast;

	public String getPodCastNo() {
		return podCastNo;
	}

	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Category getCategoryNo1() {
		return categoryNo1;
	}

	public void setCategoryNo1(Category categoryNo1) {
		this.categoryNo1 = categoryNo1;
	}

	public Category getCategoryNo2() {
		return categoryNo2;
	}

	public void setCategoryNo2(Category categoryNo2) {
		this.categoryNo2 = categoryNo2;
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
		return "PodCast [podCastNo=" + podCastNo + ", user=" + user + ", categoryNo1=" + categoryNo1 + ", categoryNo2="
				+ categoryNo2 + ", podCastTitle=" + podCastTitle + ", podCastSubTitle=" + podCastSubTitle
				+ ", podCastPublicBroadCast=" + podCastPublicBroadCast + "]";
	}

}
