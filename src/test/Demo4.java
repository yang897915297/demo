package test;

import java.util.concurrent.ConcurrentHashMap;

public class Demo4 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>();
		map.put("����", "��������");
		map.put("����", "��������");
		map.put(null, null);
		System.out.println(map.toString());
	}

}
