package com.factory.podstudio.show.model;

public class PageHelper {

	// 해당 게시글의 첫페이지 설정
	private int startPage;
	// 게시글 페이지를 한번에 몇개씩 보여줄지 설정
	private int linePerPage;

	public PageHelper() {
		super();
	}

	public PageHelper(int page, int linePerPage) {
		// 한페이지에 몇개 개시글을 줄지 설정
		this.linePerPage = linePerPage;
		// 몇번째 게시글 부터 보여줄지 첫 페이지 설정
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
