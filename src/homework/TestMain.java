package homework;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble b1=new Bubble(2019,12,6);
		Bubble b2=new Bubble(2019,12,1);
		Bubble b3=new Bubble(2019,11,26);
		Bubble b4=new Bubble(2019,12,5);
		Bubble b5=new Bubble(2019,12,5);
		Coconut c1=new Coconut(2019,12,6);
		Coconut c2=new Coconut(2019,12,1);
		Coconut c3=new Coconut(2019,11,29);
		Coconut c4=new Coconut(2019,12,5);
		Coconut c5=new Coconut(2019,12,5);
		
		System.out.print(b1);
		System.out.print(c1);
		//�����๹�����
		
		TeaShop WestTwoTeaShop=new TeaShop();
		WestTwoTeaShop.BuyIngredient(b1);
		WestTwoTeaShop.BuyIngredient(b2);
		WestTwoTeaShop.BuyIngredient(b3);
		WestTwoTeaShop.BuyIngredient(b4);
		WestTwoTeaShop.BuyIngredient(b5);
		WestTwoTeaShop.BuyIngredient(c1);
		WestTwoTeaShop.BuyIngredient(c2);
		WestTwoTeaShop.BuyIngredient(c3);
		WestTwoTeaShop.BuyIngredient(c4);
		WestTwoTeaShop.BuyIngredient(c5);
		//������������
		
		WestTwoTeaShop.SellMilkTea("�����̲�1","Bubble");
		WestTwoTeaShop.SellMilkTea("�����̲�2","Bubble");
		WestTwoTeaShop.SellMilkTea("�����̲�3","Bubble");
		WestTwoTeaShop.SellMilkTea("�����̲�4","Bubble");
		WestTwoTeaShop.SellMilkTea("�����̲�5","Bubble");
		WestTwoTeaShop.SellMilkTea("�����̲�6","Bubble");
		//BubbleSell�ӿ��Լ��Զ����쳣�����
		
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�1","Coconut");
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�2","Coconut");
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�3","Coconut");
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�4","Coconut");
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�5","Coconut");
		WestTwoTeaShop.SellMilkTea("Ҭ���̲�6","Coconut");
		//CoconutSell�ӿڼ��Զ����쳣�����

	}

}
