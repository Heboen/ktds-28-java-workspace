package com.ktdsuniversity.edu.tmdb.kwrd.vo;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class KwrdVO {

	private String kwrdId;
	private String kwrdNm;

	// 하나의 키워드에는 여러 개의 영화가 있다.
	private List<MvVO> mvList;

	public String getKwrdId() {
		return this.kwrdId;
	}

	public void setKwrdId(String kwrdId) {
		this.kwrdId = kwrdId;
	}

	public String getKwrdNm() {
		return this.kwrdNm;
	}

	public void setKwrdNm(String kwrdNm) {
		this.kwrdNm = kwrdNm;
	}

	public List<MvVO> getMvList() {
		return this.mvList;
	}

	public void setMvList(List<MvVO> mvList) {
		this.mvList = mvList;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
