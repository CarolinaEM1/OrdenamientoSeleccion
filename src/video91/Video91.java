/*
 Ordenamiento por selección
 */
package video91;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Video91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int arreglo[];
        int nElementos,aux,min;
        
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));
        arreglo = new int[nElementos];
        
        for (int i=0;i<nElementos;i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = teclado.nextInt();
        }
        
        // Ordenamiento por Seleccion
        for(int i=0;i<nElementos;i++){
            min=i;
            for(int j=i+1;j<nElementos;j++){
                if(arreglo[j] < arreglo[min]){
                    min = j;
                }
            }
            aux = arreglo[i];
            arreglo[i] = arreglo[min];
            arreglo[min] = aux;
        }
        System.out.print("\nOrden Ascendente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.print("\nArreglo ordenado en forma decreciente");
        for ( int i=(nElementos-1);i>0;i--){
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
    
}
