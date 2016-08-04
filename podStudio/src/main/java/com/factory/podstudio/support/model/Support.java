package com.factory.podstudio.support.model;

import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.episode.model.Episode;
import com.factory.podstudio.pay.model.Pay;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.user.model.User;

public class Support {
	// 후원번호
	private String supportNo;
	// 회원번호
	private User user;
	// 단가표 번호
	private Cost cost;
	// 결제번호
	private Pay pay;
	// 팟캐스트번호
	private PodCast podCast;
	// 에피소드 번호
	private Episode episode;
	// 후원결제일시
	private String supportDate;
	// 영수증발급여부
	private String supportBill;
	// 후원금액
	private int supportAmount;
	// 수수료
	private int supportCommission;
	// 제작자에게 지급할 금액
	private int supportPaymentAmount;
	// 인출구분 / 미인출 / 인출
	private String supportWithDrawalPart;
	// 인출 일자
	private String supportWithDrawalDate;

	public String getSupportNo() {
		return supportNo;
	}

	public void setSupportNo(String supportNo) {
		this.supportNo = supportNo;
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

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
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

	public String getSupportDate() {
		return supportDate;
	}

	public void setSupportDate(String supportDate) {
		this.supportDate = supportDate;
	}

	public String getSupportBill() {
		return supportBill;
	}

	public void setSupportBill(String supportBill) {
		this.supportBill = supportBill;
	}

	public int getSupportAmount() {
		return supportAmount;
	}

	public void setSupportAmount(int supportAmount) {
		this.supportAmount = supportAmount;
	}

	public int getSupportCommission() {
		return supportCommission;
	}

	public void setSupportCommission(int supportCommission) {
		this.supportCommission = supportCommission;
	}

	public int getSupportPaymentAmount() {
		return supportPaymentAmount;
	}

	public void setSupportPaymentAmount(int supportPaymentAmount) {
		this.supportPaymentAmount = supportPaymentAmount;
	}

	public String getSupportWithDrawalPart() {
		return supportWithDrawalPart;
	}

	public void setSupportWithDrawalPart(String supportWithDrawalPart) {
		this.supportWithDrawalPart = supportWithDrawalPart;
	}

	public String getSupportWithDrawalDate() {
		return supportWithDrawalDate;
	}

	public void setSupportWithDrawalDate(String supportWithDrawalDate) {
		this.supportWithDrawalDate = supportWithDrawalDate;
	}

	@Override
	public String toString() {
		return "Support [supportNo=" + supportNo + ", user=" + user + ", cost=" + cost + ", pay=" + pay + ", podCast="
				+ podCast + ", episode=" + episode + ", supportDate=" + supportDate + ", supportBill=" + supportBill
				+ ", supportAmount=" + supportAmount + ", supportCommission=" + supportCommission
				+ ", supportPaymentAmount=" + supportPaymentAmount + ", supportWithDrawalPart=" + supportWithDrawalPart
				+ ", supportWithDrawalDate=" + supportWithDrawalDate + "]";
	}

}
