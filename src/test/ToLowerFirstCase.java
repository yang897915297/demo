package test;
/**
 * ����ĸ��дתСд
 * @author lenovo
 *
 */
public class ToLowerFirstCase {

	public static void main(String[] args) {
		System.out.println(toLowerFirstCase("SpringWork"));
	}
	
	public static String toLowerFirstCase(String name){
		char[] chars = name.toCharArray();
		chars[0] +=32;
		return String.valueOf(chars);
	}
}
