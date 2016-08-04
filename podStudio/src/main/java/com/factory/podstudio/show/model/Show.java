package com.factory.podstudio.show.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class Show {
	// 공연번호
	private String showNo;
	// 팟캐스트번호
	private PodCast podCast;
	// 카테고리번호 / 팟캐스트
	private Category category;
	// 회원번호
	private User user;
	// 단가표번호
	private Cost cost;
	// 공연제목
	private String showName;
	// 공연일자
	private String showDate;
	// 공연 기간
	private String showPeriod;
	// 공연 장소
	private String showPlace;
	// 공연 등록일자
	private String showRegistrationDate;
	// 티켓가격 / 단순히 정보만 제공
	private int showTicketPrice;
	// 출연진
	private String showCast;
	// 연락방법
	private String showContent;

	public String getShowNo() {
		return showNo;
	}

	public void setShowNo(String showNo) {
		this.showNo = showNo;
	}

	public PodCast getPodCast() {
		return podCast;
	}

	public void setPodCast(PodCast podCast) {
		this.podCast = podCast;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public String getShowName() {
		return showName;
	}

	public void setShowName(String showName) {
		this.showName = showName;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getShowPeriod() {
		return showPeriod;
	}

	public void setShowPeriod(String showPeriod) {
		this.showPeriod = showPeriod;
	}

	public String getShowPlace() {
		return showPlace;
	}

	public void setShowPlace(String showPlace) {
		this.showPlace = showPlace;
	}

	public String getShowRegistrationDate() {
		return showRegistrationDate;
	}

	public void setShowRegistrationDate(String showRegistrationDate) {
		this.showRegistrationDate = showRegistrationDate;
	}

	public int getShowTicketPrice() {
		return showTicketPrice;
	}

	public void setShowTicketPrice(int showTicketPrice) {
		this.showTicketPrice = showTicketPrice;
	}

	public String getShowCast() {
		return showCast;
	}

	public void setShowCast(String showCast) {
		this.showCast = showCast;
	}

	public String getShowContent() {
		return showContent;
	}

	public void setShowContent(String showContent) {
		this.showContent = showContent;
	}

	@Override
	public String toString() {
		return "Show [showNo=" + showNo + ", podCast=" + podCast + ", category=" + category + ", user=" + user
				+ ", cost=" + cost + ", showName=" + showName + ", showDate=" + showDate + ", showPeriod=" + showPeriod
				+ ", showPlace=" + showPlace + ", showRegistrationDate=" + showRegistrationDate + ", showTicketPrice="
				+ showTicketPrice + ", showCast=" + showCast + ", showContent=" + showContent + "]";
	}

}
