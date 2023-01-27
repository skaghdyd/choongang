package _jsp19_0126;

import java.util.HashMap;
import java.util.Map;

public class Ther {
	private Map<String, Double> cm = new HashMap<>();

	public void setCel(String loc, Double val) {
		cm.put(loc, val);
	}

	public Double getCel(String loc) {
		return cm.get(loc);
	}
	
	public Double getCel() {
		return cm.get("서울");
	}

	public Double getFah(String loc) {
		Double cel = getCel(loc);
		return cel.doubleValue() * 1.8 + 32.0;
	}
	
	public String getInfo() {
		return "온도변환기";
	}
}
