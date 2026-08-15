package television;

import java.time.LocalTime;

public class Television {
	public static void main(String[] args) {
		Schedule television = new Schedule();
		
		television.addschedule(new TvShow("프로그램 1", LocalTime.parse("03:00"), LocalTime.parse("05:00")));
		television.addschedule(new TvShow("프로그램 2", LocalTime.parse("05:01"), LocalTime.parse("06:31")));
		television.addschedule(new TvShow("프로그램 3", LocalTime.parse("06:31"), LocalTime.parse("08:00")));
		television.addschedule(new TvShow("프로그램 4", LocalTime.parse("08:01"), LocalTime.parse("09:00")));
		television.addschedule(new TvShow("프로그램 5", LocalTime.parse("09:01"), LocalTime.parse("10:00")));
		television.addschedule(new TvShow("프로그램 6", LocalTime.parse("10:01"), LocalTime.parse("12:00")));
		television.addschedule(new TvShow("프로그램 7", LocalTime.parse("12:01"), LocalTime.parse("13:30")));
		television.addschedule(new TvShow("프로그램 8", LocalTime.parse("13:31"), LocalTime.parse("15:00")));
		television.addschedule(new TvShow("프로그램 9", LocalTime.parse("15:01"), LocalTime.parse("17:00")));
		television.addschedule(new TvShow("프로그램 10", LocalTime.parse("17:01"), LocalTime.parse("18:00")));
		television.addschedule(new TvShow("프로그램 11", LocalTime.parse("18:01"), LocalTime.parse("21:00")));
		television.addschedule(new TvShow("프로그램 12", LocalTime.parse("21:01"), LocalTime.parse("23:00")));
		television.addschedule(new TvShow("프로그램 13", LocalTime.parse("23:01"), LocalTime.parse("23:59")));
		
		LocalTime now = LocalTime.of(3,0);
		
		television.nowPlayingShow(now);
	}
}
