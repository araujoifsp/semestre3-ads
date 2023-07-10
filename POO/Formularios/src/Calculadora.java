import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	
	public JPanel       pnlDisplay = new JPanel();
	public JPanel       pnlButtons = new JPanel();
	public JTextField  display = new JTextField();
	private JButton[]       btn = new JButton[16];  
	private String[]  btnLabels = {"7","8","9","/","4","5","6","*","1","2","3","-","0",",","+","="};
	
	public Calculadora() {
		
			this.setBounds( 100, 100, 300, 400);
			this.setLayout(null);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.posicionamento();
			this.setVisible(true);
	}
	
	private void buildButtons() {
		for(int i=0;i<btnLabels.length; i++) {
			
			
		}
		
	}
	
	
		

	
	private void posicionamento(){
		this.pnlDisplay.setBounds(5, 5, this.getWidth()-10, (int)(this.getWidth()*2));
	}
}
