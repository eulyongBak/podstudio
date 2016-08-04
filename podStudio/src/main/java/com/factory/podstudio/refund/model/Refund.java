package com.factory.podstudio.refund.model;

import com.factory.podstudio.pay.model.Pay;
import com.factory.podstudio.user.model.User;

public class Refund {
	// ȯ�ҹ�ȣ
	private String refundNo;
	// ������ȣ
	private Pay pay;
	// ȸ����ȣ
	private User user;
	// ȯ�ҿ�û����
	private String refundRequestDate;
	// ȯ��ó������
	private String refundResponseDate;
	// ȯ�� ������
	private int refundRefundFees;
	// ȯ�ұݾ�
	private int refundPrice;
	// ���� / ��Ʃ������� / �Ŀ� / CM / ���
	private String refundPart;
	// ȯ�� ����
	private String refundReason;

	public String getRefundNo() {
		return refundNo;
	}

	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRefundRequestDate() {
		return refundRequestDate;
	}

	public void setRefundRequestDate(String refundRequestDate) {
		this.refundRequestDate = refundRequestDate;
	}

	public String getRefundResponseDate() {
		return refundResponseDate;
	}

	public void setRefundResponseDate(String refundResponseDate) {
		this.refundResponseDate = refundResponseDate;
	}

	public int getRefundRefundFees() {
		return refundRefundFees;
	}

	public void setRefundRefundFees(int refundRefundFees) {
		this.refundRefundFees = refundRefundFees;
	}

	public int getRefundPrice() {
		return refundPrice;
	}

	public void setRefundPrice(int refundPrice) {
		this.refundPrice = refundPrice;
	}

	public String getRefundPart() {
		return refundPart;
	}

	public void setRefundPart(String refundPart) {
		this.refundPart = refundPart;
	}

	public String getRefundReason() {
		return refundReason;
	}

	public void setRefundReason(String refundReason) {
		this.refundReason = refundReason;
	}

	@Override
	public String toString() {
		return "Refund [refundNo=" + refundNo + ", pay=" + pay + ", user=" + user + ", refundRequestDate="
				+ refundRequestDate + ", refundResponseDate=" + refundResponseDate + ", refundRefundFees="
				+ refundRefundFees + ", refundPrice=" + refundPrice + ", refundPart=" + refundPart + ", refundReason="
				+ refundReason + "]";
	}

}
