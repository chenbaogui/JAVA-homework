import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("��������ɺjava�γ̿��Գɼ���");
		int score = input.nextInt();
		int num = score / 10;
		switch(num){
		case 10:
			System.out.println("���׸���һ������");
			break;
		case 9:
		case 8:	
		case 7:	
			System.out.println("ĸ�׸���һ���ʼǱ����ԡ�");
			break;	
		case 6:	
			System.out.println("ĸ�׸���һ���ֻ���");
			break;		
		default:
			System.out.println("û�����");
			break;
		}
	}

}
