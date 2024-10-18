package Aula10e11e12e13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

public class ContatoFrame extends JFrame{
    //Atributos
    private JTextField nomeField;
    private JTextField celularField;
    private JTextField emailField;

    private ContatoMenu barra;

    private NovoAction novoAction;
    private SalvarAction salvarAction;
    private FecharAction fecharAction;

    private Contato contato;
    private ContatoDAO contatoDAO;
    
    //Métodos
    public ContatoFrame() {
        super("Agenda de Contatos");

        //Definindo ações
        novoAction = new NovoAction();//novoAction é um objeto de uma classe interna
        salvarAction = new SalvarAction();//salvarAction é um objeto de uma classe interna
        fecharAction = new FecharAction();//fecharAction é um objeto de uma classe interna

        criarMenu();
        criarFormulario();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(560,250);
        setVisible(true);
    }

    private void criarMenu(){
        barra = new ContatoMenu();
        barra.adicionarItens(novoAction, salvarAction, fecharAction);
        setJMenuBar(barra);
    }

    private void criarFormulario() {
        setLayout(new BorderLayout());

        //*****PAINEL TITULO DO FORMULÁRIO*****
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new FlowLayout());
        //Label do título
        JLabel titulo = new JLabel("Cadastro de Contato");
        titulo.setFont(new Font("Verdana", Font.PLAIN, 16));
        panelTitulo.add(titulo);

        //*****PAINEL CAMPOS DO FORMULÁRIO*****
        JPanel panelCadastro = new JPanel();
        panelCadastro.setLayout(new FlowLayout());
        //Campo Nome = JLabel + JTextField
        JLabel nomeLabel = new JLabel("  Nome: ");
        nomeField = new JTextField(40);
        //Campo celular = JLabel + JTextField
        JLabel celularLabel = new JLabel("Celular: ");
        celularField = new JTextField(15);
        //Campo email = JLabel + JTextField
        JLabel emailLabel = new JLabel(" E-mail: ");
        emailField = new JTextField(40);
        //Add no Panel
        panelCadastro.add(nomeLabel);
        panelCadastro.add(nomeField);
        panelCadastro.add(emailLabel);
        panelCadastro.add(emailField);
        panelCadastro.add(celularLabel);
        panelCadastro.add(celularField);

        //*****PAINEL BOTÕES DO FORMULÁRIO*****
        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new FlowLayout());
        //Campo Nome = JLabel + JTextField
        JButton botaoSalvar = new JButton("Salvar");
        JButton botaoFechar = new JButton("Fechar");
        //Adicionando as ações aos botões
        botaoFechar.addActionListener(fecharAction);
        botaoSalvar.addActionListener(salvarAction);
        //Add no Panel
        panelBotoes.add(botaoSalvar);
        panelBotoes.add(botaoFechar);

        //*****ADICIONAR PAINEIS NO FRAME*****
        add(panelTitulo,BorderLayout.NORTH);
        add(panelCadastro,BorderLayout.CENTER);
        add(panelBotoes,BorderLayout.SOUTH);
    }

    /* ********TRATAMENTO DE EVENTOS*********** 
    Classes internas do objeto Frame:
    são classes responsáveis por criar objetos que vão ouvir o objeto Listener 
    */
    //Menu NOVO
    private class NovoAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            nomeField.setText("");
            celularField.setText("");
            emailField.setText("");
        }
        
    }
    //Menu e Botão Fechar
    private class FecharAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            System.exit(0);
        }
 
    }
    //Menu e Botão Salvar
    private class SalvarAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            // TODO Auto-generated method stub
            String info;

            contato = new Contato();
            contato.setNome(nomeField.getText());
            contato.setEmail(emailField.getText());
            contato.setCelular(celularField.getText());

            contatoDAO = new ContatoDAO();

            try {
                contatoDAO.adiciona(contato);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            info = "O contato foi salvo.";
            info += "\nNome: " + nomeField.getText();
            info += "\nE-mail: " + emailField.getText();
            info += "\nCelular: " + celularField.getText();
   
            JOptionPane.showMessageDialog(null, info, "", JOptionPane.PLAIN_MESSAGE);
        }
    }
}