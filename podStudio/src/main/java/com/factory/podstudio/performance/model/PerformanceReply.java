package com.factory.podstudio.performance.model;

import com.factory.podstudio.user.model.User;

public class PerformanceReply {
	// 공연댓글번호
	private String showReplyNo;
	// 공연번호
	private String showNo;
	// 회원번호
	private User user;
	// 공연댓글 내용
	private String showReplyContent;
	// 답글번호
	private int showReplyReplyNo;
	// 답글깊이
	private int showReplyReplyDepth;
	// 답글순서
	private int showReplyReplyOrder;
	// 작성일자
	private String showReplyDate;
	
	public String getShowReplyNo() {
		return showReplyNo;
	}
	public void setShowReplyNo(String showReplyNo) {
		this.showReplyNo = showReplyNo;
	}
	public String getShowNo() {
		return showNo;
	}
	public void setShowNo(String showNo) {
		this.showNo = showNo;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getShowReplyContent() {
		return showReplyContent;
	}
	public void setShowReplyContent(String showReplyContent) {
		this.showReplyContent = showReplyContent;
	}
	public int getShowReplyReplyNo() {
		return showReplyReplyNo;
	}
	public void setShowReplyReplyNo(int showReplyReplyNo) {
		this.showReplyReplyNo = showReplyReplyNo;
	}
	public int getShowReplyReplyDepth() {
		return showReplyReplyDepth;
	}
	public void setShowReplyReplyDepth(int showReplyReplyDepth) {
		this.showReplyReplyDepth = showReplyReplyDepth;
	}
	public int getShowReplyReplyOrder() {
		return showReplyReplyOrder;
	}
	public void setShowReplyReplyOrder(int showReplyReplyOrder) {
		this.showReplyReplyOrder = showReplyReplyOrder;
	}
	public String getShowReplyDate() {
		return showReplyDate;
	}
	public void setShowReplyDate(String showReplyDate) {
		this.showReplyDate = showReplyDate;
	}
	
	@Override
	public String toString() {
		return "PerformanceReply [showReplyNo=" + showReplyNo + ", showNo=" + showNo + ", user=" + user
				+ ", showReplyContent=" + showReplyContent + ", showReplyReplyNo=" + showReplyReplyNo
				+ ", showReplyReplyDepth=" + showReplyReplyDepth + ", showReplyReplyOrder=" + showReplyReplyOrder
				+ ", showReplyDate=" + showReplyDate + "]";
	}
}
