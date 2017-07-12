import java.util.Scanner;

public class Praetise004 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入小写字母：");
		char lowLetter = input.next().charAt(0);
		char upperLetter =(char) (lowLetter - 32);
		switch(lowLetter){	
			case 'a':
			case 'b':		
			case 'c':
			case 'd':
			case 'e':	
				System.out.println(lowLetter+"=>"+upperLetter);	
				break;
			default:
				System.out.println("仅支持");	
				break;
				
				
				
		}
		
		

	}

}
