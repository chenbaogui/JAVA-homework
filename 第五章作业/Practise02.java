import java.util.Scanner;

public class Practise02 {

	public static void main(String[] args) {
	System.out.println("MyShopping����ϵͳ>�������\n");
	System.out.println("*************************************");
	System.out.println("��ѡ�������Ʒ��ţ�");
	System.out.println("1.T��\t 2.����Ь \t 3.������");
	System.out.println("*************************************");
	
	Scanner input = new Scanner(System.in);	
	String name = "";
	double price = 0.0;
	int num = 0;
	String answer ="y";
	while("y".contentEquals(answer)){
		System.out.print("��������Ʒ��ţ�");
		num = input.nextInt();
		switch(num){		
			case 1:
				name = "T��";
				price = 245.0;
				break;
			case 2:
				name = "����Ь";
				price = 570.0;
				break;	
			case 3:
				name = "������";
				price = 320.0;
				break;	
								
		}
		System.out.println(name+"\t"+"��"+price+"\n");		
		System.out.print("�Ƿ������y/n��");
		answer = input.next();
		
		
	}
	
	System.out.println("�������");
	
	
	}

}
