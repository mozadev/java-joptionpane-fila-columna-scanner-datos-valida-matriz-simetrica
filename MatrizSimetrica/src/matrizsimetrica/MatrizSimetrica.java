package matrizsimetrica;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MatrizSimetrica {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nfilas, ncol;
        boolean simetrica = true;
        
        nfilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        ncol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[nfilas][ncol];
        System.out.println("digite una matriz");
        
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.println("matriz [" + i + "][" + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        /*----------------mostrando la matriz-----------------------*/
        for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncol; j++) {
                System.out.print(matriz[i][j]);
                
            }
            System.out.println();
        }
        
        
        if (nfilas == ncol) {
            int i, j;
            i = 0;
            while (i < nfilas && simetrica == true) {
                j = 0;
                while (j < i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                        
                    }
                    j++;
                }
                i++;
                
            }
            
            if (simetrica == true) {
                JOptionPane.showMessageDialog(null, "la matriz es simetrica");
            } else {
                JOptionPane.showMessageDialog(null, "la matriz no es simetrica");
            }
            
        } else {
            JOptionPane.showMessageDialog(null, "la matriz no es cuadrada");
        }
        
    }
    
}
