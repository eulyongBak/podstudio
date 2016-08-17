package com.factory.podstudio.mypod.model;


public class MyPod {
	// 마이팟빵번호
	private String myPodNo;
	// 회원번호
	private String userNo;
	// 팟캐스트번호
	private String podCastNo;
	// 팟캐스트제목
	private String PodCastTitle;
	// 에피소드 번호 
	private String episodeNo;
	// 에피소드 제목
	private String episodeTitle;
	// 카테고리번호
	private String categoryNo;
	// 카테고리 메인
	private String categoryMain;
	
	public String getMyPodNo() {
		return myPodNo;
	}
	public void setMyPodNo(String myPodNo) {
		this.myPodNo = myPodNo;
	}
	public String getUserNo() {
		return userNo;
	}
	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}
	public String getPodCastNo() {
		return podCastNo;
	}
	public void setPodCastNo(String podCastNo) {
		this.podCastNo = podCastNo;
	}
	public String getPodCastTitle() {
		return PodCastTitle;
	}
	public void setPodCastTitle(String podCastTitle) {
		PodCastTitle = podCastTitle;
	}
	public String getEpisodeNo() {
		return episodeNo;
	}
	public void setEpisodeNo(String episodeNo) {
		this.episodeNo = episodeNo;
	}
	public String getEpisodeTitle() {
		return episodeTitle;
	}
	public void setEpisodeTitle(String episodeTitle) {
		this.episodeTitle = episodeTitle;
	}
	public String getCategoryNo() {
		return categoryNo;
	}
	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}
	public String getCategoryMain() {
		return categoryMain;
	}
	public void setCategoryMain(String categoryMain) {
		this.categoryMain = categoryMain;
	}
	@Override
	public String toString() {
		return "MyPod [myPodNo=" + myPodNo + ", userNo=" + userNo + ", podCastNo=" + podCastNo + ", PodCastTitle="
				+ PodCastTitle + ", episodeNo=" + episodeNo + ", episodeTitle=" + episodeTitle + ", categoryNo="
				+ categoryNo + ", categoryMain=" + categoryMain + "]";
	}

	
}
