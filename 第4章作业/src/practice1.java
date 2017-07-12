import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
	System.out.println("\n\t\t欢迎使用我行我素管理系统");
	System.out.println("\t\t\t1.登陆系统\n");
	System.out.println("\t\t\t2.退出\n");
	System.out.println("************************************************\n");
	
	System.out.print("请选择，输入数字：");
	Scanner input = new Scanner(System.in);
	if(input.hasNextInt()==true){
		int num = input.nextInt();
		switch(num){
		case 1:
			System.out.println("\n\t\t欢迎使用我行我素管理系统\n");
			System.out.println("************************************************\n");
			System.out.println("\t\t\t1.客户信息管理\n");
			System.out.println("\t\t\t2.购物结算\n");
			System.out.println("\t\t\t3.真情回顾\n");
			System.out.println("\t\t\t4.注销\n");
			System.out.println("************************************************\n");
			System.out.println("请选择，输入数字：");
			break;
		case 2:
			System.out.println("谢谢您的使用！");
			break;
		default:
			System.out.println("输入有误");
			break;
		}
		
	}else{
		System.out.println("请输入正确的数字！");
	}
	
	
	
	}

}
