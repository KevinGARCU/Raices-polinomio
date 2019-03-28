/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Estudiantes
 */
public class Controlador implements ActionListener {

    Vista v;
    Modelo m;

    public Controlador(Vista v, Modelo m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(v.b1)) {
            

        }

    }

}
