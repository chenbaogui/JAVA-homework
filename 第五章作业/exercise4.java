import java.util.Scanner;

public class exercise4 {
	public static void main(String[] args) {
	int max = 0 ;
	int min = 0;	
	Scanner input = new Scanner(System.in);
	System.out.print("������һ������������0��������");
	int num = input.nextInt();
		while (num!=0){
			
			if(max<num){
				max = num;
			}
			else if(min>num){
				min = num;
				
			}
			System.out.print("������һ������������0��������");
			 num = input.nextInt();
		}
		System.out.println("���ֵ:"+max+"��Сֵ��"+min);
	}
}
