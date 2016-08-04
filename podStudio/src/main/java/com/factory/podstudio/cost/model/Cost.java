package com.factory.podstudio.cost.model;

public class Cost {

	// �ܰ�ǥ��ȣ
	private String costNo;
	// ���� / ���� / �Ŀ� / ��Ʃ���
	private String costPart;
	// �Ⱓ (4��)
	private String costDate;
	// �ݾ�
	private int costPrice;
	// Ƚ��
	private int costCount;

	public String getCostNo() {
		return costNo;
	}

	public void setCostNo(String costNo) {
		this.costNo = costNo;
	}

	public String getCostPart() {
		return costPart;
	}

	public void setCostPart(String costPart) {
		this.costPart = costPart;
	}

	public String getCostDate() {
		return costDate;
	}

	public void setCostDate(String costDate) {
		this.costDate = costDate;
	}

	public int getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(int costPrice) {
		this.costPrice = costPrice;
	}

	public int getCostCount() {
		return costCount;
	}

	public void setCostCount(int costCount) {
		this.costCount = costCount;
	}

	@Override
	public String toString() {
		return "Cost [costNo=" + costNo + ", costPart=" + costPart + ", costDate=" + costDate + ", costPrice="
				+ costPrice + ", costCount=" + costCount + "]";
	}

}
