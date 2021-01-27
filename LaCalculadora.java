import java.util.Scanner;

public class LaCalculadora {

	public static void main(String[] args) {
		System.out.println("LaCalculadora de DAW v0.2A");
		System.out.println("Operaciones disponibles:");
		System.out.println("+,-,*,/");
		 Scanner sc = new Scanner(System.in);
	     double resultado = 0;
	     String operacion;
	     boolean comprobar = true;
	     while (comprobar) {
	    	 System.out.println(resultado);
	    	 operacion = sc.nextLine();
	    	 
	    	 switch (operacion) {
	    	 case "+":
	    		 resultado=suma(resultado);
	    		 break;
	    	 case "-":
	    		 resultado=resta(resultado);
	    		 break;
	    	 case "*":
	    		 resultado=multiplica(resultado);
	    		 break;
	    	 case "/":
	    		 resultado=divide(resultado);
	    		 break;
		 case "c":
	    	 case "C":
	    		 resultado=0;
	    		 break;
	    	 case "q":
	    	 case "Q":
	    		 System.out.println("Fin.");
	    		 comprobar = false;
	    		 break;
	    		 
	    	 }
	     }
	     sc.close();
	}
	
	public static double suma(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		return n1+n2;
    }
	
	public static double resta(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		return n1-n2;
    }
	
	public static double multiplica(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		return n1*n2;
    }
	
	public static double divide(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		return n1/n2;
    }
	
}
