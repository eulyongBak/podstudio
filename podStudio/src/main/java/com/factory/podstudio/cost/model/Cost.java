package com.factory.podstudio.cost.model;

public class Cost {

	// 단가표번호
	private String costNo;
	// 구분 / 광고 / 후원 / 스튜디오
	private String costPart;
	// 기간 (4주)
	private String costDate;
	// 금액
	private int costPrice;
	// 횟수
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
