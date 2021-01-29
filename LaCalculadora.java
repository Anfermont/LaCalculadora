import java.util.Scanner;

public class LaCalculadora {

	public static void main(String[] args) {
		System.out.println("LaCalculadora de DAW v0.2B");
		System.out.println("Operaciones disponibles:");
		System.out.println("+,-,*,/,c,q");
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
		default:
			if (operacion.chars().allMatch(Character::isDigit)) {
                                 resultado=Double.parseDouble(operacion);
                                 break;
                         }
                         else {
                                 System.out.println("Operaciones disponibles:");
                                 System.out.println("+,-,*,/,%,sqrt,pow,sin,cos,tan,c,q");
                                 break;
                         }			break;
	    		 
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
		if (n2==0) {
                        System.out.println("Error. No se puede dividir entre 0");
                        return n1;
                }
                else {
                        return n1/n2;
                }
    }
	
}
