package conversor.classe;

import javax.swing.JOptionPane;

public class Conversor {
    
    private ConversorFrame painel;

    public Conversor(ConversorFrame painel) {
         
    	this.painel = painel;
    	int sair = JOptionPane.NO_OPTION;
    	
        while (sair != JOptionPane.YES_OPTION) {
        	painel.showInput();
            converter();
            sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Sair do conversor", JOptionPane.YES_NO_OPTION);
        }

        JOptionPane.showMessageDialog(null, "Saindo do Programa", "Saindo", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    private void converter() {
        try {
            // Busca a taxa de conversão com base no source e currency
            String key = painel.getSource() + painel.getCurrency();
            
            double cotacao = painel.getTaxasDeCambio().getDouble(key);

            // Realiza a conversão
            double resultado = Math.round((painel.getValor() * cotacao) * 100.0) / 100.0;
            painel.mensagem(resultado);
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar taxa de conversão", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}

	

