package test;

public class Demo5 {
	
	public static void main(String[] args) {
		String result = doing();
		System.out.println(result);
	}

	public static String doing(){
		String a = "AAAAAA";
		try{
			a="CCCCC";
			
			throw new RuntimeException("Å×³öÒì³£ÁË");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			a = a+"BBBB";
			return a;
		}
		
		
	}
}
