package homework;

public class MilkTea {
	int i=1;
	String Name;
	Ingredient ingredient;
	public MilkTea(String MilkTeaName,Ingredient ing) {
		Name=MilkTeaName;
		if (ing instanceof Bubble) {
			ingredient=(Bubble)ing;
		}else ingredient=(Coconut)ing;

	}
	
	public String toString() {
		return "¸Ã±­ÄÌ²èµÄÃû×Ö£º"+Name+"\n"+ingredient+"\n";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	}

}
