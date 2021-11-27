package br.com.ogando.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import br.com.ogando.cm.modelo.Tabuleiro;;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel{
	
	public PainelTabuleiro(Tabuleiro tabuleiro){
		
		setLayout(new GridLayout(
				tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			if(e.isGanhou()){
				JOptionPane.showMessageDialog(this, "Ganhou!");
			} else{
				JOptionPane.showMessageDialog(this,  "Perdeu.");
			}
		});
		
		}
	}


