import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vedit pervoe chislo");
        Double a = scanner.nextDouble();
        System.out.println("Vedit vtoroe chislo");
        Double b = scanner.nextDouble();
        Double n;
        //System.out.println(a + "+" + b + "="+ n);
        System.out.println("Vedit znak");
        String znak = scanner.next();
        switch(znak) {
        
        case "+":
        	System.out.println(Metod.add(a,b));
        	break;
        case "-":
        	n = a-b;
        	System.out.println(a + "-" + b + "="+ n);
        	break;
        case "/":
        	n = a/b;
        	System.out.println(a + "/" + b + "="+ n);
        	break;
        	
        }
        
	}
}


