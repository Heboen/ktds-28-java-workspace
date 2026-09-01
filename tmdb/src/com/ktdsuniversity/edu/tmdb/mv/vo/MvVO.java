package com.ktdsuniversity.edu.tmdb.mv.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVO;
import com.ktdsuniversity.edu.tmdb.bckgrnd.vo.BckgrndVO;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVO;
import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.tmdb.kwrd.vo.KwrdVO;
import com.ktdsuniversity.edu.tmdb.pstr.vo.PstrVO;
import com.ktdsuniversity.edu.tmdb.vd.vo.VdVO;

public class MvVO {

	private String mvId;
	private String ttl;
	private String mvRtng;
	private int rnngtm;
	private String rlsDt;
	private String smmr;
	private String mainPstrUrl;
	private String fbUrl;
	private String xUrl;
	private String instgrmUrl;
	private String tgln;
	private String orgnlTtl;
	private String plyng;
	private String lngg;
	private long bdgt;
	private long bxOffcGrss;

	// 하나의 영화는 여러 개의 동영상을 가지고 있다.
	private List<VdVO> vdList;

	// 하나의 영화는 여러 개의 배경을 가지고 있다.
	private List<BckgrndVO> bckgrndList;

	// 하나의 영화는 여러 개의 포스터를 가지고 있다.
	private List<PstrVO> pstrList;

	// 하나의 영화는 여러 명이 제작했다.
	private List<FlmmkrVO> flmmkrList;

	// 하나의 영화에는 여러 명이 출연했다.
	private List<ApprVO> apprList;

	// 하나의 영화는 여러 개의 장르가 있다.
	private List<GnrVO> gnrList;

	// 하나의 영화는 여러 개의 키워드가 있다.
	private List<KwrdVO> kwrdList;

	public String getMvId() {
		return this.mvId;
	}

	public void setMvId(String mvId) {
		this.mvId = mvId;
	}

	public String getTtl() {
		return this.ttl;
	}

	public void setTtl(String ttl) {
		this.ttl = ttl;
	}

	public String getMvRtng() {
		return this.mvRtng;
	}

	public void setMvRtng(String mvRtng) {
		this.mvRtng = mvRtng;
	}

	public int getRnngtm() {
		return this.rnngtm;
	}

	public void setRnngtm(int rnngtm) {
		this.rnngtm = rnngtm;
	}

	public String getRlsDt() {
		return this.rlsDt;
	}

	public void setRlsDt(String rlsDt) {
		this.rlsDt = rlsDt;
	}

	public String getSmmr() {
		return this.smmr;
	}

	public void setSmmr(String smmr) {
		this.smmr = smmr;
	}

	public String getMainPstrUrl() {
		return this.mainPstrUrl;
	}

	public void setMainPstrUrl(String mainPstrUrl) {
		this.mainPstrUrl = mainPstrUrl;
	}

	public String getFbUrl() {
		return this.fbUrl;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}

	public String getxUrl() {
		return this.xUrl;
	}

	public void setXUrl(String xUrl) {
		this.xUrl = xUrl;
	}

	public String getInstgrmUrl() {
		return this.instgrmUrl;
	}

	public void setInstgrmUrl(String instgrmUrl) {
		this.instgrmUrl = instgrmUrl;
	}

	public String getTgln() {
		return this.tgln;
	}

	public void setTgln(String tgln) {
		this.tgln = tgln;
	}

	public String getOrgnlTtl() {
		return this.orgnlTtl;
	}

	public void setOrgnlTtl(String orgnlTtl) {
		this.orgnlTtl = orgnlTtl;
	}

	public String getPlyng() {
		return this.plyng;
	}

	public void setPlyng(String plyng) {
		this.plyng = plyng;
	}

	public String getLngg() {
		return this.lngg;
	}

	public void setLngg(String lngg) {
		this.lngg = lngg;
	}

	public long getBdgt() {
		return this.bdgt;
	}

	public void setBdgt(long bdgt) {
		this.bdgt = bdgt;
	}

	public long getBxOffcGrss() {
		return this.bxOffcGrss;
	}

	public void setBxOffcGrss(long bxOffcGrss) {
		this.bxOffcGrss = bxOffcGrss;
	}

	public List<VdVO> getVdList() {
		return this.vdList;
	}

	public void setVdList(List<VdVO> vdList) {
		this.vdList = vdList;
	}

	public List<BckgrndVO> getBckgrndList() {
		return this.bckgrndList;
	}

	public void setBckgrndList(List<BckgrndVO> bckgrndList) {
		this.bckgrndList = bckgrndList;
	}

	public List<PstrVO> getPstrList() {
		return this.pstrList;
	}

	public void setPstrList(List<PstrVO> pstrList) {
		this.pstrList = pstrList;
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

	public List<GnrVO> getGnrList() {
		return this.gnrList;
	}

	public void setGnrList(List<GnrVO> gnrList) {
		this.gnrList = gnrList;
	}

	public List<KwrdVO> getKwrdList() {
		return this.kwrdList;
	}

	public void setKwrdList(List<KwrdVO> kwrdList) {
		this.kwrdList = kwrdList;
	}

	@Override
	public String toString() {
		return "mvId: " + this.mvId 
				+ ", ttl: " + this.ttl 
				+ ", mvRtng: " + this.mvRtng 
				+ ", rnngtm: " + this.rnngtm 
				+ ", rlsDt: " + this.rlsDt 
				+ ", smmr: " + this.smmr 
				+ ", mainPstrUrl: " + this.mainPstrUrl 
				+ ", fbUrl: " + this.fbUrl 
				+ ", xUrl: " + this.xUrl 
				+ ", instgrmUrl: " + this.instgrmUrl 
				+ ", tgln: " + this.tgln 
				+ ", orgnlTtl: " + this.orgnlTtl 
				+ ", plyng: " + this.plyng 
				+ ", lngg: " + this.lngg 
				+ ", bdgt: " + this.bdgt 
				+ ", bxOffcGrss: " + this.bxOffcGrss ;
	}

}
