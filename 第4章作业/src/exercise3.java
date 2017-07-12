import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入刘珊java课程考试成绩：");
		int score = input.nextInt();
		int num = score / 10;
		switch(num){
		case 10:
			System.out.println("父亲给买一部车。");
			break;
		case 9:
		case 8:	
		case 7:	
			System.out.println("母亲给买一部笔记本电脑。");
			break;	
		case 6:	
			System.out.println("母亲给买一部手机。");
			break;		
		default:
			System.out.println("没有礼物。");
			break;
		}
	}

}
