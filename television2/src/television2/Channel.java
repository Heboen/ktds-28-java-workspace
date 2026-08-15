package television2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Channel {

	private List<Schedule> channels;

	public Channel() {
		this.channels = new ArrayList<>();
	}

	public void kbs1Scheduling() {
		Schedule kbs = new Schedule("KBS1");
		
		kbs.addschedule(new TvShow("행복충청전", LocalTime.parse("05:10"), LocalTime.parse("05:59")));
		kbs.addschedule(new TvShow("KBS 뉴스광장", LocalTime.parse("06:00"), LocalTime.parse("07:49")));
		kbs.addschedule(new TvShow("인간극장", LocalTime.parse("07:50"), LocalTime.parse("08:24")));
		kbs.addschedule(new TvShow("아침마당", LocalTime.parse("08:25"), LocalTime.parse("09:29")));
		kbs.addschedule(new TvShow("KBS 뉴스 930", LocalTime.parse("09:30"), LocalTime.parse("09:59")));
		kbs.addschedule(new TvShow("무엇이든 물어보세요", LocalTime.parse("10:00"), LocalTime.parse("11:09")));
		kbs.addschedule(new TvShow("황신혜의 같이 삽시다", LocalTime.parse("11:10"), LocalTime.parse("11:59")));
		kbs.addschedule(new TvShow("KBS 뉴스 12", LocalTime.parse("12:00"), LocalTime.parse("12:50")));
		kbs.addschedule(new TvShow("세상 다반사", LocalTime.parse("13:00"), LocalTime.parse("13:49")));
		kbs.addschedule(new TvShow("생활의 발견 스페셜", LocalTime.parse("13:50"), LocalTime.parse("14:09")));
		kbs.addschedule(new TvShow("KBS 뉴스", LocalTime.parse("14:10"), LocalTime.parse("15:09")));
		kbs.addschedule(new TvShow("진품명품", LocalTime.parse("15:10"), LocalTime.parse("15:59")));
		kbs.addschedule(new TvShow("사사건건", LocalTime.parse("16:00"), LocalTime.parse("16:59")));
		kbs.addschedule(new TvShow("KBS 뉴스 5", LocalTime.parse("17:00"), LocalTime.parse("17:29")));
		kbs.addschedule(new TvShow("동물의 왕국", LocalTime.parse("17:30"), LocalTime.parse("17:59")));
		kbs.addschedule(new TvShow("6시 내고향", LocalTime.parse("18:00"), LocalTime.parse("18:59")));
		kbs.addschedule(new TvShow("KBS 뉴스 7", LocalTime.parse("19:00"), LocalTime.parse("19:39")));
		kbs.addschedule(new TvShow("스카우트", LocalTime.parse("19:40"), LocalTime.parse("20:29")));
		kbs.addschedule(new TvShow("일일드라마", LocalTime.parse("20:30"), LocalTime.parse("20:59")));
		kbs.addschedule(new TvShow("KBS 뉴스 9", LocalTime.parse("21:00"), LocalTime.parse("21:59")));
		kbs.addschedule(new TvShow("추적 60분", LocalTime.parse("22:00"), LocalTime.parse("22:59")));
		kbs.addschedule(new TvShow("영화", LocalTime.parse("23:00"), LocalTime.parse("01:10")));
		
		this.channels.add(kbs);
	}
	public void kbs2Scheduling() {
		Schedule kbs2 = new Schedule("KBS 2");

		kbs2.addschedule(new TvShow("생생정보", LocalTime.parse("05:00"), LocalTime.parse("06:04")));
		kbs2.addschedule(new TvShow("어린이 동물티비", LocalTime.parse("06:05"), LocalTime.parse("06:34")));
		kbs2.addschedule(new TvShow("걸어서 세계속으로", LocalTime.parse("06:35"), LocalTime.parse("07:29")));
		kbs2.addschedule(new TvShow("굿모닝 대한민국", LocalTime.parse("07:30"), LocalTime.parse("08:49")));
		kbs2.addschedule(new TvShow("생생정보 스페셜", LocalTime.parse("08:50"), LocalTime.parse("09:29")));
		kbs2.addschedule(new TvShow("일일 드라마", LocalTime.parse("09:30"), LocalTime.parse("10:09")));
		kbs2.addschedule(new TvShow("KBS 아침 뉴스", LocalTime.parse("10:10"), LocalTime.parse("10:29")));
		kbs2.addschedule(new TvShow("인간극장", LocalTime.parse("10:30"), LocalTime.parse("11:09")));
		kbs2.addschedule(new TvShow("드라마", LocalTime.parse("11:10"), LocalTime.parse("12:29")));
		kbs2.addschedule(new TvShow("드라마", LocalTime.parse("12:30"), LocalTime.parse("13:49")));
		kbs2.addschedule(new TvShow("무엇이든 물어보세요", LocalTime.parse("13:50"), LocalTime.parse("14:59")));
		kbs2.addschedule(new TvShow("어린이 동물티비", LocalTime.parse("15:00"), LocalTime.parse("15:59")));
		kbs2.addschedule(new TvShow("불후의 명곡", LocalTime.parse("16:00"), LocalTime.parse("17:14")));
		kbs2.addschedule(new TvShow("뮤직뱅크", LocalTime.parse("17:15"), LocalTime.parse("18:34")));
		kbs2.addschedule(new TvShow("2TV 생생정보", LocalTime.parse("18:35"), LocalTime.parse("19:49")));
		kbs2.addschedule(new TvShow("일일 드라마", LocalTime.parse("19:50"), LocalTime.parse("20:29")));
		kbs2.addschedule(new TvShow("해피투게더", LocalTime.parse("20:30"), LocalTime.parse("22:09")));
		kbs2.addschedule(new TvShow("옥탑방의 문제아들", LocalTime.parse("22:10"), LocalTime.parse("23:09")));
		kbs2.addschedule(new TvShow("더 시즌즈", LocalTime.parse("23:30"), LocalTime.parse("01:10")));
		
		this.channels.add(kbs2);
	}
	
	public void sbsScheduling() {
		Schedule sbs = new Schedule("SBS");

		sbs.addschedule(new TvShow("히든카드", LocalTime.parse("05:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("모닝와이드", LocalTime.parse("06:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("맨 인 블랙박스", LocalTime.parse("08:40"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("좋은 아침", LocalTime.parse("08:50"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("SBS 10 뉴스", LocalTime.parse("09:55"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("꾸러기 탐구생활", LocalTime.parse("10:30"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("접속! 무비월드", LocalTime.parse("11:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("SBS 12 뉴스", LocalTime.parse("12:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("미니미니 미니니", LocalTime.parse("12:45"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("보석이네 건강수다", LocalTime.parse("13:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("뉴스브리핑", LocalTime.parse("14:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("내일은 태권왕 2", LocalTime.parse("15:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("세 개의 시선", LocalTime.parse("16:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("SBS 오뉴스", LocalTime.parse("17:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("동물농장", LocalTime.parse("17:10"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("생방송 투데이", LocalTime.parse("18:10"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("뉴스헌터스", LocalTime.parse("19:00"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("SBS 8 뉴스", LocalTime.parse("19:50"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("궁금한 이야기 Y", LocalTime.parse("20:50"), LocalTime.parse("01:10")));
		sbs.addschedule(new TvShow("드라마", LocalTime.parse("21:50"), LocalTime.parse("00:29")));
		sbs.addschedule(new TvShow("틈만 나면", LocalTime.parse("00:30"), LocalTime.parse("02:10")));
		
		this.channels.add(sbs);
	}
	
	public void ebsScheduling() {
		Schedule ebs = new Schedule("EBS");

		ebs.addschedule(new TvShow("왕초보 영어", LocalTime.parse("05:00"), LocalTime.parse("05:29")));
		ebs.addschedule(new TvShow("지식채널e", LocalTime.parse("05:30"), LocalTime.parse("05:49")));
		ebs.addschedule(new TvShow("한국기행", LocalTime.parse("05:50"), LocalTime.parse("06:09")));
		ebs.addschedule(new TvShow("세계테마기행", LocalTime.parse("06:10"), LocalTime.parse("06:59")));
		ebs.addschedule(new TvShow("뽀로로", LocalTime.parse("07:00"), LocalTime.parse("07:29")));
		ebs.addschedule(new TvShow("어린이 애니메이션", LocalTime.parse("07:30"), LocalTime.parse("09:29")));
		ebs.addschedule(new TvShow("EBS 시청자 리포트", LocalTime.parse("09:30"), LocalTime.parse("10:34")));
		ebs.addschedule(new TvShow("최고의 요리비결", LocalTime.parse("10:35"), LocalTime.parse("11:04")));
		ebs.addschedule(new TvShow("세계테마기행", LocalTime.parse("11:05"), LocalTime.parse("12:09")));
		ebs.addschedule(new TvShow("EBS 초대석", LocalTime.parse("12:10"), LocalTime.parse("13:04")));
		ebs.addschedule(new TvShow("한국기행", LocalTime.parse("13:05"), LocalTime.parse("13:24")));
		ebs.addschedule(new TvShow("EBS 평생학교", LocalTime.parse("13:25"), LocalTime.parse("14:09")));
		ebs.addschedule(new TvShow("기획강연", LocalTime.parse("14:10"), LocalTime.parse("14:54")));
		ebs.addschedule(new TvShow("지식채널e", LocalTime.parse("14:55"), LocalTime.parse("15:19")));
		ebs.addschedule(new TvShow("어린이 애니메이션", LocalTime.parse("15:20"), LocalTime.parse("17:09")));
		ebs.addschedule(new TvShow("도토리 문화센터", LocalTime.parse("17:10"), LocalTime.parse("17:39")));
		ebs.addschedule(new TvShow("자이언트 펭TV", LocalTime.parse("17:40"), LocalTime.parse("17:59")));
		ebs.addschedule(new TvShow("EBS 뉴스", LocalTime.parse("18:00"), LocalTime.parse("18:49")));
		ebs.addschedule(new TvShow("최후의 인류", LocalTime.parse("18:50"), LocalTime.parse("19:44")));
		ebs.addschedule(new TvShow("건축탐구", LocalTime.parse("19:45"), LocalTime.parse("20:39")));
		ebs.addschedule(new TvShow("세계테마기행", LocalTime.parse("20:40"), LocalTime.parse("21:34")));
		ebs.addschedule(new TvShow("한국기행", LocalTime.parse("21:35"), LocalTime.parse("21:54")));
		ebs.addschedule(new TvShow("명의", LocalTime.parse("21:55"), LocalTime.parse("22:49")));
		ebs.addschedule(new TvShow("취미는 과학", LocalTime.parse("22:50"), LocalTime.parse("23:44")));
		ebs.addschedule(new TvShow("위대한 수업", LocalTime.parse("23:45"), LocalTime.parse("00:04")));
		ebs.addschedule(new TvShow("프로그램 13", LocalTime.parse("00:05"), LocalTime.parse("00:19")));
		
		this.channels.add(ebs);
	}
	
	public Schedule get(int idx) {
		if(idx > this.channels.size() || idx < 0) {
			return null;
		}
		return this.channels.get(idx);
	}
	
	public void channelPlaying(LocalTime now) {
		for(int i = 0; i < this.channels.size(); i++) {
			Schedule chan = this.get(i);
			
			chan.nowPlayingShow(now);
		}
	}
	
}
