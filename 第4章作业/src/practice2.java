import java.util.Scanner;

public class practice2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("请输入消费金额：");
		double money = input.nextDouble();
		
		if(money>=50){
			System.out.println("是否参加优惠换购活动：");
			System.out.println("1：满50元，加2元换购百事可乐饮料一瓶");
			System.out.println("2：满100元，加3元换购500ML可乐一瓶");
			System.out.println("3：满100元，加10元换购5KG面粉");
			System.out.println("4：满200元，加10元换购1个苏泊尔炒菜锅");
			System.out.println("5：满200元，加20元换购欧莱雅爽肤水一瓶");
			System.out.println("0：不换购");
			int num = input.nextInt();
			switch(num){
				case 1:
					System.out.println("本次消费总金额："+(money+2));
					System.out.println("成功换购：1瓶百事可乐饮料。");
					break;
				case 2:
					System.out.println("本次消费总金额："+(money+3));
					System.out.println("成功换购：1瓶500ML可乐。");
					break;	
				case 3:
					System.out.println("本次消费总金额："+(money+10));
					System.out.println("成功换购：1瓶500ML可乐。");
					break;		
				case 4:
					System.out.println("本次消费总金额："+(money+10));
					System.out.println("成功换购：1个苏珀尔炒菜锅。");
					break;		
				case 5:
					System.out.println("本次消费总金额："+(money+20));
					System.out.println("成功换购：1瓶欧莱雅爽肤水。");
					break;	
				case 0:
					System.out.println("不换购。");
					break;						
				default:	
					System.out.println("请输入正确的数字。");
					break;					
			}			
		}
		else{
			System.out.println("消费金额不足50,谢谢使用！");
		}
	}
}
