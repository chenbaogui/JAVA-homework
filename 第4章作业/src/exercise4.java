import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入月份：");
		int month = input.nextInt();
		System.out.print("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2\t");
		int airClass =input.nextInt();
		double price = 5000;
		switch(month){
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				if(airClass==1){
					System.out.println("你的机票价格为"+(price*0.9));
					break;
				}else{
					System.out.println("你的机票价格为"+(price*0.8));
					break;					
				}
			case 1:
			case 2:
			case 3:
			case 11:
			case 12:
				if(airClass==1){
					System.out.println("你的机票价格为"+(price*0.5));
					break;
				}else{
					System.out.println("你的机票价格为"+(price*0.4));
					break;					
				}
			default:
				System.out.println("您输入有误请重新输入");
				break;
				
		
		}
	}

}
