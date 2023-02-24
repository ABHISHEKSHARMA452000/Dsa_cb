package assignments;
import java.util.*;;
public class Print_ArmstrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        for(int i = n1;i<=n2;i++){
            int digits = countofdigits(i);
            IsArmstrong(i,digits);
        }
	}
	public static int countofdigits(int number){
        int c = 0;
        while(number > 0){
            number = number/10;
            c++;
        }
        return c;
    }
	public static void IsArmstrong(int number,int digits){
        int sum = 0;
        int temp = number;
        while(number > 0){
            int rem = number%10;
            sum = sum + (int)Math.pow(rem,digits);
            number = number/10;
        }
        if(sum == temp){
            System.out.println(temp);
        }
    }

}
