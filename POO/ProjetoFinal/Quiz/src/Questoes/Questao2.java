package Questoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Questao2 {
    private JFrame jFrame;
    
    public Questao2(char q1){
        jFrame = new JFrame("Questao 2");
        jFrame.setBounds(400, 200, 800, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setResizable(false);
        
        JLabel lblTitle = new JLabel("Questao 2: Qual o menor planeta do sistema solar?"); 
        lblTitle.setBounds(250 , 20, 500, 30);
        jFrame.add(lblTitle);
        
        JButton btnCerto = new JButton("Mercurio");
        btnCerto.setBounds(150 , 100, 200, 30);
        jFrame.add(btnCerto);
        
        JButton btnErr1 = new JButton("Plutão");
        btnErr1.setBounds(150 , 200, 200, 30);
        jFrame.add(btnErr1);
        
        JButton btnErr2 = new JButton("Venus");
        btnErr2.setBounds(450 , 100, 200, 30);
        jFrame.add(btnErr2);
        
        JButton btnErr3 = new JButton("Marte");
        btnErr3.setBounds(450 , 200, 200, 30);
        jFrame.add(btnErr3);
        
        btnCerto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao3 q3 = new Questao3(q1,'S');
            }
        });
        
        ActionListener perdeuListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao3 q3 = new Questao3(q1,'N');
            }
        };
        
        btnErr1.addActionListener(perdeuListener);
        btnErr2.addActionListener(perdeuListener);
        btnErr3.addActionListener(perdeuListener);
        
        jFrame.setVisible(true);
    }
}
