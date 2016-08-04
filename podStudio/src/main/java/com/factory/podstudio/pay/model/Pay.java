package com.factory.podstudio.pay.model;

import com.factory.podstudio.category.model.Category;
import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.user.model.User;

public class Pay {
	// ������ȣ
	private String payNo;
	// ȸ����ȣ
	private User user;
	// �ܰ�ǥ��ȣ
	private Cost cost;
	// ī�װ���ȣ / �������
	private Category category;
	// ������ ��������
	private String payPayerPart;
	// ���� / CM /��� / ��Ʃ������� / �Ŀ�
	private String payPart;
	// �����ݾ�
	private String payPrice;
	// �����Ͻ�
	private String payDate;
	// �������߱޿���
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
