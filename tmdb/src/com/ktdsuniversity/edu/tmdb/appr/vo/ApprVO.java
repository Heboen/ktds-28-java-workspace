package com.ktdsuniversity.edu.tmdb.appr.vo;

import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVO;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class ApprVO {

	private String apprId;
	private String mvId;
	private String invlvdId;
	private String strNM;

	// 출연자 한 명이 하나의 영화에 출연했다.
	private MvVO mvVO;

	// 출연자의 정보
	private InvlvdVO invlvdVO;

	public String getApprId() {
		return this.apprId;
	}

	public void setApprId(String apprId) {
		this.apprId = apprId;
	}

	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getInvlvdId() {
		return this.invlvdId;
	}

	public void setInvlvdId(String invlvdId) {
		this.invlvdId = invlvdId;
	}

	public String getStrNM() {
		return this.strNM;
	}

	public void setStrNM(String strNM) {
		this.strNM = strNM;
	}

	public MvVO getMvVO() {
		return this.mvVO;
	}

	public void setMvVO(MvVO mvVO) {
		this.mvVO = mvVO;
	}

	public InvlvdVO getInvlvdVO() {
		return this.invlvdVO;
	}

	public void setInvlvdVO(InvlvdVO invlvdVO) {
		this.invlvdVO = invlvdVO;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참여자ID: " + this.getInvlvdId() + " 배역: " + this.getStrNM();
	}

}
