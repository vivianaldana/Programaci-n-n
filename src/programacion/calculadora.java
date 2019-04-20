package programacion;


import java.util.Scanner;

public class calculadora {

	
	
	

			public static void main(String[] args)
			{
				Scanner Calculadora = new Scanner(System.in);
						 
				  int numero1, numero2, numero3, opcion;
				    System.out.println("ingrese numero1: ");
				    numero1= Calculadora.nextInt();
				    System.out.println("ingrese numero2: ");
				    numero2= Calculadora.nextInt();
				    
		            do {	
		            	System.out.println("\ningrese una opcion: ");
				        System.out.println("1.- sumar");
				        System.out.println("2.- restar");
				        System.out.println("3.- multiplicar");
				        System.out.println("4.- dividir");
				        System.out.println("5.- maximo");
				        System.out.println("6.- salir");
				        opcion = Calculadora.nextInt();
		            }
		            while (opcion <1 || opcion >6 );
				    switch (opcion)
				 	{
				        case 1:
				        	   System.out.println(numero1+numero2);
				               break;
				        case 2:
				        	   System.out.println(numero1-numero2);
				        	   break;	        
				        case 3:
				        	   System.out.println(numero1*numero2);
				        	   break;
				        case 4:
				        	   System.out.println(numero1/numero2);
				        	   break;
				        	        
				      }
			 }
	 }
				      
				    	  
				      
				    
			        
			
		  
		

	

	


