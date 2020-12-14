/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort_algo_ord_interno_edd;

/**
 *
 * @author PC7
 */
public class Quicksort_Algo_Ord_Interno_EDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = {2, 4, 5, 3, 8, 9, 7, 13, 16, 15, 30, 34, 45, 21, 33};//se declara el arreglo
        Ordenador ord = new Ordenador();//se instancia 
        ord.ordenar_Quicksort(arreglo);//se llama al metodo para utilizarlo
        System.out.println("Metodo de ordenamiento interno:");
        System.out.println("           QUICKSORT            ");

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);// se imprime el resultado del arreglo ordenado
        }

    }

}
