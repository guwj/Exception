package day0921;

import java.io.IOException;

public class MyClass {
	public void dangerousMethod() throws MyException, IOException {
		boolean isDanger = true;
		System.out.println("normal...");
		if (isDanger) {
			// 예외상황 발생
			// ex) network 오류, io 오류
			throw new MyException("예외 상황이 발생하였습니다");
		}
		System.out.println("normal...");
	}
}
