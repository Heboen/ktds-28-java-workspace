package com.ktdsuniversity.edu.tmdb;

import java.util.List;

import com.ktdsuniversity.edu.tmdb.appr.vo.ApprVO;
import com.ktdsuniversity.edu.tmdb.bckgrnd.vo.BckgrndVO;
import com.ktdsuniversity.edu.tmdb.common.utils.DBConnector;
import com.ktdsuniversity.edu.tmdb.flmmkr.vo.FlmmkrVO;
import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.tmdb.invlvd.vo.InvlvdVO;
import com.ktdsuniversity.edu.tmdb.kwrd.vo.KwrdVO;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;
import com.ktdsuniversity.edu.tmdb.pstr.vo.PstrVO;
import com.ktdsuniversity.edu.tmdb.vd.vo.VdVO;

public class MovieInfo {

	private DBConnector connector;

	public MovieInfo() {
		this.connector = DBConnector.builder().setDriverClassName("oracle.jdbc.driver.OracleDriver")
				.setUrl("jdbc:oracle:thin:@localhost:1521:XE").setSchemaName("TMDB").setPassword("TMDB").connect();
	}

	public MvVO selectMovie(String mvId) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT MV_ID                       ");
		query.append("     , TTL                          ");
		query.append("     , MV_RTNG                      ");
		query.append("     , RNNG_TM                      ");
		query.append("     , TO_CHAR(RLS_DT, 'YYYY-MM-DD') AS RLS_DT");
		query.append("     , SMMR                         ");
		query.append("     , MAIN_PSTR_URL                ");
		query.append("     , FB_URL                       ");
		query.append("     , X_URL                        ");
		query.append("     , INSTGRM_URL                  ");
		query.append("     , TGLN                         ");
		query.append("     , ORGNL_TTL                    ");
		query.append("     , PLYNG                        ");
		query.append("     , LNGG                         ");
		query.append("     , BDGT                         ");
		query.append("     , BX_OFFC_GRSS                 ");
		query.append("  FROM MV                           ");
		query.append(" WHERE DEL_YN = 'N'                   ");
		query.append("   AND MV_ID =  ?");

