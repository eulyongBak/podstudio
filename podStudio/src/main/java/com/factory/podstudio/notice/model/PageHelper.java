package com.factory.podstudio.notice.model;

public class PageHelper {

	// �ش� �Խñ��� ù������ ����
	private int startPage;
	// �Խñ� �������� �ѹ��� ��� �������� ����
	private int linePerPage;

	public PageHelper() {
		super();
	}

	public PageHelper(int page, int linePerPage) {
		// ���������� � ���ñ��� ���� ����
		this.linePerPage = linePerPage;
		// ���° �Խñ� ���� �������� ù ������ ����
		this.startPage = (page - 1) * linePerPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getLinePerPage() {
		return linePerPage;
	}

	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}

}
