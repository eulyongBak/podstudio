package com.factory.podstudio.mypod.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class MyPod {
	// �����̻���ȣ
	private String MyPodNo;
	// ȸ����ȣ
	private User user;
	// ��ĳ��Ʈ��ȣ
	private PodCast podCast;
	// ���Ǽҵ��ȣ
	private Episode episode;
	// ī�װ���ȣ ????????????????????????
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
