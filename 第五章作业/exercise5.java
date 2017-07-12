import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入数字1到7（输入0结束）：");					
			int num = input.nextInt();				
			while(num!=0){
				switch(num){
				case 1:
				System.out.println("今天是MON");
					break;
				case 2:
					System.out.println("今天是TUE");
					break;	
				case 3:
					System.out.println("今天是WED");
					break;	
				case 4:
					System.out.println("今天是THU");
					break;	
				case 5:
					System.out.println("今天是");
					break;	
				case 6:
					System.out.println("今天是SAT");
					break;	
				case 7:
					System.out.println("今天是SUN");
					break;
				default:
					System.out.println("请重新输入");
				}
				
				System.out.print("请输入数字1到7（输入0结束）：");
				num = input.nextInt();	
			}
			System.out.println("程序结束！");
						
			
		

	}

}
