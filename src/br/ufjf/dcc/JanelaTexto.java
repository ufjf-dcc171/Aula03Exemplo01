package br.ufjf.dcc;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ice
 */
class JanelaTexto extends JFrame{
   private final JLabel lblEntrada = new JLabel();
   private final JLabel lblSaida = new JLabel("Saída");
   private final JTextField txtEntrada = new JTextField(10);

   public JanelaTexto() throws HeadlessException {
      super("Texto");
      setLayout(new FlowLayout(FlowLayout.CENTER));
      lblEntrada.setText("Entrada");
      add(lblEntrada);
      add(txtEntrada);
      add(lblSaida);
      txtEntrada.addActionListener( new ConverteParaMaiusculas());
      
      
   }
   
   public void imprimeTexto(){
      System.out.println(lblEntrada.getText());
   }

   private class ConverteParaMaiusculas implements ActionListener {

      @Override
      public void actionPerformed(ActionEvent e) {
         lblSaida.setText(txtEntrada.getText().toUpperCase());
      }
   }
   
   
}
