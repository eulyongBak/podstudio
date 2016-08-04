package com.factory.podstudio.advertising.banner.model;

import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.pay.model.Pay;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.show.model.Show;
import com.factory.podstudio.studio.model.Studio;

public class Banner {
	// ��ʱ��� ��ȣ
	private String bannerNo;
	// ��ĳ��Ʈ���� ��ȣ�� �����´�
	private PodCast podCast;
	// ��Ʃ��� ��ȣ�� �����´�
	private Studio studio;
	// ������ȣ�� �����´�
	private Show show;
	// �ܰ�ǥ��ȣ�� �����´�
	private Cost cost;
	// ������ȣ
	private Pay pay;
	// ��ʱ��� ��ǰ��
	private String bannerProduct;
	// ��ʱ��� ��ü��
	private String bannerCompany;
	// ��ʱ��������̸�
	private String bannerFileName;
	// ��ʱ��� Ŭ����
	private String bannerCount;
	// ��Ͻð�
	private String bannerDate;
	// ���� ������
	private String bannerServiceStart;
	// ���� ������
	private String bannerServiceEnd;
	// ���� ���� / ���󼭺� / ���� ������ / ���� �ȷ�
	private String bannerStatus;

	public String getBannerNo() {
		return bannerNo;
	}

	public void setBannerNo(String bannerNo) {
		this.bannerNo = bannerNo;
	}

	public PodCast getPodCast() {
		return podCast;
	}

	public void setPodCast(PodCast podCast) {
		this.podCast = podCast;
	}

	public Studio getStudio() {
		return studio;
	}

	public void setStudio(Studio studio) {
		this.studio = studio;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

	public Pay getPay() {
		return pay;
	}

	public void setPay(Pay pay) {
		this.pay = pay;
	}

	public String getBannerProduct() {
		return bannerProduct;
	}

	public void setBannerProduct(String bannerProduct) {
		this.bannerProduct = bannerProduct;
	}

	public String getBannerCompany() {
		return bannerCompany;
	}

	public void setBannerCompany(String bannerCompany) {
		this.bannerCompany = bannerCompany;
	}

	public String getBannerFileName() {
		return bannerFileName;
	}

	public void setBannerFileName(String bannerFileName) {
		this.bannerFileName = bannerFileName;
	}

	public String getBannerCount() {
		return bannerCount;
	}

	public void setBannerCount(String bannerCount) {
		this.bannerCount = bannerCount;
	}

	public String getBannerDate() {
		return bannerDate;
	}

	public void setBannerDate(String bannerDate) {
		this.bannerDate = bannerDate;
	}

	public String getBannerServiceStart() {
		return bannerServiceStart;
	}

	public void setBannerServiceStart(String bannerServiceStart) {
		this.bannerServiceStart = bannerServiceStart;
	}

	public String getBannerServiceEnd() {
		return bannerServiceEnd;
	}

	public void setBannerServiceEnd(String bannerServiceEnd) {
		this.bannerServiceEnd = bannerServiceEnd;
	}

	public String getBannerStatus() {
		return bannerStatus;
	}

	public void setBannerStatus(String bannerStatus) {
		this.bannerStatus = bannerStatus;
	}

	@Override
	public String toString() {
		return "Banner [bannerNo=" + bannerNo + ", podCast=" + podCast + ", cost=" + cost + ", bannerProduct="
				+ bannerProduct + ", bannerCompany=" + bannerCompany + ", bannerFileName=" + bannerFileName
				+ ", bannerCount=" + bannerCount + ", bannerDate=" + bannerDate + ", bannerServiceStart="
				+ bannerServiceStart + ", bannerServiceEnd=" + bannerServiceEnd + ", bannerStatus=" + bannerStatus
				+ "]";
	}

}
