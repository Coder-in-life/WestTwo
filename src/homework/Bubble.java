package homework;

import java.util.Calendar;

public class Bubble extends Ingredient{
	public Bubble(int year,int month,int date) {
		super("Bubble",year,month,date,7);
	}
	
	public String toString() {
		return "��������Ϊ��"+super.name+"\n�������ڣ�"+super.cal.get(Calendar.YEAR)+"."+(super.cal.get(Calendar.MONTH)+1)+"."+super.cal.get(Calendar.DATE)+"\n�����ڣ�"+super.Exp+"��\n";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
