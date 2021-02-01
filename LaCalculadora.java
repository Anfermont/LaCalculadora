import java.util.Scanner;

public class LaCalculadora {

	public static void main(String[] args) {
		System.out.println("LaCalculadora de DAW v0.4");
		System.out.println("Operaciones disponibles:");
		System.out.println("+,-,*,/,%,pow,sqrt,c,q");
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
		case "%":
	    		 resultado=modulo(resultado);
	    		 break;
	    	 case "sqrt":
	    	 case "SQRT":
	    		 resultado=raiz(resultado);
	    		 break;
	    	 case "pow":
	    	 case "POW":
	    		 resultado=potencia(resultado);
	    		 break;
		 case "sin":
                 case "SIN":
                         resultado=seno(resultado);
                         break;
                 case "cos":
                 case "COS":
                         resultado=coseno(resultado);
                         break;
                 case "tan":
                 case "TAN":
                         resultado=tangente(resultado);
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
                                 System.out.println("+,-,*,/,%,pow,sqrt,c,q");
                                 break;
                         }
	    		 
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
	
	public static double modulo(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		if (n2==0) {
			System.out.println("Error. No se puede dividir entre 0");
			return n1;
		}
		else {
			return n1%n2;
		}
    }
	
	public static double raiz(double n1) {
		if (n1<0) {
			System.out.println("Error. No se puede hacer raiz cuadrada de numero negativo");
			return n1;
		}
		else {
			return Math.sqrt(n1);
		}
    }
	
	public static double potencia(double n1) {
		Scanner sc = new Scanner(System.in);
		double n2=sc.nextInt();
		return Math.pow(n1, n2);
    }
	
	public static double seno(double n1) {
                return Math.sin(n1);
    }
        
        public static double coseno(double n1) {
                return Math.cos(n1);
    }
        
        public static double tangente(double n1) {
                return Math.tan(n1);
    }
}
