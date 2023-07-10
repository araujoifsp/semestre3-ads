package Questoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import classes.model.*;


public class Questao1 {
    private int acertos = 0;
    private JFrame jFrame;
    
    public Questao1() {
        jFrame = new JFrame("Questao 1");
        jFrame.setBounds(400, 200, 800, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(null);
        jFrame.setResizable(false);

        JLabel lblTitle = new JLabel("Questao 1: Qual desses times teve a melhor campanha no Campeonato Paulista de 2023?"); 
        lblTitle.setBounds(150, 20, 760, 30);
        jFrame.add(lblTitle);
        
        JButton btnCerto = new JButton("Agua Santa");
        btnCerto.setBounds(150, 100, 200, 30);
        jFrame.add(btnCerto);
        
        JButton btnErr1 = new JButton("Santos");
        btnErr1.setBounds(150, 200, 200, 30);
        jFrame.add(btnErr1);
        
        JButton btnErr2 = new JButton("São Paulo");
        btnErr2.setBounds(450, 100, 200, 30);
        jFrame.add(btnErr2);
        
        JButton btnErr3 = new JButton("Corinthians");
        btnErr3.setBounds(450, 200, 200, 30);
        jFrame.add(btnErr3);
        
        btnCerto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao2 q2 = new Questao2('S');
            }
        });
        
        ActionListener perdeuListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jFrame.dispose();
                Questao2 q2 = new Questao2('N');
            }
        };
        
        btnErr1.addActionListener(perdeuListener);
        btnErr2.addActionListener(perdeuListener);
        btnErr3.addActionListener(perdeuListener);
        
        jFrame.setVisible(true);
    }
}
