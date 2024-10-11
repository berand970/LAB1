package progra_2_lab1;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame {

    public MainMenu() {
        comps();
    }

    public void comps() {
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel menu = new JPanel(new GridBagLayout());
        menu.setBackground(Color.white);

        GridBagConstraints grid = new GridBagConstraints();
        grid.gridx = 0;
        grid.gridy = GridBagConstraints.RELATIVE;
        grid.insets = new Insets(10, 0, 10, 0);
        grid.anchor = GridBagConstraints.CENTER;

        Dimension buttondim = new Dimension(150, 50);

        JButton login = new JButton("Login");
        login.setPreferredSize(buttondim);
        JButton crear = new JButton("Crear Cuenta");
        crear.setPreferredSize(buttondim);

        menu.add(login, grid);
        menu.add(crear, grid);
        add(menu);

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        
        
    crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                crearActionPerformed(evt);
            }
        });
    }
    
    private void loginActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Login frame=new Login();
        frame.setVisible(true);
       }
    
    
    
     private void crearActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Createacc frame=new Createacc();
        frame.setVisible(true);
       }
}
