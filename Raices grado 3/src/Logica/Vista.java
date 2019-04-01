/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author estudiantes
 */
public class Vista extends JFrame {

    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Raices");
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JLabel l6 = new JLabel();
    JLabel l7 = new JLabel();
    JLabel l8 = new JLabel();
    JLabel l9 = new JLabel();
    JLabel l10 = new JLabel();
    JLabel l11 = new JLabel();
    JLabel l12 = new JLabel();
    JLabel l13 = new JLabel();
    JLabel l14 = new JLabel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();

    public void panelPrincipal() {
        b1.setSize(100, 50);
        b1.setLocation(340, 100);

        l1.setSize(400, 60);
        l1.setLocation(130, 20);
        l1.setText("Raices polinomio de tercer grado usando ley de Demeter");
        l2.setSize(50, 50);
        l2.setLocation(60, 100);
        l2.setText("a: ");
        l3.setSize(50, 50);
        l3.setLocation(60, 170);
        l3.setText("b: ");
        l4.setSize(50, 50);
        l4.setLocation(60, 240);
        l4.setText("c: ");
        l5.setSize(50, 50);
        l5.setLocation(60, 310);
        l5.setText("d: ");
        l6.setSize(50, 50);
        l6.setLocation(200, 100);
        l6.setText("X^3");
        l7.setSize(50, 50);
        l7.setLocation(200, 170);
        l7.setText("X^2");
        l8.setSize(50, 50);
        l8.setLocation(200, 240);
        l8.setText("x");

        l9.setSize(50, 50);
        l9.setLocation(360, 170);
        l9.setText("1: ");
        l10.setSize(50, 50);
        l10.setLocation(360, 240);
        l10.setText("2: ");
        l11.setSize(50, 50);
        l11.setLocation(360, 310);
        l11.setText("3: ");
        
        l12.setSize(50, 50);
        l12.setLocation(390, 170);
        l13.setSize(50, 50);
        l13.setLocation(390, 240);
        l14.setSize(50, 50);
        l14.setLocation(390, 310);

        t1.setSize(50, 50);
        t1.setLocation(120, 100);
        t2.setSize(50, 50);
        t2.setLocation(120, 170);
        t3.setSize(50, 50);
        t3.setLocation(120, 240);
        t4.setSize(50, 50);
        t4.setLocation(120, 310);

        p1.setLayout(null);
        p1.add(b1);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.add(l9);
        p1.add(l10);
        p1.add(l11);
        p1.add(l12);
        p1.add(l13);
        p1.add(l14);
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
    }

    public void mostrar() {
        setSize(600, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panelPrincipal();
        add(p1);
    }

    public void asignaOyentes(Controlador c) {
        b1.addActionListener((ActionListener) c);
    }

}
