package homework;

public class SoldOutException extends Exception {
	private String ErrorMessage;
	SoldOutException(String Message){
		ErrorMessage=Message;
	}
	
	public void PrintMessage() {
		System.out.print(ErrorMessage);
	}
	//输出相应的错误信息
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
