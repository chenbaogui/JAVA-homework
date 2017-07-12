import java.util.Scanner;

public class exanple03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入今天星期几：");
		String week = input.next();
		switch(week){
		case "星期二" :
		case "星期三" :	
		case "星期五" :	
		case "星期六" :	
			System.out.println("在学校上课。");
			break;
		case "星期一" :	
			System.out.println("在宿舍预习下一章知识。");
			break;
		case "星期四" :	
			System.out.println("来学校上自习。");
			break;	
		case "星期日" :	
			System.out.println("出去玩。");
			break;		
		default:
			break;
			
		}
		
		
		
	}

}
