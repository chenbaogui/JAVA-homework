import java.util.Scanner;

public class eaxmple05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month =input.nextInt();
		
		switch(month){
		case 1:
		case 3:	
		case 5:
		case 7:	
		case 8:	
		case 10:		
		case 12:		
			System.out.print(year+"年"+month+"月有31天");
			break;
		case 4:	
		case 6:	
		case 9:		
		case 11:		
			System.out.println(year+"年"+month+"月有30天");
			break;	
		case 2:	
			if((year%4==0&&year%100!=0)||(year%400==0)){
				System.out.println(year+"年"+month+"月有29天");
				break;					
			}else{
				System.out.println(year+"年"+month+"月有28天");
				break;					
			}
							
		default:
			System.out.println("你输入有误请重新输入");
			break;
			
		}
		
		
		
	
	}

}
