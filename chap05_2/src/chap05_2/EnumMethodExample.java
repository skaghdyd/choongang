package chap05_2;

import java.util.Calendar;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week today = Week.WEDNESDAY;
		
		//name() 메소드
		String name = today.name();
		System.out.println(name);
		System.out.println("------------------------------------");
		
		//ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		System.out.println("------------------------------------");
		//compareTo() 메소드
		Week day1 = Week.MONDAY; //0
		Week day2 = Week.WEDNESDAY;//2
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println("------------------------------------");
		
		//valueOf() 메소드
		Week weekDay = Week.valueOf("SATURDAY");
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말 이군요");
		} else {
			System.out.println("평일 이군요");				
		}
		System.out.println("------------------------------------");
		
		//values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		
	}

}
