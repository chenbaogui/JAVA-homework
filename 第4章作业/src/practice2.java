import java.util.Scanner;

public class practice2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("���������ѽ�");
		double money = input.nextDouble();
		
		if(money>=50){
			System.out.println("�Ƿ�μ��Żݻ������");
			System.out.println("1����50Ԫ����2Ԫ�������¿�������һƿ");
			System.out.println("2����100Ԫ����3Ԫ����500ML����һƿ");
			System.out.println("3����100Ԫ����10Ԫ����5KG���");
			System.out.println("4����200Ԫ����10Ԫ����1���ղ������˹�");
			System.out.println("5����200Ԫ����20Ԫ����ŷ����ˬ��ˮһƿ");
			System.out.println("0��������");
			int num = input.nextInt();
			switch(num){
				case 1:
					System.out.println("���������ܽ�"+(money+2));
					System.out.println("�ɹ�������1ƿ���¿������ϡ�");
					break;
				case 2:
					System.out.println("���������ܽ�"+(money+3));
					System.out.println("�ɹ�������1ƿ500ML���֡�");
					break;	
				case 3:
					System.out.println("���������ܽ�"+(money+10));
					System.out.println("�ɹ�������1ƿ500ML���֡�");
					break;		
				case 4:
					System.out.println("���������ܽ�"+(money+10));
					System.out.println("�ɹ�������1����������˹���");
					break;		
				case 5:
					System.out.println("���������ܽ�"+(money+20));
					System.out.println("�ɹ�������1ƿŷ����ˬ��ˮ��");
					break;	
				case 0:
					System.out.println("��������");
					break;						
				default:	
					System.out.println("��������ȷ�����֡�");
					break;					
			}			
		}
		else{
			System.out.println("���ѽ���50,ллʹ�ã�");
		}
	}
}
