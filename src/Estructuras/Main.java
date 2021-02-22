package Estructuras;

public class Main {

    public static void main(String[] args) {
        Vista vista = new Vista();
        Archivo data = new Archivo();
        int[] datosCorrectos = data.getListaOrdenada();
        Sorts sorta = new Sorts();
        int resp = 0;
        while(resp != 6) {
            int[] datos = data.getLista();

            resp = vista.Menu();
            if (resp == 1) {
                sorta.Gnome(datos);
                vista.Correcto(datos, datosCorrectos);
            } else if (resp == 2) {
                sorta.Mergesort(datos, 0, 2999);
                vista.Correcto(datos, datosCorrectos);
            } else if (resp == 3) {
                sorta.Quick(datos, 0, 2999);
                vista.Correcto(datos, datosCorrectos);
            } else if (resp == 4) {
                sorta.RadixSort(datos, datos.length);
                vista.Correcto(datos, datosCorrectos);
            } else if (resp == 5) {
                sorta.Insert(datos);
                vista.Correcto(datos, datosCorrectos);
            } else if (resp == 6){
                vista.Fin();
            }

            data.revolver();
        }
    }
}
