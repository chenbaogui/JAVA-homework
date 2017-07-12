import java.util.Scanner;

public class Homework05 {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.print("ÇëÊäÈëÕûÊı£º");
				int num = input.nextInt();
				
					while(num!=0){
						int temp =num%10;
						System.out.print(temp);
						num/=10;
					}
					
					
							
				
		}

}

