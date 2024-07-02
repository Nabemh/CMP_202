package Swing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class UI {
    JFrame window = new JFrame("Physics");
    JTextField tfMass = new JTextField("Enter Mass");
    JTextField tfAcceleration = new JTextField("Acceleration");

    JButton btnCalculate = new JButton("Calculate");

    void drawUI(){
        window.add(tfMass);
        window.add(tfAcceleration);
        window.add(btnCalculate);

        btnCalculate.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e){
                Physics physics = new Physics();

                try {
                    float mass = Float.valueOf(tfMass.getText());
                    float acceleration = Float.valueOf(tfAcceleration.getText());
    
                    JOptionPane.showMessageDialog(null, 
                        "Force: " + physics.CalculateForce(mass, acceleration));

                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(null, "Enter numeric value only");
                    
                    nfe.printStackTrace(); //this is mainly for diagnostics
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Something Strange happened");
                }
                }
    
                    //System.out.println("BUTTON CLICKED!!!");
            });
            window.setLayout(new GridLayout(3, 1));
            window.setSize(200, 250);
            window.setVisible(true);
            
        }


    }

