package television2;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;


public class Schedule {
	private String name;
	private List<TvShow> tvSchedule;
	
	public Schedule(String name) {
		this.name = name;
		this.tvSchedule = new ArrayList<>();
	}
	
	
	public void addschedule(TvShow show) {
		this.tvSchedule.add(show);
	}
	
	public TvShow get(int idx) {
		if(idx >= this.tvSchedule.size() || idx < 0) {
			return null;
		}
		return this.tvSchedule.get(idx);
	}
	
	public void nowPlayingShow(LocalTime nowTime) {
		for(TvShow show : tvSchedule) {
			LocalTime start = show.getStartTime();
			LocalTime end = show.getEndTime();
			
			// 방영 시간이 자정을 넘어가는 경우
			if(end.isBefore(start)) {
				// 편성표 상의 첫번째 방송의 시작 시간의 전이 아니거나
				// 마지막 방송의 종료 시간의 후가 아니라면
				if(!nowTime.isBefore(start) || !nowTime.isAfter(end)) {
					// 다시말해 마지막 방송시간의 종료시간과 첫번째 방송의 시작시간 사이가 아니라면
					System.out.println(this.name + " " + show.getName() + "이(가) 방영중입니다.");// 현재 방송의 이름을 출력
					return;
				}
			}
			else {//일반 방영 시간
				if(!nowTime.isBefore(start) && !nowTime.isAfter(end)) {
					System.out.println(this.name + " " + show.getName() + "이(가) 방영중입니다.");
					return;
				}
			}
		}
		// for문을 탈출했다는것은 현재 시간에 방영중인 방송이 없다는 것이므로
		System.out.println(this.name + " 방영중인 시간이 아닙니다.");
		
	}
}
