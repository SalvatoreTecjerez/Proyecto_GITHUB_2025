
/*
 * 	Sintaxis:
 * 
 * 		1) Declaracion
 * 		
 * 				tipoDato nombreVector[][];
 * 
 * 		2) Creacion
 * 
 * 				nombreVector = new tipoDato[tamanioFilas][tamanioColumnas]
 * 
 * 		3) "Inicializacion"
 * 
 * 				nombreVector[posicionFila][posicionColumna] = valor;
 * 
 */


public class EjemploVectoresBidimensionales {
	public static void main(String[] args) {

		String nombres[][];
		byte calificaciones[][];
		
		nombres = new String[2][3];
		calificaciones = new byte[5][5];
		
		nombres[1][1] = "Obi Wan Kenobi";
		
		//-------------------------------
		double temperaturas[][] = new double[3][3];
		
		
		//------------------------------------
		
		boolean sensores[][] = {{true, false, true},
								{false, false, true},
								{true, true, true}};
		
		//--------- manipulacion de vectores BIDIMENSIONALES ---------
		
		System.out.println(sensores.length);
		System.out.println(nombres.length);
		
		
		for(int i=0; i<sensores.length; i++) {
			for(int j=0; j< sensores[i].length; j++) {
				System.out.println(sensores[i][j]);
			}
		}
		
		
		byte datos[][] = {{3,5,8},
						  {9,6,2},
						  {7,8,4}};
		
		/*Ejercicio: 
			1) Convertir en 1's la diagonal principal
			2) Convertir a 0's por encima de la diagonal principal

			*/
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				if(i==j)
					datos[i][j] = 1;
					
			}
		}
		
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				if(i<j)
					datos[i][j] = 0;
					
			}
		}

		
		int sumatoria = 0;
		int contador = 0;
		
		for(int i=0; i<datos.length; i++) {
			for(int j=0; j< datos[i].length; j++) {
				System.out.print(datos[i][j]+ " ");
				
				sumatoria += datos[i][j];
				if(datos[i][j]>=3)
					contador++;
				
			}
			System.out.println();
		}
		
		System.out.println(sumatoria);
		System.out.println(contador);
	}//main
}//class
