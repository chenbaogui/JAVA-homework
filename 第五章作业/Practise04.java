import java.util.Scanner;

public class Practise04 {

	public static void main(String[] args) {
		System.out.println("��ӭʹ��MyShopping����ϵͳ\n");
		System.out.println("*******************************************");
		System.out.println("\t\t 1.�ͻ���Ϣ����");
		System.out.println("\t\t 2.�������");
		System.out.println("\t\t 3.���������");
		System.out.println("\t\t 4.ע��");
		System.out.println("*******************************************\n");
		Scanner input = new Scanner(System.in);
		boolean isChoice = true;
		System.out.print("��ѡ���������֣�");
		int num = input.nextInt();
		do{			
			switch(num){
			case 1:
				System.out.println("1.�ͻ���Ϣ����");
				isChoice = true;
				break;
			case 2:
				System.out.println("2.�������");
				isChoice = true;
				break;	
			case 3:
				System.out.println("3.���������");
				isChoice = true;
				break;	
			case 4:
				System.out.println("4.ע��");
				isChoice = true;
				break;
			default:
				System.out.print("��������������������֣�");
				num =input.nextInt();
				isChoice = false;;
				break;
			}
			
		}while(isChoice == false);
		
		System.out.println("\n�������");
	}

}
