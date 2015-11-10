package br.ufjf.dcc;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula03Exemplo01 {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      JanelaTexto janela = new JanelaTexto();
      janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      janela.setSize(120,100);
      janela.setLocationRelativeTo(null);
      janela.setVisible(true);
      janela.imprimeTexto();
   }
   
}
