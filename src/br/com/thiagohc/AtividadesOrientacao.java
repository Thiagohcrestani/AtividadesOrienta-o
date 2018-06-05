/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.thiagohc;
import javax.swing.JOptionPane;
/**
 *
 * @author thiag
 */
public class AtividadesOrientacao {

    public static void main(String[] args) {
       LivroDeBiblioteca2[] biblioteca = new LivroDeBiblioteca2[3];
        LivroDeLivraria2[] livraria = new LivroDeLivraria2[3];

        for (int i = 0; i < biblioteca.length; i++) {
            biblioteca[i] = new LivroDeBiblioteca2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o número de exemplares do " + (i+1) + "º livro de biblioteca!");
                if (Contador.isInt(numeroDigitado)) {
                    pass = true;
                    biblioteca[i].setExemplares(Integer.parseInt(numeroDigitado));
                }
            }
        }

        for (int i = 0; i < livraria.length; i++) {
            livraria[i] = new LivroDeLivraria2();
            boolean pass = false;
            String numeroDigitado;
            while (!pass) {
                numeroDigitado = JOptionPane.showInputDialog("Digite o valor do " + (i+1) + "º livro de livraria!");
                if (Contador.isNumeric(numeroDigitado)) {
                    pass = true;
                    livraria[i].setValor(Double.parseDouble(numeroDigitado));
                } else {
                }
            }
        }

        for (LivroDeBiblioteca2 biblioteca_ : biblioteca) {
            System.out.println(biblioteca_.getExemplares());
        }
        for (LivroDeLivraria2 livraria_ : livraria) {
            System.out.println(livraria_.getValor());
        }
    }
    }
   
