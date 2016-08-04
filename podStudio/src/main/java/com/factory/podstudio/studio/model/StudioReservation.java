package com.factory.podstudio.studio.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.user.model.User;

public class StudioReservation {
	// ��Ʃ��� �����ȣ
	private String studioReservationNo;
	// ȸ����ȣ
	private User user;
	// ��Ʃ�����ȣ
	private Studio studio;
	// ī�װ���ȣ / ����
	private Category category;
	// ��Ʃ��������û�ð�
	private String studioReservationTime;
	// ��Ʃ��� ��������
	private String studioReservationDate;
	// ��Ʃ��� �������
	private String studioReservationCancelDate;
	// ��Ʃ��� ��һ���
	private String studioReservationCancelReason;
	// ��Ʃ��� ����������
	private String studioReservationStartDate;
	// ��Ʃ��� �����������
	private String studioReservationEndDate;

	public String getStudioReservationNo() {
		return studioReservationNo;
	}

	public void setStudioReservationNo(String studioReservationNo) {
		this.studioReservationNo = studioReservationNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getStudioReservationTime() {
		return studioReservationTime;
	}

	public void setStudioReservationTime(String studioReservationTime) {
		this.studioReservationTime = studioReservationTime;
	}

	public String getStudioReservationDate() {
		return studioReservationDate;
	}

	public void setStudioReservationDate(String studioReservationDate) {
		this.studioReservationDate = studioReservationDate;
	}

	public String getStudioReservationCancelDate() {
		return studioReservationCancelDate;
	}

	public void setStudioReservationCancelDate(String studioReservationCancelDate) {
		this.studioReservationCancelDate = studioReservationCancelDate;
	}

	public String getStudioReservationCancelReason() {
		return studioReservationCancelReason;
	}

	public void setStudioReservationCancelReason(String studioReservationCancelReason) {
		this.studioReservationCancelReason = studioReservationCancelReason;
	}

	public String getStudioReservationStartDate() {
		return studioReservationStartDate;
	}

	public void setStudioReservationStartDate(String studioReservationStartDate) {
		this.studioReservationStartDate = studioReservationStartDate;
	}

	public String getStudioReservationEndDate() {
		return studioReservationEndDate;
	}

	public void setStudioReservationEndDate(String studioReservationEndDate) {
		this.studioReservationEndDate = studioReservationEndDate;
	}

	@Override
	public String toString() {
		return "StudioReservation [studioReservationNo=" + studioReservationNo + ", user=" + user + ", studio=" + studio
				+ ", category=" + category + ", studioReservationTime=" + studioReservationTime
				+ ", studioReservationDate=" + studioReservationDate + ", studioReservationCancelDate="
				+ studioReservationCancelDate + ", studioReservationCancelReason=" + studioReservationCancelReason
				+ ", studioReservationStartDate=" + studioReservationStartDate + ", studioReservationEndDate="
				+ studioReservationEndDate + "]";
	}

}
