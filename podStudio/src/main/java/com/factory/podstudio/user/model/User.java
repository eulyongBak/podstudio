package com.factory.podstudio.user.model;

public class User {
	// 회원번호
	private String userNo;
	// 지역 카테고리
	private String categoryNo;
	// 지역 이름
	private String categoryMain;
	// 회원아이디
	private String userId;
	// 회원비밀번호
	private String userPw;
	// 회원닉네임
	private String userNickname;
	// 회원생년월일
	private String userBirth;
	// 회원 성별
	private String userGender;
	// 회원 이메일
	private String userEmail;
	// 회원 통신사
	private String userTelecom;
	// 회원 휴대폰번호
	private String userPhone;
	// 회원 권한
	private String userLevel;
	// 직업
	private String userJob;
	// 가입일자
	private String userJoinDate;
	// 탈퇴일자
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
	public String getCategoryMain() {
		return categoryMain;
	}
	public void setCategoryMain(String categoryMain) {
		this.categoryMain = categoryMain;
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
		return "User [userNo=" + userNo + ", categoryNo=" + categoryNo + ", categoryMain=" + categoryMain + ", userId="
				+ userId + ", userPw=" + userPw + ", userNickname=" + userNickname + ", userBirth=" + userBirth
				+ ", userGender=" + userGender + ", userEmail=" + userEmail + ", userTelecom=" + userTelecom
				+ ", userPhone=" + userPhone + ", userLevel=" + userLevel + ", userJob=" + userJob + ", userJoinDate="
				+ userJoinDate + ", userLeaveDate=" + userLeaveDate + "]";
	}

}
