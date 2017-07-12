import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.print("请输入第一个操作数：");
		double numA = input.nextDouble();
		
		System.out.print("请输入运算符（+、-、×、÷）：");
		char opr = input.next().charAt(0);
				
		
		
		System.out.print("请输入第二个操作数：");
		double numB = input.nextDouble();
		double result = 0.0;
		switch(opr){
			case '+':
			result = numA + numB;
			break;
			
			case '-':
				result = numA - numB;
				break;
				
			case '×':
				result = numA * numB;
				break;	
				
			case '/':
				if(numB==0){
					System.out.println("除数不能为零");
				}else{
					result = numA / numB;
				}
				
			case '%':
				if(numB==0){
					System.out.println("除数不能为零");
				}else{
					result = numA % numB;
				}
				
			default:
				break;
			
		}
		
		System.out.printf("计算的结果为：%.2f %c %.2f = %.2f",numA,opr,numB,result);
		
	}

}
