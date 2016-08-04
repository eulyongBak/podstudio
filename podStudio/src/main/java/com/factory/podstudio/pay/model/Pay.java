package com.factory.podstudio.pay.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.user.model.User;

public class Pay {
	// 결제번호
	private String payNo;
	// 회원번호
	private User user;
	// 단가표번호
	private Cost cost;
	// 카테고리번호 / 결제방법
	private Category category;
	// 결제가 결제구분
	private String payPayerPart;
	// 구분 / CM /배너 / 스튜디오예약 / 후원
	private String payPart;
	// 결제금액
	private String payPrice;
	// 결제일시
	private String payDate;
	// 영수증발급여부
	private String payBill;

	public String getPayNo() {
		return payNo;
	}

	public void setPayNo(String payNo) {
		this.payNo = payNo;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getPayPayerPart() {
		return payPayerPart;
	}

	public void setPayPayerPart(String payPayerPart) {
		this.payPayerPart = payPayerPart;
	}

	public String getPayPart() {
		return payPart;
	}

	public void setPayPart(String payPart) {
		this.payPart = payPart;
	}

	public String getPayPrice() {
		return payPrice;
	}

	public void setPayPrice(String payPrice) {
		this.payPrice = payPrice;
	}

	public String getPayDate() {
		return payDate;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}

	public String getPayBill() {
		return payBill;
	}

	public void setPayBill(String payBill) {
		this.payBill = payBill;
	}

	@Override
	public String toString() {
		return "Pay [payNo=" + payNo + ", user=" + user + ", cost=" + cost + ", category=" + category
				+ ", payPayerPart=" + payPayerPart + ", payPart=" + payPart + ", payPrice=" + payPrice + ", payDate="
				+ payDate + ", payBill=" + payBill + "]";
	}

}
