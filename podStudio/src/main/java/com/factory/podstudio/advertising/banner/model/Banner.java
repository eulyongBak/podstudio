package com.factory.podstudio.advertising.banner.model;

public class Banner {
	// 배너광고 번호
	private String bannerNo;
	// 팟캐스트에서 번호를 가져온다
	private String podcastNo; 
	// 스튜디오 번호를 가져온다
	private String studioNo;
	// 공연번호를 가져온다
	private String showNo;
	// 단가표번호를 가져온다
	private String costNo;
	// 결제번호
	private String payNo;
	// 배너광고 제품명
	private String bannerProduct;
	// 배너광고 업체명
	private String bannerCompany;
	// 배너광고파일이름
	private String bannerFileName;
	// 배너광고 클릭수
	private String bannerCount;
	// 등록시간
	private String bannerDate;
	// 서비스 시작일
	private String bannerServiceStart;
	// 서비스 종료일
	private String bannerServiceEnd;
	// 서비스 상태 / 정상서비스 / 서비스 진행중 / 서비스 완료
	private String bannerStatus;

	public String getBannerNo() {
		return bannerNo;
	}

	public void setBannerNo(String bannerNo) {
		this.bannerNo = bannerNo;
	}

	public String getPodcastNo() {
		return podcastNo;
	}

	public void setPodcastNo(String podcastNo) {
		this.podcastNo = podcastNo;
	}

	public String getStudioNo() {
		return studioNo;
	}

	public void setStudioNo(String studioNo) {
		this.studioNo = studioNo;
	}

	public String getShowNo() {
		return showNo;
	}

	public void setShowNo(String showNo) {
		this.showNo = showNo;
	}

	public String getCostNo() {
		return costNo;
	}

	public void setCostNo(String costNo) {
		this.costNo = costNo;
	}

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
	}

	public String getBannerProduct() {
		return bannerProduct;
	}

	public void setBannerProduct(String bannerProduct) {
		this.bannerProduct = bannerProduct;
	}

	public String getBannerCompany() {
		return bannerCompany;
	}

	public void setBannerCompany(String bannerCompany) {
		this.bannerCompany = bannerCompany;
	}

	public String getBannerFileName() {
		return bannerFileName;
	}

	public void setBannerFileName(String bannerFileName) {
		this.bannerFileName = bannerFileName;
	}

	public String getBannerCount() {
		return bannerCount;
	}

	public void setBannerCount(String bannerCount) {
		this.bannerCount = bannerCount;
	}

	public String getBannerDate() {
		return bannerDate;
	}

	public void setBannerDate(String bannerDate) {
		this.bannerDate = bannerDate;
	}

	public String getBannerServiceStart() {
		return bannerServiceStart;
	}

	public void setBannerServiceStart(String bannerServiceStart) {
		this.bannerServiceStart = bannerServiceStart;
	}

	public String getBannerServiceEnd() {
		return bannerServiceEnd;
	}

	public void setBannerServiceEnd(String bannerServiceEnd) {
		this.bannerServiceEnd = bannerServiceEnd;
	}

	public String getBannerStatus() {
		return bannerStatus;
	}

	public void setBannerStatus(String bannerStatus) {
		this.bannerStatus = bannerStatus;
	}

	@Override
	public String toString() {
		return "Banner [bannerNo=" + bannerNo + ", podcastNo=" + podcastNo + ", studioNo=" + studioNo + ", showNo="
				+ showNo + ", costNo=" + costNo + ", payNo=" + payNo + ", bannerProduct=" + bannerProduct
				+ ", bannerCompany=" + bannerCompany + ", bannerFileName=" + bannerFileName + ", bannerCount="
				+ bannerCount + ", bannerDate=" + bannerDate + ", bannerServiceStart=" + bannerServiceStart
				+ ", bannerServiceEnd=" + bannerServiceEnd + ", bannerStatus=" + bannerStatus + "]";
	}
}
