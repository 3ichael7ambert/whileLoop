package Java.whileLoop;

public class whileLoopBreak {
	public static void main(String[ ] args) {
		int x = 1;

		while(x < 10) {
			System.out.println(x);
			if(x == 4) {
				break;
			}
			x++;
		}
	}
}