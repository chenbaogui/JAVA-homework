import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
	System.out.println("\n\t\t��ӭʹ���������ع���ϵͳ");
	System.out.println("\t\t\t1.��½ϵͳ\n");
	System.out.println("\t\t\t2.�˳�\n");
	System.out.println("************************************************\n");
	
	System.out.print("��ѡ���������֣�");
	Scanner input = new Scanner(System.in);
	if(input.hasNextInt()==true){
		int num = input.nextInt();
		switch(num){
		case 1:
			System.out.println("\n\t\t��ӭʹ���������ع���ϵͳ\n");
			System.out.println("************************************************\n");
			System.out.println("\t\t\t1.�ͻ���Ϣ����\n");
			System.out.println("\t\t\t2.�������\n");
			System.out.println("\t\t\t3.����ع�\n");
			System.out.println("\t\t\t4.ע��\n");
			System.out.println("************************************************\n");
			System.out.println("��ѡ���������֣�");
			break;
		case 2:
			System.out.println("лл����ʹ�ã�");
			break;
		default:
			System.out.println("��������");
			break;
		}
		
	}else{
		System.out.println("��������ȷ�����֣�");
	}
	
	
	
	}

}
