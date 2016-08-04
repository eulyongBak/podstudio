package com.factory.podstudio.notice.model;

import com.factory.podstudio.user.model.User;

public class Notice {
	// 공지사항번호
	private String noticeNo;
	// 회원번호 ( 닉네임 사용을 위한 회원번호)
	private String userNo;
	// 회원 닉네임
	private String userNickname;
	// 공지 제목
	private String noticeTitle;
	// 공지내용
	private String noticeContent;
	// 공지 작성일자
	private String noticeDate;

	public String getNoticeNo() {
		return noticeNo;
	}

	public void setNoticeNo(String noticeNo) {
		this.noticeNo = noticeNo;
	}
	

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public String getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(String noticeDate) {
		this.noticeDate = noticeDate;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	@Override
	public String toString() {
		return "Notice [noticeNo=" + noticeNo + ", userNo=" + userNo + ", noticeTitle=" + noticeTitle
				+ ", noticeContent=" + noticeContent + ", noticeDate=" + noticeDate + "]";
	}


}
