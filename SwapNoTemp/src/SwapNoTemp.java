
public class SwapNoTemp {

	public static void main(String[] args) {
		int a=1,b=2;
		System.out.println("--Before Swap--");
		System.out.println("First value"+a);
		System.out.println("Second value"+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("--After Swap--");
		System.out.println("First value"+a);
		System.out.println("Second value"+b);

	}

}
