package com.factory.podstudio.category.model;

public class Category {

	// ī�װ���ȣ
	private String categoryNo;
	// ��з� ī�װ�
	private String categoryMain;
	// �ߺз� ī�װ�
	private String categorySub;
	// ���� / ��ĳ��Ʈ / ������� / ����
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
