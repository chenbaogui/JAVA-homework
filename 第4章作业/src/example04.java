import java.util.Scanner;

public class example04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int year = input.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%400==0)){
			System.out.print("�������·ݣ�");
			int month =input.nextInt();
			switch(month){
			case 1:
			case 3:	
			case 5:
			case 7:	
			case 8:	
			case 10:		
			case 12:		
				System.out.print(year+"��"+month+"����31��");
				break;
			case 4:	
			case 6:	
			case 9:		
			case 11:		
				System.out.println(year+"��"+month+"����30��");
				break;	
			case 2:		
				System.out.println(year+"��"+month+"����29��");
				break;		
			default:
				break;
				
			}
		}else{
			System.out.print("�������·ݣ�");
			int month =input.nextInt();
			switch(month){
			case 1:
			case 3:	
			case 5:
			case 7:	
			case 8:	
			case 10:		
			case 12:		
				System.out.println(year+"��"+month+"����31��");
				break;
			case 4:	
			case 6:	
			case 9:		
			case 11:		
				System.out.println(year+"��"+month+"����30��");
				break;	
			case 2:		
				System.out.println(year+"��"+month+"����28��");
				break;		
			default:
				break;
								
			}
		}
		
		
		
		
	}

}
