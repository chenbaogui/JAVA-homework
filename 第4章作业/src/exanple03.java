import java.util.Scanner;

public class exanple03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������������ڼ���");
		String week = input.next();
		switch(week){
		case "���ڶ�" :
		case "������" :	
		case "������" :	
		case "������" :	
			System.out.println("��ѧУ�ϿΡ�");
			break;
		case "����һ" :	
			System.out.println("������Ԥϰ��һ��֪ʶ��");
			break;
		case "������" :	
			System.out.println("��ѧУ����ϰ��");
			break;	
		case "������" :	
			System.out.println("��ȥ�档");
			break;		
		default:
			break;
			
		}
		
		
		
	}

}
