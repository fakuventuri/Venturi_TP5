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
public class Arreglo {
    public static void sumarLista(int list[]){
        double suma = 0;
        for (int i = 0; i < list.length; i++) {
            suma+=list[i];
        }
        System.out.println("Suma: " + suma);        
        System.out.println("Promedio: " + suma / list.length);
    }
    
    public static int buscarMayor(int list[][]){
        int mayor = list[0][0];
        
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (mayor < list[i][j]) {
                    mayor = list[i][j];
                }
            }
        }
        
        return mayor;
    }
    
    public static int cuentaVocales(String string){
        int charCount = 0;
        for (char c : string.toCharArray()) {
            char lower = Character.toLowerCase(c);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                charCount++;
            }
        }
        
        return charCount;
    }
    
    public static int cuentaCaracter(String string, char buscado){
        int charCount = 0;
        for (char c : string.toCharArray()) {
            if (Character.toLowerCase(c) == Character.toLowerCase(buscado)) {
                charCount++;
            }
        }
        
        return charCount;
    }
}
