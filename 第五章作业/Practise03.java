import java.util.Scanner;

public class Practise03 {

	public static void main(String[] args) {
		System.out.println("***************************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t 2.网球鞋 \t 3.网球拍");
		System.out.println("***************************************\n");
		
		String name = "";
		int goodNo = 0;
		double price =0.0;
		int number = 0;	
		double total = 0.0;				
		
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".contentEquals(answer)){
			System.out.print("请输入商品的编号：");
			goodNo  =input.nextInt();
			System.out.print("请输入购买的数量：");
			number  =input.nextInt();
			switch(goodNo){
				case 1:
					name = "T恤";
					price = 245.0;
					total = price * number;
					break;
				case 2:
					name = "网球鞋";
					price = 570.0;
					total = price * number;
					break;
				case 3:
					name = "网球拍";
					price = 320.0;
					total = price * number;	
					break;
								
			}
			System.out.println(name+"￥"+price+"\t"+"数量"+number+"\t"+"合计￥"+total);
			System.out.print("是否继续（y/n）");
			answer = input.next();
						
		}
		System.out.println("折扣：0.8");
		System.out.println("应付金额："+total);
		System.out.print("实付金额：");
		double payment =input.nextDouble();
		System.out.println("找钱："+(payment-total));
	}

}
