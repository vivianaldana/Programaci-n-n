package programacion;


import java.util.Scanner;

public class maximovalor {

	
			
		     public static void main(String[] args){
		     	 Scanner tem = new Scanner (System.in);
		     	 int n1, n2, n3;
		     	 System.out.println("Ingrese el primer numero: "); 
		    	 n1= tem.nextInt();
		    	 System.out.println("Ingrese el segundo numero: ");
		    	 n2= tem.nextInt();
		    	 System.out.println("Ingrese el tercer numero: ");
		    	 n3= tem.nextInt();
		    	 Mayor(n1,n2,n3);
		    	 
		     }
		     public static void Mayor(int n1, int n2, int n3){
		    	 if(n1>n2)
		    		 if(n1>n3)
		    			 System.out.println("El mayor es n1:  "+n1);
		    		 else
		    			 System.out.println("El mayor es n3:  "+n3);
		    	 else if(n2>n3)
		    		 System.out.println("El mayor es n2:  "+n2);
		    	 else 
		    		 System.out.println("El mayor es n3:  "+n3);
		    	 
		     }
		     
		

		}


