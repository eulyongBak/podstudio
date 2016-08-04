package com.factory.podstudio.podmeeting.model;

import com.factory.podstudio.user.model.User;

public class PodMeetingReply {

	// ���̻� ��۹�ȣ
	private String podMeetingReplyNo;
	// ���̻� ��ȣ
	private PodMeeting podMeeting;
	// ȸ����ȣ
	private User user;
	// ��۳���
	private String podMeetingReplyContent;
	// ��۹�ȣ
	private int podMeetingReplyReplyNo;
	// ��� ����
	private int podMeetingReplyReplyDepth;
	// ��ۼ���
	private int podMeetingReplyReplyOrder;
	// ��Ͻð�
	private String podMeetingReplyDate;

	public String getPodMeetingReplyNo() {
		return podMeetingReplyNo;
	}

	public void setPodMeetingReplyNo(String podMeetingReplyNo) {
		this.podMeetingReplyNo = podMeetingReplyNo;
	}

	public PodMeeting getPodMeeting() {
		return podMeeting;
	}

	public void setPodMeeting(PodMeeting podMeeting) {
		this.podMeeting = podMeeting;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPodMeetingReplyContent() {
		return podMeetingReplyContent;
	}

	public void setPodMeetingReplyContent(String podMeetingReplyContent) {
		this.podMeetingReplyContent = podMeetingReplyContent;
	}

	public int getPodMeetingReplyReplyNo() {
		return podMeetingReplyReplyNo;
	}

	public void setPodMeetingReplyReplyNo(int podMeetingReplyReplyNo) {
		this.podMeetingReplyReplyNo = podMeetingReplyReplyNo;
	}

	public int getPodMeetingReplyReplyDepth() {
		return podMeetingReplyReplyDepth;
	}

	public void setPodMeetingReplyReplyDepth(int podMeetingReplyReplyDepth) {
		this.podMeetingReplyReplyDepth = podMeetingReplyReplyDepth;
	}

	public int getPodMeetingReplyReplyOrder() {
		return podMeetingReplyReplyOrder;
	}

	public void setPodMeetingReplyReplyOrder(int podMeetingReplyReplyOrder) {
		this.podMeetingReplyReplyOrder = podMeetingReplyReplyOrder;
	}

	public String getPodMeetingReplyDate() {
		return podMeetingReplyDate;
	}

	public void setPodMeetingReplyDate(String podMeetingReplyDate) {
		this.podMeetingReplyDate = podMeetingReplyDate;
	}

	@Override
	public String toString() {
		return "PodMeetingReply [podMeetingReplyNo=" + podMeetingReplyNo + ", podMeeting=" + podMeeting + ", user="
				+ user + ", podMeetingReplyContent=" + podMeetingReplyContent + ", podMeetingReplyReplyNo="
				+ podMeetingReplyReplyNo + ", podMeetingReplyReplyDepth=" + podMeetingReplyReplyDepth
				+ ", podMeetingReplyReplyOrder=" + podMeetingReplyReplyOrder + ", podMeetingReplyDate="
				+ podMeetingReplyDate + "]";
	}

}
