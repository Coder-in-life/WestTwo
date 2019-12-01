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
		//材料类构造测试
		
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
		//进货函数测试
		
		WestTwoTeaShop.SellMilkTea("珍珠奶茶1","Bubble");
		WestTwoTeaShop.SellMilkTea("珍珠奶茶2","Bubble");
		WestTwoTeaShop.SellMilkTea("珍珠奶茶3","Bubble");
		WestTwoTeaShop.SellMilkTea("珍珠奶茶4","Bubble");
		WestTwoTeaShop.SellMilkTea("珍珠奶茶5","Bubble");
		WestTwoTeaShop.SellMilkTea("珍珠奶茶6","Bubble");
		//BubbleSell接口以及自定义异常类测试
		
		WestTwoTeaShop.SellMilkTea("椰果奶茶1","Coconut");
		WestTwoTeaShop.SellMilkTea("椰果奶茶2","Coconut");
		WestTwoTeaShop.SellMilkTea("椰果奶茶3","Coconut");
		WestTwoTeaShop.SellMilkTea("椰果奶茶4","Coconut");
		WestTwoTeaShop.SellMilkTea("椰果奶茶5","Coconut");
		WestTwoTeaShop.SellMilkTea("椰果奶茶6","Coconut");
		//CoconutSell接口及自定义异常类测试

	}

}
