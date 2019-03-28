/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author estudiantes
 */
public class Modelo {   
    
    int matriz [][] = new int[3][4];
    
    public void polinimioGrado3(int a, int b, int c, int d){
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[0][2] = c;
        matriz[0][3] = d;
        for(int i=1; i<3; i++){
            for(int j=0; j<3; j++){
                matriz[i][j]=0;
            }
        }
        
    }
    
}
