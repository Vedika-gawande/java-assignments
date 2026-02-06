package Assignment_01;
public class EvenDigitSum {
	public static void main(String[] args) {
		for(int i=100;i<150;i++) {
			int sum=0,rem=0,num=i;
			while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			}
			if(sum%2==0)
			System.out.println(i);
		}	
	}	
}