		return connector.selectBuilder(MvVO.class, query).setParams(pstmt -> pstmt.setString(1, mvId)).selectOne();
	}

	public void setGenres(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT G.GNR_ID   AS GNR_ID ");
		query.append(" 	   , G.NM       AS NM     ");
		query.append("  FROM GNR G                ");
		query.append(" INNER JOIN MV_GNR MG       ");
		query.append("    ON G.GNR_ID = MG.GNR_ID2");
		query.append(" WHERE MG.MV_ID = ?     	  ");

		List<GnrVO> genres = this.connector.selectBuilder(GnrVO.class, query)
				.setParams(pstmt -> pstmt.setString(1, movie.getMvId())).selectList();
		movie.setGnrList(genres);
	}

	public void setKeywords(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("	SELECT K.KWRD_ID AS KWRD_ID        ");
		query.append("		 , K.KWRD_NM AS KWRD_NM        ");
		query.append("    FROM KWRD K                      ");
		query.append("   INNER JOIN MV_KWRD MK             ");
		query.append(" 		ON K.KWRD_ID = MK.KWRD_ID2     ");
		query.append("   WHERE MK.MV_ID = ?           ");

		List<KwrdVO> keywords = this.connector.selectBuilder(KwrdVO.class, query)
				.setParams(pstmt -> pstmt.setString(1, movie.getMvId())).selectList();
		movie.setKwrdList(keywords);
	}

	public void setVideos(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("SELECT V.VD_ID             ");
		query.append(" 	 , V.VD_URL              ");
		query.append("  FROM VD V                ");
		query.append(" INNER JOIN MV             ");
		query.append("	ON V.MV_ID = MV.MV_ID    ");
		query.append(" WHERE V.MV_ID = ?    ");

		List<VdVO> videos = this.connector.selectBuilder(VdVO.class, query)
										  .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
										  .selectList();
		movie.setVdList(videos);
	}

	public void setBakcgrounds(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("	SELECT B.BCKGRND_ID          ");
		query.append("		 , B.BCKGRND_URL             ");
		query.append("    FROM BCKGRND B               ");
		query.append("   INNER JOIN MV M               ");
		query.append(" 		ON B.MV_ID = M.MV_ID         ");
		query.append("   WHERE B.MV_ID = ?        ");
		
		List<BckgrndVO> bckgrnds = this.connector.selectBuilder(BckgrndVO.class, query)
												  .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
												  .selectList();
		movie.setBckgrndList(bckgrnds);
	}

	public void setPosters(MvVO movie) {
		StringBuffer query = new StringBuffer();
		query.append("	SELECT P.PSTR_ID        ");
		query.append("	 	 , P.PSTR_URL           ");
		query.append("    FROM PSTR P             ");
		query.append("   INNER JOIN MV M          ");
		query.append(" 		ON P.MV_ID = M.MV_ID    ");
		query.append("   WHERE P.MV_ID = ?   ");
		List<PstrVO> pstrs = this.connector.selectBuilder(PstrVO.class, query)
										   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
										   .selectList();
		movie.setPstrList(pstrs);
	}
	
	public void setCasts(MvVO movie) {
		// 출연진 조회 Mv has a Appr
		final StringBuffer query = new StringBuffer();
		query.append("	SELECT APPR_ID    ");
		query.append("	 	 , MV_ID      ");
		query.append("	 	 , INVLVD_ID  ");
		query.append("	 	 , STR_NM     ");
		query.append("    FROM APPR       ");
		query.append("   WHERE MV_ID = ?  ");
		List<ApprVO> apprs = this.connector.selectBuilder(ApprVO.class,query)
										   .setParams(pstmt -> pstmt.setString(1,movie.getMvId()))
										   .selectList();
		movie.setApprList(apprs);
		// Appr has a Invlvd
		query.delete(0, query.length());
		query.append("	SELECT INVLVD_ID   ");
		query.append("	 , INVLVD_NAME     ");
		query.append("	 , INVLVD_PRFL     ");
		query.append("  FROM INVLVD        ");
		query.append(" WHERE INVLVD_ID = ? ");
		apprs.forEach(appr -> {
			// 람다 함수 내부에서는 외부의 지역 변수를 사용할 수 없다.
			// 람다 함수 내부에서 사용할 수 있는 것 => 람다 내부의 지역변수, 람다 외부의 상수, 멤버 변수
			InvlvdVO involved = this.connector.selectBuilder(InvlvdVO.class, query)
											  .setParams(pstmt -> pstmt.setString(1, appr.getInvlvdId()))
											  .addRenameColumn("INVLVD_NAME", "INVLVD_NM")
											  .selectOne();
			appr.setInvlvdVO(involved);
		});
	}
	
	public void setFilmmakers(MvVO movie) {
		// 제작진 조회 Mv has a Flmmkr
		final StringBuffer query = new StringBuffer();
		query.append("	SELECT FLMMKR_ID    ");
		query.append("	 	 , INVLVD_ID    ");
		query.append("	 	 , MV_ID        ");
		query.append("	 	 , FLMMKR_RL    ");
		query.append("	 	 , FLMMKR_PRT   ");
		query.append("    FROM FLMMKR       ");
		query.append(" 	 WHERE MV_ID = ?    ");
		List<FlmmkrVO> flmmkrs = this.connector.selectBuilder(FlmmkrVO.class, query)
											   .setParams(pstmt -> pstmt.setString(1, movie.getMvId()))
											   .selectList();
		movie.setFlmmkrList(flmmkrs);
		query.delete(0, query.length());
		query.append("	SELECT INVLVD_ID              ");
		query.append("	 , INVLVD_NAME                ");
		query.append("	 , INVLVD_PRFL                ");
		query.append("  FROM INVLVD                   ");
		query.append(" WHERE INVLVD_ID =          ?   ");
		// Flmmkr has a Invlvd
		flmmkrs.forEach(fmkr -> {
			InvlvdVO involved = this.connector.selectBuilder(InvlvdVO.class, query)
											  .setParams(pstmt -> pstmt.setString(1, fmkr.getInvlvdId()))
											  .addRenameColumn("INVLVD_NAME", "INVLVD_NM")
											  .selectOne();
			fmkr.setInvlvdVO(involved);
		});
	}

	public static void main(String[] args) {
		MovieInfo movieInfo = new MovieInfo();
		MvVO movie = movieInfo.selectMovie("34-interstellar");
		System.out.println(movie);

		movieInfo.setGenres(movie);

		System.out.println("장르명");
		movie.getGnrList().forEach(gnr -> System.out.println(gnr.getNm()));

		System.out.println("키워드");
		movieInfo.setKeywords(movie);
		movie.getKwrdList().forEach(kwrd -> System.out.println(kwrd.getKwrdNm()));
		
		System.out.println("동영상");
		movieInfo.setVideos(movie);
		movie.getVdList().forEach(vd -> System.out.println(vd.getVdUrl()));
		
		System.out.println("배경");
		movieInfo.setBakcgrounds(movie);
		movie.getBckgrndList().forEach(bck -> System.out.println(bck.getBckgrndUrl()));
		
		System.out.println("포스터");
		movieInfo.setPosters(movie);
		movie.getPstrList().forEach(pstr -> System.out.println(pstr.getPstrUrl()));
		
		System.out.println("출연자");
		movieInfo.setCasts(movie);
		movie.getApprList().forEach(appr -> System.out.println(appr.getInvlvdVO().getInvlvdNm()));
		
		System.out.println("제작진");
		movieInfo.setFilmmakers(movie);
		movie.getFlmmkrList().forEach(fmkr -> System.out.println(fmkr.getInvlvdVO().getInvlvdNm()));
		
		movieInfo.connector.close();
	}

}
