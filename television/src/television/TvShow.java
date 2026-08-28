package television;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TvShow {
	
	private String name;
	private LocalTime startTime;
	private LocalTime endTime;
	
	public TvShow(String name, LocalTime startTime, LocalTime endTime) {
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}
	
	public LocalTime getEndTime() {
		return this.endTime;
	}
	
}
