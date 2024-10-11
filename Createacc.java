/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progra_2_lab1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Omar Romero
 */
public class Createacc extends JFrame{
    public Createacc(){
        comps();
    }
    public void comps(){
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        Dimension textdim=new Dimension(250,30);
        Dimension buttondim=new Dimension(150,40);
        
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.white);
        

        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        grid.insets = new Insets(10, 0, 10, 0);
        grid.anchor = GridBagConstraints.CENTER;

        JTextField correo = new JTextField();
        correo.setPreferredSize(textdim);
        JTextField pass = new JTextField();
        pass.setPreferredSize(textdim);
        JButton login=new JButton();
        login.setText("Login");
        login.setPreferredSize(buttondim);
        JButton back=new JButton();
        back.setText("Regresar");
        back.setPreferredSize(buttondim);
        JLabel correotext= new JLabel("Correo");
        JLabel passtext= new JLabel("Contraseña");
        JTextField username = new JTextField();
        username.setPreferredSize(textdim);
        JLabel usernametext= new JLabel("Username");
        
        
        panel.add(correotext,grid);
        panel.add(correo, grid);
        panel.add(usernametext, grid);
        panel.add(username,grid);
        panel.add(passtext,grid);
        panel.add(pass, grid);
        panel.add(login,grid);
        panel.add(back,grid);
        add(panel);
        
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
    }
    
    private void backActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        MainMenu frame=new MainMenu();
        frame.setVisible(true);
       }
    }
    
    

