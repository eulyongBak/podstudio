package com.factory.podstudio.studio.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.user.model.User;

public class StudioReservation {
	// 스튜디오 예약번호
	private String studioReservationNo;
	// 회원번호
	private User user;
	// 스튜디오번호
	private Studio studio;
	// 카테고리번호 / 지역
	private Category category;
	// 스튜디오예약신청시간
	private String studioReservationTime;
	// 스튜디오 예약일자
	private String studioReservationDate;
	// 스튜디오 취소일자
	private String studioReservationCancelDate;
	// 스튜디오 취소사유
	private String studioReservationCancelReason;
	// 스튜디오 사용시작일자
	private String studioReservationStartDate;
	// 스튜디오 사용종료일자
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
