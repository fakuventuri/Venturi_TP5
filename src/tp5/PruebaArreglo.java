/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author OzKuro
 */
public class PruebaArreglo {
    public static void main(String[] args) {
        int listaInt[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        
        int listaBidimencional[][] = {{2, 4, 6, 8, 10, 12, 14, 16, 18, 20},
        {1, 3, 55, 8, 11}};
        
        Arreglo.sumarLista(listaInt);
        System.out.println("Buscando mayor: " + Arreglo.buscarMayor(listaBidimencional));
        System.out.println("Buscando vocales: " + Arreglo.cuentaVocales("Probando buscar Vocales"));
        System.out.println("Buscando caracteres: " + Arreglo.cuentaCaracter("Probando buscar caracteres", 's'));
    }
}
