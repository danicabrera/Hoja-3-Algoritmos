package Estructuras;

import java.util.Random;


public class Archivo {
    Random rand = new Random();
    int[] lista = new int[3000];
    int[] listaOrdenada= new int[3000];

    public Archivo(){

        for (int i = 0; i < 3000; i++){
            lista[i] = i;
            listaOrdenada[i] = i;
        }

        this.revolver();


    }

    public void revolver(){
        for(int i = 0; i < lista.length; i++){
            int randIndex = rand.nextInt(lista.length);
            int temp = lista[randIndex];
            lista[randIndex] = lista[i];
            lista[i] = temp;
        }
    }

    public int[] getLista(){
        return lista;
    }

    public int[] getListaOrdenada(){
        return listaOrdenada;
    }

    public int getFirst(){
        return lista[0];
    }

    public int getLast(){
        return lista[3000];

    }


}
