import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����������1��7������0��������");					
			int num = input.nextInt();				
			while(num!=0){
				switch(num){
				case 1:
				System.out.println("������MON");
					break;
				case 2:
					System.out.println("������TUE");
					break;	
				case 3:
					System.out.println("������WED");
					break;	
				case 4:
					System.out.println("������THU");
					break;	
				case 5:
					System.out.println("������");
					break;	
				case 6:
					System.out.println("������SAT");
					break;	
				case 7:
					System.out.println("������SUN");
					break;
				default:
					System.out.println("����������");
				}
				
				System.out.print("����������1��7������0��������");
				num = input.nextInt();	
			}
			System.out.println("���������");
						
			
		

	}

}
