import java.util.Scanner;

public class Practise03 {

	public static void main(String[] args) {
		System.out.println("***************************************");
		System.out.println("��ѡ�������Ʒ��ţ�");
		System.out.println("1.T��\t 2.����Ь \t 3.������");
		System.out.println("***************************************\n");
		
		String name = "";
		int goodNo = 0;
		double price =0.0;
		int number = 0;	
		double total = 0.0;				
		
		Scanner input = new Scanner(System.in);
		String answer = "y";
		while("y".contentEquals(answer)){
			System.out.print("��������Ʒ�ı�ţ�");
			goodNo  =input.nextInt();
			System.out.print("�����빺���������");
			number  =input.nextInt();
			switch(goodNo){
				case 1:
					name = "T��";
					price = 245.0;
					total = price * number;
					break;
				case 2:
					name = "����Ь";
					price = 570.0;
					total = price * number;
					break;
				case 3:
					name = "������";
					price = 320.0;
					total = price * number;	
					break;
								
			}
			System.out.println(name+"��"+price+"\t"+"����"+number+"\t"+"�ϼƣ�"+total);
			System.out.print("�Ƿ������y/n��");
			answer = input.next();
						
		}
		System.out.println("�ۿۣ�0.8");
		System.out.println("Ӧ����"+total);
		System.out.print("ʵ����");
		double payment =input.nextDouble();
		System.out.println("��Ǯ��"+(payment-total));
	}

}
