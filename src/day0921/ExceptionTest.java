package day0921;

public class ExceptionTest {

	public static void main(String[] args) {
		int a = 0;
		int k = 0;
		
		try {
			System.out.println("파일을 열었음");
			
			k = 1000 / a;
			System.out.println("more code...");
			
		} catch (ArithmeticException ex) {
			//1. 로그 남기기(파일로)
			
			
			//2. 사과(정상종료)
			System.out.println("죄송하빈다. 예예");
			
			
			//3. 어디서 에러 발생했는지 추적
			//ex.printStackTrace();
			return;
		}finally{
			System.out.println("자원정리를 해야 함");
		}
		
		System.out.println("결과는 : " + k);
	}

}
