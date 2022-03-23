package br.com.calc.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		
		organizarLayout();
		setSize(280, 380); //tamanho
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //encerrar o programa ao fechar
		setLocationRelativeTo(null); //local onde a janela é aberta
		setTitle("Calculadora");
		setVisible(true); //janela visivel
		
	}
	
	private void organizarLayout() {
		setLayout(new BorderLayout());	
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233, 60));
		add(display, BorderLayout.NORTH);
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new Calculadora();
	}
}
