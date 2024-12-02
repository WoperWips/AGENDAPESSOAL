package com.exemplo.agenda.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsável pela interface gráfica da agenda de contatos.
 */
public class ContatoView extends JFrame {

    private JTextField txtNome;
    private JTextField txtTelefone;
    private JButton btnAdicionar;
    private JButton btnAtualizar;
    private JButton btnDeletar;
    private JButton btnListar;
    private JTable tabelaContatos;
    private DefaultTableModel model;

    /**
     * Construtor da classe ContatoView.
     * Define e inicializa todos os componentes da interface.
     */
    public ContatoView() {
        // Configuração básica da janela principal
        setTitle("Agenda de Contatos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Configuração dos componentes da interface
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        add(lblNome);

        txtNome = new JTextField();
        txtNome.setBounds(80, 20, 200, 25);
        add(txtNome);

        JLabel lblTelefone = new JLabel("Telefone:");
        lblTelefone.setBounds(20, 60, 100, 25);
        add(lblTelefone);

        txtTelefone = new JTextField();
        txtTelefone.setBounds(80, 60, 200, 25);
        add(txtTelefone);

        btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(300, 20, 100, 25);
        add(btnAdicionar);

        btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(300, 60, 100, 25);
        add(btnAtualizar);

        btnDeletar = new JButton("Deletar");
        btnDeletar.setBounds(300, 100, 100, 25);
        add(btnDeletar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(300, 140, 100, 25);
        add(btnListar);

        // Configuração da tabela de contatos
        model = new DefaultTableModel(new Object[]{"ID", "Nome", "Telefone"}, 0);
        tabelaContatos = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabelaContatos);
        scrollPane.setBounds(20, 180, 540, 150);
        add(scrollPane);
    }

    // Getters para os componentes da interface
    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public JButton getBtnAdicionar() {
        return btnAdicionar;
    }

    public JButton getBtnAtualizar() {
        return btnAtualizar;
    }

    public JButton getBtnDeletar() {
        return btnDeletar;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public JTable getTabelaContatos() {
        return tabelaContatos;
    }

    public DefaultTableModel getModel() {
        return model;
    }
}
