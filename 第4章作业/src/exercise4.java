import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("�������·ݣ�");
		int month = input.nextInt();
		System.out.print("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2\t");
		int airClass =input.nextInt();
		double price = 5000;
		switch(month){
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
				if(airClass==1){
					System.out.println("��Ļ�Ʊ�۸�Ϊ"+(price*0.9));
					break;
				}else{
					System.out.println("��Ļ�Ʊ�۸�Ϊ"+(price*0.8));
					break;					
				}
			case 1:
			case 2:
			case 3:
			case 11:
			case 12:
				if(airClass==1){
					System.out.println("��Ļ�Ʊ�۸�Ϊ"+(price*0.5));
					break;
				}else{
					System.out.println("��Ļ�Ʊ�۸�Ϊ"+(price*0.4));
					break;					
				}
			default:
				System.out.println("��������������������");
				break;
				
		
		}
	}

}
