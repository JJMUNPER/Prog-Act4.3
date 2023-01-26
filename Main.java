package org.losremedios.prog.ut4.actividades.act3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Definicion array
        int [] a = new int[10];
        int [] b = new int[10];

        //Introduccion numeros aleatorios
        for (int i = 0; i<a.length;i++){

            a[i]=(int)(Math.random()*100);
            b[i]=(int)(Math.random()*100);
        }
        //Impresion de array creado
        for (int i =0;i< a.length;i++){
            System.out.print(a[i] + ", ");
        }

        //Ordenar array

        Arrays.sort(a);

        //Busquedas
        System.out.println("La búsqueda manual: " + buscar(a,5));
        System.out.println("La búsqueda binarySearch: " + Arrays.binarySearch(a,5));

        //Comparacion Arrays

        System.out.println(Arrays.equals(a,b));

        //Copias arrays
        int []c=a.clone();
        int []d=Arrays.copyOf(a,5);
        int []e=Arrays.copyOfRange(a,5,3);
        //int []f=System.arraycopy(a,4,5,1);


    }

    private static int buscar(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return i;
            }
        }
        return -1;
    }
}
