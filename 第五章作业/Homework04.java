import java.util.Scanner;

public class Homework04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
		int year = input.nextInt();
		System.out.print("请输入月份：");
		int month = input.nextInt();
		System.out.print("请输入日期：");
		int day = input.nextInt();		
		int yearDay = 0;
		int monthDay = 0;
		int i =1900;
		while(year-1>=i){
			if((i%4==0&&i%100!=0)||(i%400==0)){
				yearDay+=366;
			}else{
				yearDay+=365;
			}
			i++;
		}
		
		
		while(month-1>0){
			switch(month){
			case 1:
			case 3:	
			case 5:
			case 7:	
			case 8:	
			case 10:		
			case 12:		
				monthDay+=31;
				break;
			case 4:	
			case 6:	
			case 9:		
			case 11:		
				monthDay+=30;
				break;	
			case 2:	
				if((year%4==0&&year%100!=0)||(year%400==0)){
					monthDay+=29;
					break;					
				}else{
					monthDay+=28;
					break;					
				}								
					
			}
			month--;								
		}
		int total = 0;
		total =yearDay+monthDay+day;
		
		System.out.println(total);
		
		
	}
}
