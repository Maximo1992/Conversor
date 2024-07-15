import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCambio {
    public static Cambio procesarCambio(String monedaBase, String monedaCambio, Double monedaMonto){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/9529fa5c65a918d963e99b6a/pair/" + monedaBase + "/" + monedaCambio + "/"+monedaMonto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return  new Gson().fromJson(response.body(), Cambio.class);
        }catch (Exception e){
            throw new RuntimeException("No se logro identificar el cambio");
        }
    }
}
