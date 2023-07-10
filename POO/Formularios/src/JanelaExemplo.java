import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JanelaExemplo {
	public JanelaExemplo(){
		JFrame jFrame = new JFrame("Exemplo de janela");
		jFrame.setBounds(400,200,800,400);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setLayout(null);
		JButton btn01 = new JButton("Clique");
		JTextField nome = new JTextField();
		btn01.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String s;
				s = nome.getText();
				JOptionPane.showMessageDialog(null,"Oi "+s);
			}
		});
		
		nome.setBounds(10, 10, 100, 30);
		btn01.setBounds(nome.getWidth()+20,10,100, 30);
		jFrame.add(btn01);
		jFrame.add(nome);
		jFrame.setVisible(true);
	}
}