package com.factory.podstudio.show.model;

public class Show {
	// 공연번호
	private String performanceNo;
	// 팟캐스트번호
	private String podCastNo;
	// 카테고리번호 / 팟캐스트
	private String categoryNo;
	// 회원번호
	private String userNo;
	// 단가표번호 / 광고신청시 결제하기위해서
	private String cost;
	// 공연제목
	private String performanceName;
	// 공연일자
	private String performanceDate;
	// 공연 기간
	private String performancePeriod;
	// 공연 장소
	private String performancePlace;
	// 공연 등록일자
	private String performanceRegistrationDate;
	// 티켓가격 / 단순히 정보만 제공
	private int performanceTicketPrice;
	// 출연진
	private String performanceCast;
	// 연락방법
	private String performanceContent;

	public String getPerformanceNo() {
		return performanceNo;
	}

	public void setPerformanceNo(String performanceNo) {
		this.performanceNo = performanceNo;
	}

	public String getPodCastNo() {
		return podCastNo;
	}

	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public String getPerformanceName() {
		return performanceName;
	}

	public void setPerformanceName(String performanceName) {
		this.performanceName = performanceName;
	}

	public String getPerformanceDate() {
		return performanceDate;
	}

	public void setPerformanceDate(String performanceDate) {
		this.performanceDate = performanceDate;
	}

	public String getPerformancePeriod() {
		return performancePeriod;
	}

	public void setPerformancePeriod(String performancePeriod) {
		this.performancePeriod = performancePeriod;
	}

	public String getPerformancePlace() {
		return performancePlace;
	}

	public void setPerformancePlace(String performancePlace) {
		this.performancePlace = performancePlace;
	}

	public String getPerformanceRegistrationDate() {
		return performanceRegistrationDate;
	}

	public void setPerformanceRegistrationDate(String performanceRegistrationDate) {
		this.performanceRegistrationDate = performanceRegistrationDate;
	}

	public int getPerformanceTicketPrice() {
		return performanceTicketPrice;
	}

	public void setPerformanceTicketPrice(int performanceTicketPrice) {
		this.performanceTicketPrice = performanceTicketPrice;
	}

	public String getPerformanceCast() {
		return performanceCast;
	}

	public void setPerformanceCast(String performanceCast) {
		this.performanceCast = performanceCast;
	}

	public String getPerformanceContent() {
		return performanceContent;
	}

	public void setPerformanceContent(String performanceContent) {
		this.performanceContent = performanceContent;
	}

	@Override
	public String toString() {
		return "Show [performanceNo=" + performanceNo + ", podCastNo=" + podCastNo + ", categoryNo=" + categoryNo
				+ ", userNo=" + userNo + ", cost=" + cost + ", performanceName=" + performanceName
				+ ", performanceDate=" + performanceDate + ", performancePeriod=" + performancePeriod
				+ ", performancePlace=" + performancePlace + ", performanceRegistrationDate="
				+ performanceRegistrationDate + ", performanceTicketPrice=" + performanceTicketPrice
				+ ", performanceCast=" + performanceCast + ", performanceContent=" + performanceContent + "]";
	}

}
