
public class Lcm {

	public static void main(String[] args) {
		int a=1024,b=512,lcm;
		lcm=(a>b)?a:b;
		while(true){
			if(lcm%a==0&&lcm%b==0) {
				System.out.printf("LCM of %d and %d is %d.",+a,+b,+lcm);
			break;
	}
			++lcm;
		}
}
}
