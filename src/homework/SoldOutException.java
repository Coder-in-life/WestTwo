package homework;

public class SoldOutException extends Exception {
	private String ErrorMessage;
	SoldOutException(String Message){
		ErrorMessage=Message;
	}
	
	public void PrintMessage() {
		System.out.print(ErrorMessage);
	}
	//�����Ӧ�Ĵ�����Ϣ
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
