import java.util.Scanner;

public class Practise04 {

	public static void main(String[] args) {
		System.out.println("欢迎使用MyShopping管理系统\n");
		System.out.println("*******************************************");
		System.out.println("\t\t 1.客户信息管理");
		System.out.println("\t\t 2.购物结算");
		System.out.println("\t\t 3.客真情回馈");
		System.out.println("\t\t 4.注销");
		System.out.println("*******************************************\n");
		Scanner input = new Scanner(System.in);
		boolean isChoice = true;
		System.out.print("请选择，输入数字：");
		int num = input.nextInt();
		do{			
			switch(num){
			case 1:
				System.out.println("1.客户信息管理");
				isChoice = true;
				break;
			case 2:
				System.out.println("2.购物结算");
				isChoice = true;
				break;	
			case 3:
				System.out.println("3.客真情回馈");
				isChoice = true;
				break;	
			case 4:
				System.out.println("4.注销");
				isChoice = true;
				break;
			default:
				System.out.print("输入错误，请重新输入数字：");
				num =input.nextInt();
				isChoice = false;;
				break;
			}
			
		}while(isChoice == false);
		
		System.out.println("\n程序结束");
	}

}
