
public class exercise3 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
			
		do{
			if(i%7==0)	{
				sum+=i;
			}
			i++;
		}while(i<=50);
		
		System.out.println("1~50中式7的倍数的数值之和为"+sum);	
				
	}

}
