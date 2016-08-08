package com.factory.podstudio.advertising.cm.model;

import com.factory.podstudio.cost.model.Cost;
import com.factory.podstudio.pay.model.Pay;
import com.factory.podstudio.podcast.model.PodCast;
import com.factory.podstudio.studio.model.Studio;

public class CM2 {

	// CM광고번호
	private String cmNo;
	// 팟캐스트번호
	private PodCast podCast;
	// 스튜디오번호
	private Studio studio;
	// 단가번호
	private Cost cost;
	// 결제번호
	private Pay pay;
	// CM광고제품명
	private String cmProduct;
	// CM광고업체명
	private String cmCompany;
	// CM광고내용
	private String cmContent;
	// CM광고클릭수
	private int cmCount;
	// CM광고등록시간
	private String cmDate;
	// CM광고서비스시작시간
	private String cmServiceStart;
	// CM광고서비스종료시간
	private String cmServiceEnd;
	// CM광고상태 / 정상서비스 / 서비스진행 / 서비스만료
	private String cmStatus;

	public String getCmNo() {
		return cmNo;
	}

	public void setCmNo(String cmNo) {
		this.cmNo = cmNo;
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

	public String getCmProduct() {
		return cmProduct;
	}

	public void setCmProduct(String cmProduct) {
		this.cmProduct = cmProduct;
	}

	public String getCmCompany() {
		return cmCompany;
	}

	public void setCmCompany(String cmCompany) {
		this.cmCompany = cmCompany;
	}

	public String getCmContent() {
		return cmContent;
	}

	public void setCmContent(String cmContent) {
		this.cmContent = cmContent;
	}

	public int getCmCount() {
		return cmCount;
	}

	public void setCmCount(int cmCount) {
		this.cmCount = cmCount;
	}

	public String getCmDate() {
		return cmDate;
	}

	public void setCmDate(String cmDate) {
		this.cmDate = cmDate;
	}

	public String getCmServiceStart() {
		return cmServiceStart;
	}

	public void setCmServiceStart(String cmServiceStart) {
		this.cmServiceStart = cmServiceStart;
	}

	public String getCmServiceEnd() {
		return cmServiceEnd;
	}

	public void setCmServiceEnd(String cmServiceEnd) {
		this.cmServiceEnd = cmServiceEnd;
	}

	public String getCmStatus() {
		return cmStatus;
	}

	public void setCmStatus(String cmStatus) {
		this.cmStatus = cmStatus;
	}

	@Override
	public String toString() {
		return "CM [cmNo=" + cmNo + ", podCast=" + podCast + ", cost=" + cost + ", cmProduct=" + cmProduct
				+ ", cmCompany=" + cmCompany + ", cmContent=" + cmContent + ", cmCount=" + cmCount + ", cmDate="
				+ cmDate + ", cmServiceStart=" + cmServiceStart + ", cmServiceEnd=" + cmServiceEnd + ", cmStatus="
				+ cmStatus + "]";
	}

}