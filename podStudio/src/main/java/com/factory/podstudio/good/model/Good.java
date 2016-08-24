package com.factory.podstudio.good.model;

public class Good {

	// 좋아요 번호
	private String goodNo;
	// 팟캐스트 번호
	private String podCastNo;
	// 에피소드 번호
	private String episodeNo;
	// 회원번호
	private String userNo;
	// 좋아요 누른 횟수
	private String goodCount;
	// 좋아요 등록시간
	private String goodDate;
	// IP 주소
	private String goodipAddress;
	// 좋아요 순위
	private String goodRank;
	
	public String getGoodNo() {
		return goodNo;
	}
	public void setGoodNo(String goodNo) {
		this.goodNo = goodNo;
	}
	public String getPodCastNo() {
		return podCastNo;
	}
	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}
	public String getEpisodeNo() {
		return episodeNo;
	}
	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getGoodCount() {
		return goodCount;
	}
	public void setGoodCount(String goodCount) {
		this.goodCount = goodCount;
	}
	public String getGoodDate() {
		return goodDate;
	}
	public void setGoodDate(String goodDate) {
		this.goodDate = goodDate;
	}
	public String getGoodipAddress() {
		return goodipAddress;
	}
	public void setGoodipAddress(String goodipAddress) {
		this.goodipAddress = goodipAddress;
	}
	public String getGoodRank() {
		return goodRank;
	}
	public void setGoodRank(String goodRank) {
		this.goodRank = goodRank;
	}
	@Override
	public String toString() {
		return "Good [goodNo=" + goodNo + ", podCastNo=" + podCastNo + ", episodeNo=" + episodeNo + ", userNo=" + userNo
				+ ", goodCount=" + goodCount + ", goodDate=" + goodDate + ", goodipAddress=" + goodipAddress
				+ ", goodRank=" + goodRank + "]";
	}
}
