import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("�������һ����������");
		double numA = input.nextDouble();
		
		System.out.print("�������������+��-�������£���");
		char opr = input.next().charAt(0);
				
		
		
		System.out.print("������ڶ�����������");
		double numB = input.nextDouble();
		double result = 0.0;
		switch(opr){
			case '+':
			result = numA + numB;
			break;
			
			case '-':
				result = numA - numB;
				break;
				
			case '��':
				result = numA * numB;
				break;	
				
			case '/':
				if(numB==0){
					System.out.println("��������Ϊ��");
				}else{
					result = numA / numB;
				}
				
			case '%':
				if(numB==0){
					System.out.println("��������Ϊ��");
				}else{
					result = numA % numB;
				}
				
			default:
				break;
			
		}
		
		System.out.printf("����Ľ��Ϊ��%.2f %c %.2f = %.2f",numA,opr,numB,result);
		
	}

}
