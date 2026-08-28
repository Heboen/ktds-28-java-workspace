package television2;

import java.time.LocalTime;

public class Main {
	
	public static void main(String[] args) {
		Channel television = new Channel();
		
		television.kbs1Scheduling();
		television.kbs2Scheduling();
		television.sbsScheduling();
		television.ebsScheduling();
		
		LocalTime now = LocalTime.now();
		
		television.channelPlaying(now);
		
		
	}

}
