package test;

import java.util.concurrent.ConcurrentHashMap;

public class Demo4 {
	public static void main(String[] args) {
		ConcurrentHashMap<String, Object> map = new ConcurrentHashMap<String, Object>();
		map.put("张三", "我是张三");
		map.put("李四", "我是李四");
		map.put(null, null);
		System.out.println(map.toString());
	}

}
