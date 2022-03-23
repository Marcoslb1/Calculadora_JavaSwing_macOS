package br.com.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel; //container para se organizar o layout

import br.com.calc.modelo.Memoria;
import br.com.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador{
	
	private JLabel label = new JLabel("");

	public Display() {
		
		Memoria.getInstancia().adicionarObservador(this);
		setBackground(new Color(46,49,50));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 34));
		
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 17));
		add(label);
		
	}

	@Override
	public void valorAlterado(String texto) {
		label.setText(texto); //sempre que houver uma mudança na memoria a mudança irá notificar o display	
	}
}
