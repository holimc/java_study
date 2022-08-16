package ex16;

/*
a new car-share app allows user to schedule a time to rent a specific car.
given a collection of car rental times, implement the canScheduleAll method which, efficiently with respect to time used, checks if all rental times can be scheduled, without having two or more over lap

for example, for the rental times below, the method should return true because they don't overlap

차를 빌리는 시간을 예약하는 카쉐어 앱
렌터카 시간을 고려할때 두번이상 겹치지않고 모든 렌탈시간을 확인할수 있는 메서드 canScheduleAll을 구현

예시의 시간들은 중복되지 않으므로 true가 반환된다.

*/

import java.util.*;
import java.text.SimpleDateFormat;

public class CarRental {
public static Boolean canScheduleAll(Collection<RentalTime> rentalTimes) {
	//throw new UnsupportedOperationException("Waiting to be implemented.");
    
    boolean answer = true;
    ArrayList<RentalTime> rtList = (ArrayList<RentalTime>) rentalTimes;
    int length = rentalTimes.size();
    
    for(int i=0; i<length; i++) {
    	System.out.println(i);
    	RentalTime rt = rtList.get(i);
    	long start = rt.getStart().getTime();
    	long end = rt.getEnd().getTime();
    	System.out.println("렌트 시작시간 : " + rt.getStart());
    	System.out.println("렌트 종료시간 : " + rt.getEnd());
    	
    	for(int j=0; j<length; j++) {
    		if(i!=j && answer == true) {
    			RentalTime compare = rtList.get(j);
    			long compStart = compare.getStart().getTime();
    			long compEnd = compare.getEnd().getTime();
    			System.out.println("비교 렌트 시작시간 : " + compare.getStart());
    	    	System.out.println("비교 렌트 종료시간 : " + compare.getEnd());
    			
    			// 비교 -> start와 end 사이에 다른 스케쥴의 시간이 있어서는 안된다.
    			// start >= compEnd || end <= compStart
    			// end <= compStart, end < compEnd
    			if(start >= compEnd || end <= compStart) {
    				answer = true;
    				System.out.println("렌트 시간 안겹침");
    			}else {
    				answer = false;
    				System.out.println("렌트시간 겹침");
    			}
    		}
    	}
    }
    
    
    return answer;
}


// 메인 메서드
public static void main(String[] args) throws Exception {
    SimpleDateFormat sdf = new SimpleDateFormat("d/M/y H:m");
    // 시간양식을 지정해 담을 sdf
    ArrayList<RentalTime> rentalTimes = new ArrayList<RentalTime>();
    // 시간을 담을 List rentalTimes
    rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 19:00"), sdf.parse("03/05/2020 20:30")));
    rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 22:10"), sdf.parse("03/05/2020 22:30")));
    rentalTimes.add(new RentalTime(sdf.parse("03/05/2020 20:30"), sdf.parse("03/05/2020 22:00")));
    // key값 = 렌탈 시작시간, Value값 = 렌탈 종료시간

    System.out.println(CarRental.canScheduleAll(rentalTimes));
}
}

class RentalTime {
private Date start, end;

public RentalTime(Date start, Date end) {
    this.start = start;
    this.end = end;
}

public Date getStart() {
    return this.start;
}

public Date getEnd() {
    return this.end;
} 
}