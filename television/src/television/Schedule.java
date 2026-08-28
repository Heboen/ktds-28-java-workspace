package television;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
	public LocalTime MID_NIGHT = LocalTime.of(0, 0);
	private List<TvShow> tvSchedule;

	public Schedule() {
		this.tvSchedule = new ArrayList<>();
	}

	public void addschedule(TvShow show) {
		this.tvSchedule.add(show);
	}

	public TvShow get(int idx) {
		if (idx >= this.tvSchedule.size() || idx < 0) {
			return null;
		}
		return this.tvSchedule.get(idx);
	}

	public void nowPlayingShow(LocalTime nowTime) {
		for(TvShow show : tvSchedule) {
			LocalTime start = show.getStartTime();
			LocalTime end = show.getEndTime();
			
			if(end.isBefore(start)) {
				if(!nowTime.isBefore(start) || nowTime.isAfter(end)) {
					System.out.println(show.getName());
					return;
				}
			}
			else {
				if(!nowTime.isBefore(start) && !nowTime.isAfter(end)) {
					System.out.println(show.getName());
					return;
				}
			}
		}
		System.out.println("방영중인 시간이 아닙니다.");
		
	}
}
