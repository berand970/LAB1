package emaillab;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu extends JFrame{
    public Menu(){
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
        
        JButton inbox=new JButton();
        inbox.setPreferredSize(buttondim);
        JButton createmail=new JButton();
        createmail.setPreferredSize(buttondim);
        JButton readmail=new JButton();
        readmail.setPreferredSize(buttondim);
        JButton clean=new JButton();
        clean.setPreferredSize(buttondim);
        JButton delog=new JButton();
        delog.setPreferredSize(buttondim);
        
        inbox.setText("Ver Inbox");
        createmail.setText("Crear Correo");
        readmail.setText("Leer Correo");
        clean.setText("Limpiar Inbox");
        delog.setText("Cerrar Sesion");
        
        panel.add(inbox,grid);
        panel.add(createmail, grid);
        panel.add(readmail, grid);
        panel.add(clean,grid);
        panel.add(delog,grid);
        add(panel);
        setVisible(true); 
    }
    
   
}