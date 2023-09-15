package senaiprojetos;

import javax.swing.JOptionPane;

public class FraseInvertida {

	public static void main(String[] args) {

		/*
		 * Construa uma classe que receba uma frase qualquer e mostre essa frase de trás
		 * para a frente e sem espaços em branco .
		 */

		String fraseQualquer, fraseSemEspaco;

		fraseQualquer = JOptionPane.showInputDialog(null, " Digite um frase qualquer : ");
		JOptionPane.showMessageDialog(null, fraseQualquer);

		fraseSemEspaco = fraseQualquer.replace(" ", "");
		JOptionPane.showMessageDialog(null,
				" Com a modificação, a frase que antes era " + fraseQualquer + " passou a ser : " + fraseSemEspaco);

		String fraseInvertida = new StringBuilder(fraseSemEspaco).reverse().toString();
		JOptionPane.showMessageDialog(null, "Frase invertida: " + fraseInvertida);
	}

}
