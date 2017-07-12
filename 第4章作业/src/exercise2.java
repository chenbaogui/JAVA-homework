import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入今天星期几：");
		int num = input.nextInt();
		
		switch(num){
			case 1:
			case 3:
			case 5:{
				System.out.println("学习编程");
				break;
			}
			
			case 2:
			case 4:
			case 6:{
				System.out.println("学习英语");
				break;
			}
			
			case 7:{
				System.out.println("休息");
				break;
			}
			
			default:{
				System.out.println("请输入正确的信息");
			}
				
		
		}

	}

}
