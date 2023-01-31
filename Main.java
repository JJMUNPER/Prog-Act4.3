package org.losremedios.prog.ut4.actividades.act3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Apartado 1 generar array con numeros aleatorios
        System.out.println("Apartado 1 Generar array aleatorio: ");
        int [] a = randomArr(10);
        System.out.println(Arrays.toString(a));

        //Apartado 2 imprimir el array empezando por la ultima posicion
        System.out.println("Imprimir empezando por la ultima posicion: ");
        arrayInverso(a);

        //Apartado 3 ordena el array utilizando la clase de utilidades Arrays
        System.out.println("Ordenar el array: ");
        ordenarArray(a);

        //Apartado 4 busca un número recibido como parámetro dentro del array;manual y class Arrays
        int x=6; //Numero pasado por parametro
        System.out.println("Busqueda manual: ");
        System.out.println(buscaManualArray(a,x));
        System.out.println("Busqueda con binarySearch:");
        buscaConClase(a,x);

        //Apartado 5 Compara dos arrays recibidos por parámetros devolviendo si son iguales o no
        System.out.println("Comparando arrays: ");
        comparaArrays(a);

        //Apartado 6 Realizar 4 copias del array con diferentes metodos
        System.out.println("Con clone: ");
        System.out.println(usandoClone(a));
        System.out.println("Con Arrays.copyOf: ");
        System.out.println(usandoCopyOf(a));
        System.out.println("Con Arrays.copyOfRange: ");
        System.out.println(usandoCopyRange(a));
        System.out.println("Con System.arraycopy: ");
        System.out.println(usandoSystemCopy(a));



    }

    //Apartado 1
    public static int [] randomArr(int array){
        int[] arr=new int[array];
        for (int i =0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*100+1);
        }
        return arr;
    }



    //Apartado 2
    public static void arrayInverso(int [] array){
        for (int i= array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    //Apartado 3
    public static void ordenarArray(int [] array){
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

    //Apartado 4
    public static int buscaManualArray (int[] array, int num){

        for (int i=0;i< array.length;i++){
            if(num==array[i]){
                return i;
            }
        }
        return -1;
    }
    public static void buscaConClase (int[] array, int num){

        System.out.println(Arrays.binarySearch(array,num));
    }

    //Apartado 5
    public static void comparaArrays (int[] array){
        int [] comparado = randomArr(10);
        System.out.println("Array generado para la comparación: " + Arrays.toString(comparado));
        System.out.println("Array principal para comparar: " + Arrays.toString(array));
        System.out.println(Arrays.equals(array,comparado));
    }

    //Apartado 6
    public static int[] usandoClone(int [] array){
        int[]clon = array.clone();
        return clon;
    }
    public static int[] usandoCopyOf(int[]array){
        int[]copyOf=Arrays.copyOf(array,array.length);
        return copyOf;
    }
    public static int[] usandoCopyRange(int[] array){
        int[]copyRange=Arrays.copyOfRange(array,0,array.length);
        return copyRange;
    }
    public static int[] usandoSystemCopy(int[] array){
        int[]sysCopy=new int[10];
        System.arraycopy(array,0,sysCopy,0,array.length);

        return sysCopy;
    }


}
