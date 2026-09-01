package com.ktdsuniversity.edu.tmdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ktdsuniversity.edu.tmdb.gnr.vo.GnrVO;
import com.ktdsuniversity.edu.tmdb.mv.vo.MvVO;

public class ConnectionTest {

	public static MvVO selectMovie(String mvId) {
		// Java -> Oracle 연결하기 위한 URL
		String url = "jdbc:oracle:thin:@localhost:1521:XE";

		// Oracle에 접속하기 위한 인증 정보
		String schemaName = "TMDB";
		String password = "TMDB";

		Connection dbConnection = null;

		// Oracle로 접속
		try {
			dbConnection = DriverManager.getConnection(url, schemaName, password);
			// 연결한스키마 이름 출력
			System.out.println(dbConnection.getSchema());

		} catch (SQLException sqle) {
			throw new RuntimeException("데이터베이스에 연결할 수 없습니다.", sqle);
		}

		// Oracle로 쿼리를 전송하고 실행 한 뒤 결과를 받아온다.
		// 영화의 정보만 조회를 해본다.
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
		query.append(" WHERE DEL_YN = ?                 ");
		query.append("   AND MV_ID =  ?");
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 위에 준비된 쿼리를 Oracle에 전송하고 실행한다.
//		List<MvVO> movieList = new ArrayList<>();
		try {
			pstmt = dbConnection.prepareStatement(query.toString());
			// ?에 들어갈 값을 할당한다.
			pstmt.setString(1, "N");
			pstmt.setString(2, mvId);

			rs = pstmt.executeQuery();
			MvVO mvVO = null;
			// ResultSet의 Row를 처음부터 끝까지 반복시킨다.
			while (rs.next()) {

				// 현재 반복중인 Row에서 각 컬럼들의 값을 추출한다.

				// 추출된 값을 MvVO에게 할당해준다.
				mvVO = new MvVO();
				mvVO.setMvId(rs.getString("MV_ID"));
				mvVO.setTtl(rs.getString("TTL"));
				mvVO.setMvRtng(rs.getString("MV_RTNG"));
				mvVO.setRnngtm(rs.getInt("RNNG_TM"));
				mvVO.setRlsDt(rs.getString("RLS_DT"));
				mvVO.setSmmr(rs.getString("SMMR"));
				mvVO.setMainPstrUrl(rs.getString("MAIN_PSTR_URL"));
				mvVO.setFbUrl(rs.getString("FB_URL"));
				mvVO.setXUrl(rs.getString("X_URL"));
				mvVO.setInstgrmUrl(rs.getString("INSTGRM_URL"));
				mvVO.setTgln(rs.getString("TGLN"));
				mvVO.setOrgnlTtl(rs.getString("ORGNL_TTL"));
				mvVO.setPlyng(rs.getString("PLYNG"));
				mvVO.setLngg(rs.getString("LNGG"));
				mvVO.setBdgt(rs.getLong("BDGT"));
				mvVO.setBxOffcGrss(rs.getLong("BX_OFFC_GRSS"));

//				// MvVO를 List<MvVO>에게 추가한다.
//				movieList.add(mvVO);
			}
			return mvVO;

		} catch (SQLException sqle) {
			throw new RuntimeException("쿼리에 문제가 있습니다.", sqle);
		} finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// connections close
			if (dbConnection != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
		}

//		movieList.forEach(System.out::println);
//		return null;
	}
	public static List<GnrVO> selectGenre(String mvId){
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "TMDB";
		String password = "TMDB";
		
		Connection dbConn = null;
		
		try {
			dbConn = DriverManager.getConnection(url, user, password);
			System.out.println(dbConn.getSchema());
		}
		catch(SQLException sqle) {
			throw new RuntimeException("잘못된 유저 정보입니다.", sqle);
		}
		StringBuffer query = new StringBuffer();
		query.append("SELECT G.GNR_ID   AS GNR_ID          ");
		query.append(" 	   , G.NM       AS NM            ");
		query.append("  FROM GNR G                ");
		query.append(" INNER JOIN MV_GNR MG       ");
		query.append("    ON G.GNR_ID = MG.GNR_ID2  ");
		query.append(" WHERE MG.MV_ID = ?     ");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = dbConn.prepareStatement(query.toString());
			pstmt.setString(1, "1-spider-man-brand-new-day");	
			rs = pstmt.executeQuery();
			GnrVO gnrVO = null;
			List<GnrVO> gnrList = new ArrayList<>();
			while(rs.next()) {
				gnrVO = new GnrVO();
				gnrVO.setGnrId(rs.getString("GNR_ID"));
				gnrVO.setNm(rs.getString("NM"));
				gnrList.add(gnrVO);
			}
			return gnrList;
		}catch(SQLException sqle) {
			throw new RuntimeException("잘못된 쿼리입니다.", sqle);
		}finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// connections close
			if (dbConn != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
		}

	}
	
	public static List<MvVO> selectMovieOf(String gnrId){
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "TMDB";
		String password = "TMDB";
		
		Connection dbConn = null;
		try {
			dbConn = DriverManager.getConnection(url, user, password);
			System.out.println(dbConn.getSchema());
		}catch(SQLException sqle) {
			throw new RuntimeException("데이터베이스에 접속할 수 없습니다.", sqle);
		}
		
		StringBuffer query = new StringBuffer();
		query.append("SELECT M.MV_ID AS MV_ID     ");
		query.append("  FROM MV M                 ");
		query.append(" INNER JOIN MV_GNR MG       ");
		query.append(" 	  ON M.MV_ID = MG.MV_ID   ");
		query.append(" INNER JOIN GNR G           ");
		query.append(" 	  ON MG.GNR_ID2 = G.GNR_ID"); 
		query.append(" WHERE G.GNR_ID = :GNR_ID   ");
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MvVO> mvList = new ArrayList<>();
		MvVO mvVO = null;
		try {
			pstmt = dbConn.prepareStatement(query.toString());
			pstmt.setString(1,gnrId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				mvVO = new MvVO();
				mvVO.setMvId(rs.getString("MV_ID"));
				
				mvList.add(selectMovie(mvVO.getMvId()));
			}
			return mvList;
		}catch(SQLException sqle) {
			throw new RuntimeException("잘못된 쿼리입니다.", sqle);
		}finally {
			// rs close
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
				}
			}
			// pstmt close
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
			// connections close
			if (dbConn != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			}
		}
		
	}

	public static void main(String[] args) {
		String movieId = "1-spider-man-brand-new-day";
		
		MvVO movie = selectMovie(movieId);
		List<GnrVO>gnrList = selectGenre(movieId);
		
		movie.setGnrList(gnrList);
		
		System.out.println(movieId);
		
		System.out.println(movie.getGnrList());
		
		movie.getGnrList().forEach(gnr -> {
			System.out.println("[" + movie.getTtl()+ "] 장르명: " + gnr.getNm());
		});
		
		String genre = movie.getGnrList()
							.stream()
							.map(GnrVO::getNm)
							.collect(Collectors.joining(", "));
		
		System.out.println("[" + movie.getTtl()+"] 장르: " + genre);
		
		String gnrId = "3-adventure";
		
		List<MvVO> mvList = selectMovieOf(gnrId);
		mvList.forEach(mv -> {
			System.out.println(mv);
		});

	}

}
