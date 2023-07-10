package classes.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class FrmUsuario extends JFrame {
    private static final long serialVersionUID = 1L;
    
	private JTable tabelaUsuarios;

    public FrmUsuario(ResultSet rs) {
        setTitle("Usuários");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        Vector<String> colunas = new Vector<String>();
        Vector<Vector<String>> dados = new Vector<Vector<String>>();

        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int colCount = metaData.getColumnCount();

            for (int i = 1; i <= colCount; i++) {
                colunas.add(metaData.getColumnName(i));
            }

            while (rs.next()) {
                Vector<String> row = new Vector<String>();
                for (int i = 1; i <= colCount; i++) {
                    row.add(rs.getString(i));
                }
                dados.add(row);
            }

            tabelaUsuarios = new JTable(dados, colunas);
            JScrollPane scrollPane = new JScrollPane(tabelaUsuarios);
            panel.add(scrollPane);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
