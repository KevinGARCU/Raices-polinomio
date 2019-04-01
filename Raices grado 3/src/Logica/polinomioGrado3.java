/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author estudiantes
 */
public class polinomioGrado3 {
    
    int primerTermino;
    int segundoTermino;
    int tercerTermino;
    int primeraRaiz;
    polinomioGrado2 c; 

    public void polinimioGrado3(int a, int b, int c, int d) {
        ArrayList<Integer> divisores;
        divisores = new ArrayList();
        int aux;
        int oper1;
        int oper2;
        int oper3;
        int oper4;
        for (int i = -1 * (Math.abs(d)); i <= Math.abs(d); i++) {
            if (i != 0 && (d % i) == 0) {
                divisores.add(i);
            }
        }
        for (int j = 0; j < divisores.size(); j++) {
            oper1 = a * divisores.get(j);
            primerTermino = a;
            oper2 = b + oper1;
            segundoTermino = oper2;
            oper2 *= divisores.get(j);
            oper3 = c + oper2;
            tercerTermino = oper3;
            oper3 *= divisores.get(j);
            oper4 = d + oper3;
            aux = oper4;
            if (aux == 0) {
                primeraRaiz = divisores.get(j);
                j = divisores.size() + 1;
            }

        }
        

    }
    void Cuadratica(){
        c = new polinomioGrado2(primerTermino, segundoTermino, tercerTermino);
    }

    public polinomioGrado2 getCuadratica() {
        return c;
    }

}
