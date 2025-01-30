1
/*
 * 
 * 	VECTORES BIDIMENSIONALES	
 * 
 * 
 * 		Estructura de almacenaimetno de informaicon con un tipo
 * 		y tamanio especificos
 * 
 *  
 *  	Etapas de gestion de vectores:
 *  
 *  		1. Declaracion
 *  				Sintaxis:  tipoDato nombreVector[][]; 
 *  
 *  		2. Creacion
 *  				Sintaxis:  nombreVector = new tipoDato[tamanio_filas][tamanio_columnas];
 *  			
 *  		3. Inicializacion
 *  				Sintaxis:  nombreVector[fila][columna] = valor;
 *  							dato = nombreVector[fila][columna];
 *  
 */


public class PruebaVectoresBidimensionales {

	public static void main(String[] args) {

		System.out.println("MENU");

		System.out.println("Opcion 1");
		
		//Creacion de LOGIN para autenticacion
		
		//Agregar BOTON de recuperacion de contraseña
		
		//declaracion
		String nombres[][];
		byte edades[][];
		boolean sensores[][];
		
		//creacion
		nombres = new String[2][3];
		edades = new byte[2][2];
		sensores = new boolean[15][24];
		
		System.out.println(nombres[0][0]);
		System.out.println(edades[0][0]);
		System.out.println(sensores[3][8]);
		
		//"inicializacion"
		
		
		nombres[0][0] = "Luke";
		nombres[0][1] = "Leia";
		nombres[0][2] = "Han";
		nombres[1][0] = "Yoda";
		nombres[1][1] = "Obi Wan";
		nombres[1][2] = "Mando";
		
		edades[0][0] = 14;
		edades[0][1] = 100;
		edades[1][0] = 30;
		edades[1][1] = 25;
		
		System.out.println(edades[1][1]);
		byte dato = edades[1][1];
		
		//-------------------------------
		double temperaturas[][] = new double[3][3]; //declaracion y creacion
		
		
		//-------------------------------
		
		char letras[][] = { {'a', 'g', 'm'}, 
							{'t', 'x', 'p'},
							{'q', 'z', 'l'},
							{'a', 's'}, 
							{'n', 'e', 'd', 'y', 'e', 'h', 'e', 'g'}};
		
		
		//--------- GESTION DE VECTORES BIDIMENSIONALES -------------------------------
		System.out.println();
		System.out.println(edades.length);  //TOTAL DE FILAS !!!!!!
		System.out.println(sensores.length);
		System.out.println(letras.length);
		
		System.out.println(letras[4].length);
		
		System.out.println(nombres[1][1].length());
		
		//System.out.println(edades[1][1].length()); NO SE PUEDE OBTENER LA LONGITUD DE UN ENTERO (BYTE)
		
		
		
		for(int i=0; i < nombres.length; i++) {
			for(int j=0; j< nombres[i].length; j++) {
				System.out.print(nombres[i][j] + "-");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i < edades.length; i++) {
			for(int j=0; j< edades[i].length; j++) {
				System.out.print(edades[i][j] + " ");
			}
			System.out.println();
		}
		
		
		//============== MINI EJERCICIO ====================
		System.out.println("-----------------------------------");
		int datos[][] = {{6,7,3, 7},
						 {9,2,4, 4},
						 {4,8,5, 8},
						 {9, 3, 1,5}};
		
		//hacer la diagonal principal CEROS
		
		System.out.println();
		for(int i=0; i < datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}

		
		for(int i=0;i<datos.length;i++) {
			datos[i][i]=0;
		}
		
		
		System.out.println();
		for(int i=0; i < datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\nhacer UNOS POR ENCIMA DE la diagonal principal ");
		
		
		for(int i=0;i<datos.length;i++) {
			for(int j=0;j<datos[1].length;j++) {
				if(i<j)
					datos[i][j]=1;
			}
		}
		
		System.out.println();
		for(int i=0; i < datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				System.out.print(datos[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("\n\nhacer MENOS UNO POR DEBAJO DE la diagonal principal ");
		for(int i=0;i<datos.length;i++) {
			for(int j=0;j<datos[1].length;j++) {
				if(i>j)
					datos[i][j]= -1;
			}
		}
		
		
		System.out.println();
		for(int i=0; i < datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				System.out.print(datos[i][j] + "   ");
			}
			System.out.println();
		}
		
		//----
		
		String cadena = "magia";
		
		String cad = String.valueOf('\u4567') + String.valueOf(cadena.charAt(2));
		
		System.out.println("\n\n" + cad );
		
	}//main
}//class
