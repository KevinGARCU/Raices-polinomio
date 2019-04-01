/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Kevin Garcia
 */
class polinomioGrado2 {

    double segundaRaiz;
    double terceraRaiz; 
    
    polinomioGrado2(int a, int b, int c) {
        segundaRaiz=(-b+Math.sqrt((b*b)-4*a*c))/(2*a);
        terceraRaiz=(-b-Math.sqrt((b*b)-4*a*c))/(2*a);
    }
    
}
