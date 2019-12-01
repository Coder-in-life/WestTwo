package homework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class Ingredient {
	protected String name;
	protected Calendar cal=Calendar.getInstance();
	protected int Exp;
	public Ingredient (String Name,int year,int month,int date,int EXP) {
		this.name=Name;
		this.Exp=EXP;
		cal.set(year, month-1, date);
	}
	
	
	public String toString() {
		return "配料名称为："+this.name+"\n生产日期："+this.cal.get(Calendar.YEAR)+"."+(this.cal.get(Calendar.MONTH)+1)+"."+this.cal.get(Calendar.DATE)+"\n保质期："+this.Exp+"天\n";
	}
	
	public boolean CheckExp() {
		Calendar now=Calendar.getInstance();
		Calendar exp=Calendar.getInstance();
		exp.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DATE));
		exp.add(Calendar.DATE, Exp);
		if (exp.before(now)) return false;
		else return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
