import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing. JOptionPane;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //janela
JFrame janela =new JFrame();
janela.setTitle("Hello world");
janela.setSize(500,500);
janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//font
JLabel labelName = new JLabel("Nome:");
labelName.setBounds(20,20  , 50, 20  );

JTextField campoTextNome = new JTextField();
campoTextNome.setBounds(20 ,40 ,200,20 );

//button
        JButton botaoEnviar = new JButton();
        botaoEnviar.setText("Enviar");
        botaoEnviar.setBounds(20 ,60 , 100,20);
        botaoEnviar.addActionListener(event ->{
         String nomeDigitado = campoTextNome.getText();
         JOptionPane.showMessageDialog(janela,"Olá " + nomeDigitado);
        });

//layout do box text
janela.setLayout(null); //nome
janela.getContentPane().add(labelName);
janela.getContentPane().add(campoTextNome);
janela.getContentPane().add(botaoEnviar);

janela.setVisible(true);
        }
    }
