/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

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
public class Vista extends JFrame{
    
    JPanel p1 = new JPanel();
    JButton b1 = new JButton("Raices");
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();
    JLabel l4 = new JLabel();
    JLabel l5 = new JLabel();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JTextField t4 = new JTextField();
    
    public void panelPrincipal(){
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
        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(t4);
    }
    
    public void mostrar(){
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
