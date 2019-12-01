package homework;

import java.util.ArrayList;

public class TeaShop implements Shop{
	public ArrayList<Bubble> BubbleWareHouse= new ArrayList<Bubble>();
	public ArrayList<Coconut> CoconutWareHouse= new ArrayList<Coconut>();
	
	public void BuyIngredient(Ingredient ingredient){
		if (ingredient instanceof Bubble) {
			AddIngredient((Bubble)ingredient);
		}else {
			AddIngredient((Coconut)ingredient);
		}
		
	}
	
	public void AddIngredient(Bubble bub) {
		BubbleWareHouse.add(bub);
	}//Bubble 进货函数
	
	public void AddIngredient(Coconut coc) {

		CoconutWareHouse.add(coc);
		
	}//Coconut 进货函数
	
	public boolean Test(String IngredientName) {
		boolean flag=true;
		if (IngredientName=="Bubble") {
			try {
				OutIngredient(IngredientName);
			}catch (SoldOutException e){
				e.PrintMessage();
				flag=false;
			}catch (Exception e) {
				flag=false;
			}finally {
			}
		}
			if (IngredientName=="Coconut") {
				try {
					OutIngredient(IngredientName);
				}catch (SoldOutException e){
					e.PrintMessage();
					flag=false;
				}catch (Exception e){
					System.exit(1);
					flag=false;
				}
				finally {
				}
			}
			return flag;
	}
	//判断是否仓库为空，如果是则不执行出售，否则出售奶茶。
	
	public void SellMilkTea(String MilkTeaName,String IngredientName){
		int i=0;
		if (IngredientName=="Bubble") {
			Bubble temp = null;
			if (Test(IngredientName)) {
				temp=BubbleWareHouse.get(BubbleWareHouse.size()-1);
				BubbleWareHouse.remove(BubbleWareHouse.size()-1);
				MilkTea milktea=new MilkTea(MilkTeaName,temp);
				System.out.print(milktea);
			}
		}
		if (IngredientName=="Coconut") {
			Coconut temp;
			if (Test(IngredientName)) {
				temp=CoconutWareHouse.get(CoconutWareHouse.size()-1);
				CoconutWareHouse.remove(CoconutWareHouse.size()-1);
				MilkTea milktea=new MilkTea(MilkTeaName,temp);
				System.out.print(milktea);
			}
		}
			
		
	}
	//根据材料出售相应奶茶
	
	public void OutIngredient(String IngredientName) throws Exception{
		int i;
		if (IngredientName=="Bubble") {
			Bubble temp;
			for (i=0;i<BubbleWareHouse.size();i++) {
				temp=BubbleWareHouse.get(BubbleWareHouse.size()-i-1);
				if (temp.CheckExp()) {
					break;
				}else {
					BubbleWareHouse.remove(BubbleWareHouse.size()-i-1);
					i--;
				}
			}
			if (BubbleWareHouse.size()==0) {
				throw new SoldOutException("本店珍珠配料已售空"+"\n");
			}
			
		}
		
		if (IngredientName=="Coconut") {
			Coconut temp;
			for (i=0;i<CoconutWareHouse.size();i++) {
				temp=CoconutWareHouse.get(i);
				if (temp.CheckExp()) {
					break;
				}else{
					CoconutWareHouse.remove(i);
					i--;
				}
			}
			if (CoconutWareHouse.size()==0) {
				throw new SoldOutException("本店椰果配料已售空"+"\n");
			}
		}
	}//从仓库中取出一份材料，判断是否为空以及删除过期材料
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


}
