package com.factory.podstudio.listen.model;

public class Listen {
	// 청취수순위번호
	private String listenNo;
	// 팟캐스트번호
	private String podCastNo;
	// 팟캐스트 제목
	private String podCastTitle;
	// 에피소드번호
	private String episodeNo;
	// 회원번호
	private String userNo;
	// 구분 / 스트리밍 / 다운로드
	private String listenPart;
	// 청취시간
	private String listenDate;
	//
	private String listenRank;
	
	public String getListenNo() {
		return listenNo;
	}
	public void setListenNo(String listenNo) {
		this.listenNo = listenNo;
	}
	public String getPodCastNo() {
		return podCastNo;
	}
	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}
	public String getPodCastTitle() {
		return podCastTitle;
	}
	public void setPodCastTitle(String podCastTitle) {
		this.podCastTitle = podCastTitle;
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
	public String getListenPart() {
		return listenPart;
	}
	public void setListenPart(String listenPart) {
		this.listenPart = listenPart;
	}
	public String getListenDate() {
		return listenDate;
	}
	public void setListenDate(String listenDate) {
		this.listenDate = listenDate;
	}
	public String getListenRank() {
		return listenRank;
	}
	public void setListenRank(String listenRank) {
		this.listenRank = listenRank;
	}
	@Override
	public String toString() {
		return "Listen [listenNo=" + listenNo + ", podCastNo=" + podCastNo + ", episodeNo=" + episodeNo + ", userNo="
				+ userNo + ", listenPart=" + listenPart + ", listenDate=" + listenDate + ", listenRank=" + listenRank
				+ "]";
	}
}
