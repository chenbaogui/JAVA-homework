import java.util.Scanner;

public class Practise02 {

	public static void main(String[] args) {
	System.out.println("MyShopping管理系统>购物结算\n");
	System.out.println("*************************************");
	System.out.println("请选择购买的商品编号：");
	System.out.println("1.T恤\t 2.网球鞋 \t 3.网球拍");
	System.out.println("*************************************");
	
	Scanner input = new Scanner(System.in);	
	String name = "";
	double price = 0.0;
	int num = 0;
	String answer ="y";
	while("y".contentEquals(answer)){
		System.out.print("请输入商品编号：");
		num = input.nextInt();
		switch(num){		
			case 1:
				name = "T恤";
				price = 245.0;
				break;
			case 2:
				name = "网球鞋";
				price = 570.0;
				break;	
			case 3:
				name = "网球拍";
				price = 320.0;
				break;	
								
		}
		System.out.println(name+"\t"+"￥"+price+"\n");		
		System.out.print("是否继续（y/n）");
		answer = input.next();
		
		
	}
	
	System.out.println("程序结束");
	
	
	}

}
