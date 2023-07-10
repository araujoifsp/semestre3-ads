package Quiz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import Questoes.Questao1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

public class Resultado extends JFrame {
    private JTable table;

    public Resultado(ResultSet resultSet) {
        setTitle("Desempenho dos Jogadores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        JLabel titleLabel = new JLabel("Ranking dos Jogadores");
        add(titleLabel);

        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Jogador");
        model.addColumn("Questão 1");
        model.addColumn("Questão 2");
        model.addColumn("Questão 3");
        model.addColumn("Questão 4");
        model.addColumn("Pontuação Total");

        try {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()) {
                Vector<Object> rowData = new Vector<>();

                for (int i = 1; i <= columnCount; i++) {
                    rowData.add(resultSet.getObject(i));
                }

                model.addRow(rowData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);

        JButton jogarNovamenteButton = new JButton("Jogar novamente");
        jogarNovamenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Questao1 q1 = new Questao1();
                dispose();
            }
        });
        add(jogarNovamenteButton);

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(sairButton);


    }
}
