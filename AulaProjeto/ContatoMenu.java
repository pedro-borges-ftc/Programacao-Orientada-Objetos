package AulaProjeto;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;

public class ContatoMenu extends JMenuBar{
    //Atributos
    private JMenu menuContato;
    private JMenuItem menuItemNovo;
    private JMenuItem menuItemSalvar;
    private JMenuItem menuItemFechar;

    private JMenu menuAjuda;
    private JMenuItem menuItemSobre ;

    //Métodos
    public ContatoMenu(){
        //*****MENU CONTATO*****
        menuContato = new JMenu("Contato");
        menuItemNovo = new JMenuItem("Novo");
        menuItemSalvar = new JMenuItem("Salvar");
        menuItemFechar = new JMenuItem("Fechar");
        
        //*****MENU AJUDA*****
        menuAjuda = new JMenu("Ajuda");
        menuItemSobre = new JMenuItem("Sobre");
    }

    public void adicionarItens(ActionListener n, ActionListener s, ActionListener f){
        
        menuItemNovo.addActionListener(n);
        menuContato.add(menuItemNovo);
        
        menuItemSalvar.addActionListener(s);
        menuContato.add(menuItemSalvar);

        menuItemFechar.addActionListener(f);
        menuContato.add(menuItemFechar);

        menuAjuda.add(menuItemSobre);

        //Adicionando Menus na Barra
        add(menuContato);
        add(menuAjuda);
    }
}
