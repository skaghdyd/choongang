package chap13;

import java.util.ArrayList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		System.out.println(list2.get(0));
		
		List list = new ArrayList();
		list.add("hello");
		String str = (String) list.get(0);
		System.out.println(str);
		
		Object obj = list.get(0);
		System.out.println(obj);

	}

}
