import java.util.Scanner;

public class exercise4 {
	public static void main(String[] args) {
	int max = 0 ;
	int min = 0;	
	Scanner input = new Scanner(System.in);
	System.out.print("请输入一个整数（输入0结束）：");
	int num = input.nextInt();
		while (num!=0){
			
			if(max<num){
				max = num;
			}
			else if(min>num){
				min = num;
				
			}
			System.out.print("请输入一个整数（输入0结束）：");
			 num = input.nextInt();
		}
		System.out.println("最大值:"+max+"最小值："+min);
	}
}
