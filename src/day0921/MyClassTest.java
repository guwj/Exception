package day0921;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		
		try {
			myClass.dangerousMethod();
		} 
		// 각각 catch 해주기
//		catch (IOException e) {
//			e.printStackTrace();
//		}catch ( MyException e){
//			e.printStackTrace();
//		}
		// Exception의 조상 클래스인 Exception으로 파라미터 받기
//		catch(Exception e){
//			e.printStackTrace();
//		}
		// or로 받기
		catch(IOException | MyException e){
			e.printStackTrace();
		}
	}

}
