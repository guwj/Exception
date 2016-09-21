package day0921;

public class MyException extends Exception {
	private static final long serialVersionUID = 3887644718029065027L;
	
	public MyException(){
		super("MyException Occurs");
	}
	
	public MyException(String message) {
		super(message);
	}
}
