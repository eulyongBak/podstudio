package com.factory.podstudio.category.model;

public class Category {

	// 카테고리번호
	private String categoryNo;
	// 대분류 카테고리
	private String categoryMain;
	// 중분류 카테고리
	private String categorySub;
	// 구분 / 팟캐스트 / 결제방법 / 문의
	private String categoryPart;

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

	public String getCategorySub() {
		return categorySub;
	}

	public void setCategorySub(String categorySub) {
		this.categorySub = categorySub;
	}

	public String getCategoryPart() {
		return categoryPart;
	}

	public void setCategoryPart(String categoryPart) {
		this.categoryPart = categoryPart;
	}

	@Override
	public String toString() {
		return "Category [categoryNo=" + categoryNo + ", categoryMain=" + categoryMain + ", categorySub=" + categorySub
				+ ", categoryPart=" + categoryPart + "]";
	}

}
