package com.factory.podstudio.studio.model;

import com.factory.podstudio.advertising.banner.model.Banner;
import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.pay.model.Pay;
import com.factory.podstudio.user.model.User;

public class Studio {
	// ��Ʃ�����ȣ
	private String studioNo;
	// ȸ����ȣ
	private User user;
	// ������ȣ
	private Pay pay;
	// ī�װ���ȣ / ����
	private Category category;
	// ��Ʃ��������ȣ
	private StudioReservation studioreservation;
	// ��ʹ�ȣ
	private Banner banner;
	// ��Ʃ�����
	private String studioName;
	// ��Ʃ��� ����
	private String studioContent;
	// ��Ʃ��� �̹���
	private String studioImage;
	// ���� ���ɰ���
	private String studioEdit;
	// ��
	private int studioFeedback;

	public String getStudioNo() {
		return studioNo;
	}

	public void setStudioNo(String studioNo) {
		this.studioNo = studioNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public StudioReservation getStudioreservation() {
		return studioreservation;
	}

	public void setStudioreservation(StudioReservation studioreservation) {
		this.studioreservation = studioreservation;
	}

	public Banner getBanner() {
		return banner;
	}

	public void setBanner(Banner banner) {
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
		return "Studio [studioNo=" + studioNo + ", user=" + user + ", pay=" + pay + ", category=" + category
				+ ", studioreservation=" + studioreservation + ", banner=" + banner + ", studioName=" + studioName
				+ ", studioContent=" + studioContent + ", studioImage=" + studioImage + ", studioEdit=" + studioEdit
				+ ", studioFeedback=" + studioFeedback + "]";
	}

}
