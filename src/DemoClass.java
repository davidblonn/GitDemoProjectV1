
public class DemoClass {

	public static void main(String[] args) {
		
		int j = 9;
		while(j >= 0) {
			int m = j;
			while(m >= 0) {
				System.out.print(m + " ");
				m--;
			}
			System.out.println();
			j--;
		}
		
		for(int i = 9; i >= 0; i--) {
			for(int k = i; k >= 0; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}


}
