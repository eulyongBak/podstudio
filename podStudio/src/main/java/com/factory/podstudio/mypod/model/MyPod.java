package com.factory.podstudio.mypod.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class MyPod {
	// 마이팟빵번호
	private String MyPodNo;
	// 회원번호
	private User user;
	// 팟캐스트번호
	private PodCast podCast;
	// 에피소드번호
	private Episode episode;
	// 카테고리번호 ????????????????????????
	private Category category;

	public String getMyPodNo() {
		return MyPodNo;
	}

	public void setMyPodNo(String myPodNo) {
		MyPodNo = myPodNo;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PodCast getPodCast() {
		return podCast;
	}

	public void setPodCast(PodCast podCast) {
		this.podCast = podCast;
	}

	public Episode getEpisode() {
		return episode;
	}

	public void setEpisode(Episode episode) {
		this.episode = episode;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "MyPod [MyPodNo=" + MyPodNo + ", user=" + user + ", podCast=" + podCast + ", episode=" + episode
				+ ", category=" + category + "]";
	}

}
