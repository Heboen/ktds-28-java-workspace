package television;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TvShow {
	
	private String name;
	private LocalTime startTime;
	
	public TvShow(String name, LocalTime startTime) {
		this.name = name;
		this.startTime = startTime;
	}

	public String getName() {
		return this.name;
	}

	public LocalTime getStartTime() {
		return this.startTime;
	}
	
	@Override
	public String toString() {
		return this.getName() + " " + this.getStartTime();
	}
	
}
