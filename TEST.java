
public class TEST {
	public static void main(String[] args) {
		for(int s = 0; s < 36; s++) {
			if(s >= 1 && s <= 5 || s >= 7 && s <= 8 || s >= 14 && s <= 15 || s >= 17 && s <= 21 || s >= 23 && s <= 28 || s >= 35 && s <= 36) {
				System.out.print(" ");	
			}
			else {
				System.out.print("*");	
			}
		}
		System.out.println();
		for(int i = 0; i < 36; i++) {
			if(i >= 1 && i <= 5 || i >= 7 && i <= 8 || i >= 10 && i <= 15 || i >= 17 && i <= 21 || i >= 23 && i <= 27 || i >= 29 && i <= 34) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		for(int a = 0; a < 36; a++) {
			if(a >= 1 && a <= 0 || a >= 7 && a <= 8 || a >= 14 && a <= 15 || a >= 17 && a <= 21 || a >= 23 && a <= 27 || a >= 29 && a <= 34) {
				System.out.print(" ");
				
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		for(int b = 0; b < 36; b++) {
			if(b >= 1 && b <= 5 || b >= 7 && b <= 8 || b >= 10 && b <= 15 || b >= 17 && b <= 21 || b >= 23 && b <= 27 || b >= 29 && b <= 34) {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println();
		for(int c = 0; c < 36; c++) {
			if(c >= 1 && c <= 5 || c >= 7 && c <= 8 || c >= 14 && c <= 15 || c >= 21 && c <= 21 || c >= 27 && c <= 28 || c >= 35 && c <= 36)  {
				System.out.print(" ");
			}
			else {
				System.out.print("*");
			}
		}
	}
	

}
