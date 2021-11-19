/**
 * Clase de ejemplo para la diferencia de resultados usando parámetros de valor y referencia.
 * @author : Dhamar Cabrera
 * @version : 1.0
 */

public class Parametros{
    public static void main (String [] args) {

	//Parámetros por valor.
	//Definimos la variable
	double valor = 25.09;
	//Pondremos una condición para ver más adelante que la variable no se modificará mientras no la usemos dentro de la condición.
	if (valor == 25.09){
	    // Hacemos la resta de la variable menos la variable.
	    valor -= valor;
	    // Ocupamos otra condición para ver que siempre imprimirá un solo número, cuando la variable se imprime dentro de las condicionales su valor será 0.0, cuando salga de las condiciones el valor de la variable será 25.09 
	    if (valor > -50.19){
		//Imprimimos la variable valor, pero no la de valor que definimos en un principio, sino una nueva que es el resultado de nuestra función valor-=valor. En este caso, nos imprimirá solo el valor = 0.0, no va a imprimir el -25.09 o el -50.18, porque cuando sale de la última condición, la variable valor vuelve a ser 25.09
		System.out.println ("\n" + "\n" + "  °°°°°°°°°° Parámetros por Valor °°°°°°°°°°" + "\n" +"     | Nuevo valor de la variable valor: " + valor + "|" + "\n" + "------------------------------------------------");
	    }
	}



	
	//Parámetros por referencia.
	//Definimos e inicializamos el arreglo.
	int [] arreglo = {81, 50, 30, 91, 90, 52};
	
	//Pondremos esta impresión fuera del ciclo for, porque si la ponemos dentro, entonces va a imprimirse todas las veces que se vaya a imprimir la referencia (6).
	System.out.println ("\n" + "  °°°°°°°°°° Parámetros por referencia °°°°°°°°°°");
	
	//Definimos e inicializamos una variable para que nos imprima la resta de referencias.
	int resta = 0;

	//Hacemos un ciclo for en el que definimos el índice de arreglos como tipo primitivo int, ponemos la condición de que éste sea menor a 6 ya que tenemos 6 elementos en nuestro arreglo
	for (int i = 0; i < 6; i ++){

	    // Cuando imprimamos, debemos poner el nombre del arreglo y el índice de arreglos, ésto va a imprimirnos en orden los valores de las referencias colocadas en el arreglo.

	    System.out.print("      | " +  "Valor guardado en referencia: " + arreglo[i] + " | " + "\n" );
	
	}
	//Para probar que se modifica la referencia, salimos del ciclo y realizamos una función, restaremos las referencias.
	resta = arreglo[arreglo.length -1];
	System.out.print("      | " +  "Resta de referencias: " + arreglo[arreglo.length -1] + " | " + "\n" + "\n"+ "\n");
	
    }
}
