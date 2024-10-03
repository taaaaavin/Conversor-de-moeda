package conversor.classe;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class ConversorFrame {
	
    private static final String[] OPCOES = {"REAL", "DÓLAR", "EURO", "LIBRA", "PESO ARGENTINO", "PESO CHILENO"};
    private String source;
    private String currency; 
    private JSONObject taxasDeCambio;
    private double valor;
	private APIService api;
	private String moedaDe;
	private String moedaPara;

    public void showInput() {
        try {
            // Seleciona as moedas de origem e destino
            moedaDe = JOptionPane.showInputDialog(null, "Escolha a moeda de origem", "Conversor de Moeda", 
            		JOptionPane.INFORMATION_MESSAGE, null, OPCOES, "Escolha").toString();            
            moedaPara = JOptionPane.showInputDialog(null, "Escolha a moeda de destino", "Conversor de Moeda", 
            		JOptionPane.INFORMATION_MESSAGE, null, OPCOES, "Escolha").toString();
            
            // Verifica se as moedas origem e destino são iguais, se sim chama o método novamente até serem diferentes
            if(moedaDe == moedaPara) {
                 JOptionPane.showMessageDialog(null, "A moeda de origem e destino não podem ser iguais. Escolha novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                 showInput();
                 return;
             }         
            
            // Mapeia as escolhas para os códigos de moedas da API
            source = mapearMoeda(moedaDe);
            currency = mapearMoeda(moedaPara);
            
            api = new APIService();
        	this.taxasDeCambio = api.buscarTaxasDeCambio(source);

            // Pede um valor para realizar a conversão
            String strValor = JOptionPane.showInputDialog(null, "Digite um valor");
            valor = Double.parseDouble(strValor);
            
            if (valor <= 0) {
                throw new NumberFormatException();
            }
        } 
        catch (NumberFormatException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Digite um número válido maior que zero", "Valor Inválido", JOptionPane.ERROR_MESSAGE);
            showInput();
        }
    }
    
    public void mensagem(double resultado) {
    	JOptionPane.showMessageDialog(null, "A conversão, de " + valor + " ("+ this.moedaDe + ")" +" para "+ this.moedaPara+ ", deu: " + resultado, "Resultado", 
    			JOptionPane.INFORMATION_MESSAGE);
    }

    private String mapearMoeda(String moeda) {
        switch (moeda) {
            case "DÓLAR":
                return "USD";
            case "EURO":
                return "EUR";
            case "LIBRA":
                return "GBP";
            case "PESO ARGENTINO":
                return "ARS";
            case "PESO CHILENO":
                return "CLP";
            default:
                return "BRL";
        }
    }
    
    public double getValor() {
		return valor;
	}
    
    public JSONObject getTaxasDeCambio() {
		return taxasDeCambio;
	}
    
    public String getSource() {
		return source;
	}
    
    public String getCurrency() {
		return currency;
	}
	
}
