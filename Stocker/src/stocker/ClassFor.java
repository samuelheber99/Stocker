/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stocker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

/**
 *
 * @author Hiury
 */
public class ClassFor {

    ArquivoEmJava arquivo = new ArquivoEmJava();
    private int posicao = -30;
    private ArrayList<JButton> label = new ArrayList();
    public JPanel panel;
    public JPanel desc = new JPanel();
    private JPanel panel2;
    private JPanel panel3;
    public JFrame janela;
    private int muda = 0;
    private int aumenta1 = 300;
            
    private ImageIcon icon = new ImageIcon("src/img/trash.png");
    private ImageIcon icon2 = new ImageIcon("src/img/trash-aberto.png");
    private ImageIcon icon3 = new ImageIcon("src/img/vendas.png");
    private JScrollPane scroll;
    private JLabel nome = new JLabel();
    private JLabel foto = new JLabel();
    private JLabel idade = new JLabel();
    private JLabel email = new JLabel();
    private JLabel telefone = new JLabel();
    private JTextArea descricao = new JTextArea();
    private int escolhido2;
    
    
    
   public int escolhido;

    String[] variavel = new String[20];

    public ClassFor() {
        int i = 0;
        icon.setImage(icon.getImage().getScaledInstance(25, 25, 1));
        icon2.setImage(icon2.getImage().getScaledInstance(25, 25, 1));
        panel1();
        arquivo.LeArquivo();

        while (i < arquivo.nomes.size()) {
            valida.criaCheck(i);

            i++;
        }
        panelDes();
        desc.setVisible(false);
        criaJFrame();

    }

    public void criaJFrame() {
        janela = new JFrame();
        janela.setTitle("Tela de Fornecedores");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);

        janela.setVisible(true);
        janela.setResizable(false);
        janela.setPreferredSize(new Dimension(730, 500));
        janela.add(panel);
        janela.add(desc);
        setIcon(janela);

        janela.pack();

    }

    public class CriaCheckBox {

        public void criaCheck(Integer i) {
            teste3 = new MyEventHandler2();
            label.add(new JButton());
            posicao += 30;
            label.get(muda).setVisible(true);
            label.get(muda).setText(arquivo.nomes.get(i) + " " + muda);
            label.get(muda).setSize(132, 30);
            label.get(muda).setLocation(0, posicao);

            panel2.add(label.get(muda));
            teste3.escolhido = muda;
            teste2.label2 = label.get(muda);
            
            label.get(muda).addActionListener(teste3);

            muda++;

        }

    }

    private class MyEventHandler implements ActionListener {

        public JButton label2;
        public JPanel jp;
        public int i = 0;
        int count = 0;

        public void actionPerformed(ActionEvent evt) {
            i = 0;
            System.out.println(i);
            while (i < label.size()) {
                label.get(i).setVisible(false);
                i++;

            }
            while (count != label.size()) {
                label.remove(0);

            }
            System.out.println(escolhido2);
            arquivo.nomes.remove(escolhido2);

            i = 0;
            muda = 0;
            posicao = -30;
            while (i < arquivo.nomes.size()) {
                valida.criaCheck(i);

                i++;
            }
            desc.setVisible(false);

        }

    }

    private class MyEventHandler2 implements ActionListener {

     
        public int escolhido;
 
     

        public void actionPerformed(ActionEvent evt) {
           escolhido2 = escolhido;
           desc.setVisible(true);
           nome.setText("Nome: " + arquivo.nomes.get(escolhido));
           idade.setText("Idade: " + arquivo.inscEs.get(escolhido));
           email.setText("Email: " + arquivo.emails.get(escolhido));
           telefone.setText("Telefone: " +arquivo.telefones.get(escolhido));
        }

    }

    CriaCheckBox valida = new CriaCheckBox();
    MyEventHandler teste2 = new MyEventHandler();
    MyEventHandler2 teste3 = new MyEventHandler2();

    private void panel1() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.setLocation(100, 0);

        panel.setBackground(Color.WHITE);
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setSize(100, 100);

        panel2.setBackground(Color.WHITE);
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.WHITE);
        scroll = new JScrollPane();
        scroll.setSize(new Dimension(150, 150));
        panel.add(panel3);
        panel.add(scroll);
        scroll.setLocation(0, 150);

        scroll.setViewportView(panel2);
        panel2.setPreferredSize(new Dimension(100, aumenta1));
        panel.setSize(new Dimension(150, 460));
        panel.setLocation(100, 0);

    }

    public void panelDes() {
        Border raisedbevel, blackline;
        blackline = BorderFactory.createLineBorder(Color.black);
        raisedbevel = BorderFactory.createRaisedBevelBorder();
        desc.setLayout(null);
        desc.setBackground(Color.white);
        desc.setLocation(260, 10);
        desc.setSize(450, 445);
        desc.setBorder(blackline);
        criaLabels();

    }

    public void criaLabels() {
        teste2 = new MyEventHandler();
        escolhido2 = escolhido;
        Font fonte = new Font("Arial", Font.PLAIN, 14);
        
       
       
        foto.setLocation(10, 0);

        foto.setSize(new Dimension(90, 90));
        icon3.setImage(icon3.getImage().getScaledInstance(foto.getWidth(), foto.getHeight(), 1));
        foto.setText("Foto");
        foto.setIcon(icon3);

       
        nome.setLocation(120, 30);
        nome.setSize(new Dimension(150, 30));
        nome.setText("Nome");
        nome.setFont(fonte);

        
        idade.setLocation(270, 30);

        idade.setSize(new Dimension(150, 30));
        idade.setText("Idade");
        idade.setFont(fonte);

        
        email.setLocation(10, 120);

        email.setSize(new Dimension(230, 30));
        email.setFont(fonte);
        email.setText("Email: hiurylucas@unipam.edu.br");

       
        telefone.setLocation(250, 120);

        telefone.setSize(new Dimension(230, 30));
        telefone.setFont(fonte);
        telefone.setText("Telefone: (34) 98893-8608");

        descricao.setLocation(10, 250);
        descricao.setSize(430, 100);
        descricao.setBackground(new Color(238, 238, 238));
        descricao.setLineWrap(true);
        descricao.setEditable(false);

        JCheckBox deleta = new JCheckBox();
        deleta.setIcon(icon);
        deleta.setRolloverIcon(icon2);
        deleta.setLocation(330, 410);
        deleta.setText("Deletar");
        deleta.setSize(100, 30);
        deleta.addActionListener(new MyEventHandler());

        desc.add(nome);
        desc.add(foto);
        desc.add(idade);
        desc.add(email);
        desc.add(telefone);
        desc.add(descricao);
        desc.add(deleta);

    }

    public void setIcon(JFrame janela) {
        janela.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("boxtramp.png"))); //To change body of generated methods, choose Tools | Templates.
    }

}
