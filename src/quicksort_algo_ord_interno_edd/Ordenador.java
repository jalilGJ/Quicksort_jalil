/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort_algo_ord_interno_edd;

/**
 *
 * @jalil garcia jeronimo
 */
public class Ordenador {//

    public void ordenar_Quicksort(int[] array) {//Metodo para ingresasr el arreglo
        array = Quicksort1(array);//esto sera igual ya al arreglo ya ordenado
    }

    public int[] Quicksort1(int numeros[]) {//metodo para ingresar el arreglo nuevamente
        return Quicksort2(numeros, 0, numeros.length - 1);//quicksor2 contiene todo el el codico 
        //de los movimientos para ordenar
        //con parametros de: numeros corresponde al arreglo, el 0 al puntero izquierdo
        //y el numero.legth correspode al puntero derecho
    }

    public int[] Quicksort2(int numeros[], int izq, int der) {//metodo principal para ordenar
                                                              //con parametros iniciales.
                                                              //el pibote no se define pero se utiliza la variable izq
        if (izq >= der) {//compara punteros para saber si el izquierdo es igual o mayor a la derecha
            return numeros;//regresa el arreglo
        }
        int i = izq, d = der;//se hace referencia a los punteros con variables independientes
        if (izq != der) {//se compra, tienen que ser diferentes
            int pivote;//si en la compracion sale que es diferente, se declara el pivote
            int aux;//variable para poder hacer los movimientos
            pivote = izq;//se iguala al valor de la izquierda
            while (izq != der) {//se pone el ciclo while para que se ejecute todo el moviemto
                //mientra que izquierda sea diferente que derecha.
                while (numeros[der] >= numeros[pivote] && izq < der) {//se revisa el lado derecho todos los numeros
                    //mientras sea mayor o igual a pivote, 
                    //y meyor al indice izquierdo entonces se va decrementando el puntero
                    der--;
                }
                while (numeros[izq] < numeros[pivote] && izq < der) {//
                    izq++;//esto indica que estan en la posicion adecuada menores al pivote
                    //del lado izquierdo, entonces va incrementando el puntero
                }//pero cuando no sea asi
                if (der != izq) {//en este if se hace el cambio si derecha es diferente que izquierda
                    //
                    aux = numeros[der];//cuando se haga el cambio se va a guaradar en la varibale auxiliar
                    numeros[der] = numeros[izq];
                    numeros[izq] = aux;
                    // se intercambia el lado derecho por el lado izquierdo
                }
            }
            if (izq == der) {//una vez que se lleguen a igualar los puntero
                Quicksort2(numeros, i, izq - 1);//se vuleve a repetir el procedimiento (metodo)
                // se ejecuta nuevamente el metodo pero con puteros diferentes
                //lado izquierdo
                Quicksort2(numeros, izq + 1, d);//lado derecgo
                //y asi sucesivamente hasta ordenar el arreglo
            }
        } else {//
            return numeros;//
        }
        return numeros;//
    }
}
