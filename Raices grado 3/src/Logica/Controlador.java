/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener {

    Vista v;
    polinomioGrado3 m;

    public Controlador(Vista v, polinomioGrado3 m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(v.b1)) {
            try {
                m.polinimioGrado3(Integer.parseInt(v.t1.getText()), Integer.parseInt(v.t2.getText()), Integer.parseInt(v.t3.getText()), Integer.parseInt(v.t4.getText()));
                m.Cuadratica();
                v.l12.setText(Integer.toString(m.primeraRaiz));
                v.l13.setText(Double.toString(m.getCuadratica().segundaRaiz));
                v.l14.setText(Double.toString(m.getCuadratica().terceraRaiz));
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"Valores no validos");
                v.t1.setText("");
                v.t2.setText("");
                v.t3.setText("");
                v.t4.setText("");
            }
        }

    }

}
