package com.factory.podstudio.user.model;

public class User {
	// ȸ����ȣ
	private String userNo;
	// ���� ī�װ�
	private String categoryNo;
	// ȸ�����̵�
	private String userId;
	// ȸ����й�ȣ
	private String userPw;
	// ȸ���г���
	private String userNickname;
	// ȸ���������
	private String userBirth;
	// ȸ�� ����
	private String userGender;
	// ȸ�� �̸���
	private String userEmail;
	// ȸ�� ��Ż�
	private String userTelecom;
	// ȸ�� �޴�����ȣ
	private String userPhone;
	// ȸ�� ����
	private String userLevel;
	// ����
	private String userJob;
	// ��������
	private String userJoinDate;
	// Ż������
	private String userLeaveDate;

	public String getUserNo() {
		return userNo;
	}

	public void setUserNo(String userNo) {
		this.userNo = userNo;
	}

	public String getCategoryNo() {
		return categoryNo;
	}

	public void setCategoryNo(String categoryNo) {
		this.categoryNo = categoryNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserNickname() {
		return userNickname;
	}

	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}

	public String getUserBirth() {
		return userBirth;
	}

	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserTelecom() {
		return userTelecom;
	}

	public void setUserTelecom(String userTelecom) {
		this.userTelecom = userTelecom;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getUserJob() {
		return userJob;
	}

	public void setUserJob(String userJob) {
		this.userJob = userJob;
	}

	public String getUserJoinDate() {
		return userJoinDate;
	}

	public void setUserJoinDate(String userJoinDate) {
		this.userJoinDate = userJoinDate;
	}

	public String getUserLeaveDate() {
		return userLeaveDate;
	}

	public void setUserLeaveDate(String userLeaveDate) {
		this.userLeaveDate = userLeaveDate;
	}

	@Override
	public String toString() {
		return "Member [userNo=" + userNo + ", category=" + categoryNo + ", userId=" + userId + ", userPw=" + userPw
				+ ", userNickName=" + userNickname + ", userBirth=" + userBirth + ", userGender=" + userGender
				+ ", userEmail=" + userEmail + ", userTelecom=" + userTelecom + ", userPhone=" + userPhone
				+ ", userLevel=" + userLevel + ", userJob=" + userJob + ", userJoinDate=" + userJoinDate
				+ ", userLeveDate=" + userLeaveDate + "]";
	}

}
