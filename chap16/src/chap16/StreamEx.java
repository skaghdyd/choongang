package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍", "신", "김", "갑", "을", "병", "정", "무", "기", "경" ,"신");
		
		System.out.println("for문");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.println();
		System.out.println("---");
		
		System.out.println("Iterator");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print(name);
		}
		
		System.out.println();
		System.out.println("---");
		
		System.out.println("Stream1");
		Stream<String> st = list.stream();
		st.forEach(name->System.out.print(name));
		
		System.out.println();
		System.out.println("---");
		
		System.out.println("Stream2");
		Stream<String> st2 = list.stream();
		st2.forEach(name->System.out.print(name));
	}
}