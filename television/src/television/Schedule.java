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
		if(idx >= this.tvSchedule.size() || idx < 0) {
			return null;
		}
		return this.tvSchedule.get(idx);
	}
	
	public void nowPlayingShow(LocalTime nowTime) {
		if(!nowTime.isBefore(MID_NIGHT) && nowTime.isBefore(this.tvSchedule.get(0).getStartTime() ) ) {
			System.out.println("방영중인 시간이 아닙니다.");
			return;
		}
		
		for (int i = 0; i < this.tvSchedule.size()-1; i++) {
			TvShow current = this.tvSchedule.get(i);
			TvShow next = this.tvSchedule.get(i+1);
			
			if(!nowTime.isBefore(current.getStartTime()) && nowTime.isBefore(next.getStartTime() ) )  {
				System.out.println(current.getName());
				return;
			}
		}
		TvShow lastShow = this.tvSchedule.get(tvSchedule.size()-1);
		if(!nowTime.isBefore(lastShow.getStartTime())) {
			System.out.println(lastShow.getName());
		}
	}
	
	public void print() {
		for(int i = 0; i < this.tvSchedule.size(); i++) {
			System.out.println(this.tvSchedule.get(i));
		}
	}
}
