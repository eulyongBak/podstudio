package com.factory.podstudio.good.model;

import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class Good {

	// ���ƿ� ��ȣ
	private String goodNo;
	// ��ĳ��Ʈ ��ȣ
	private PodCast podCast;
	// ���Ǽҵ� ��ȣ
	private Episode episode;
	// ȸ����ȣ
	private User user;
	// ���ƿ� ���� Ƚ��
	private String goodCount;
	// ���ƿ� ��Ͻð�
	private String goodDate;
	// IP �ּ�
	private String goodipAddress;

	public String getGoodNo() {
		return goodNo;
	}

	public void setGoodNo(String goodNo) {
		this.goodNo = goodNo;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	@Override
	public String toString() {
		return "Good [goodNo=" + goodNo + ", podCast=" + podCast + ", episode=" + episode + ", user=" + user
				+ ", goodCount=" + goodCount + ", goodDate=" + goodDate + ", goodipAddress=" + goodipAddress + "]";
	}

}
