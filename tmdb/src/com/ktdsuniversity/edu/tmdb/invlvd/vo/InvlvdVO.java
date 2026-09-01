package com.ktdsuniversity.edu.tmdb.invlvd.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVO;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVO;

public class InvlvdVO {

	private String invlvdId;
	private String invlvdNm;
	private String invlvdPrfl;
	

	// 참여자 한 명이 여러 개의 영화를 제작했다.
	private List<FlmmkrVO> flmmkrList;

	// 참여자 한 명이 여러 개의 영화에 출연했다.
	private List<ApprVO> apprList;

	public String getInvlvdId() {
		return this.invlvdId;
	}

	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}

	public String getInvlvdPrfl() {
		return this.invlvdPrfl;
	}

	public void setInvlvdPrfl(String invlvdPrfl) {
		this.invlvdPrfl = invlvdPrfl;
	}

	public String getInvlvdNm() {
		return this.invlvdNm;
	}

	public void setInvlvdNm(String invlvdNm) {
		this.invlvdNm = invlvdNm;
	}

	public List<FlmmkrVO> getFlmmkrList() {
		return this.flmmkrList;
	}

	public void setFlmmkrList(List<FlmmkrVO> flmmkrList) {
		this.flmmkrList = flmmkrList;
	}

	public List<ApprVO> getApprList() {
		return this.apprList;
	}

	public void setApprList(List<ApprVO> apprList) {
		this.apprList = apprList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:" + getInvlvdNm() + " 프로필: " + getInvlvdPrfl();
	} 

}
