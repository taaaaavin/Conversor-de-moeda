package conversor.classe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONObject;

public class APIService {

    private  String API_KEY = System.getenv("API_LAYER_KEY");
    
    public JSONObject buscarTaxasDeCambio(String source) {
        try {
        	String API_URL = "http://apilayer.net/api/live?access_key=" + API_KEY + "&currencies=USD,EUR,GBP,ARS,CLP&source=" + source + "&format=1";
        	
            URL url = new URL(API_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                response.append(linha);
            }
            reader.close();

            JSONObject json = new JSONObject(response.toString());
            
            return json.getJSONObject("quotes");

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Erro ao buscar taxas de câmbio: " + e.getMessage());
        } 
    }
}

