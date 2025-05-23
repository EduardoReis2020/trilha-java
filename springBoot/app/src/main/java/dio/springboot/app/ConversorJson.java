package dio.springboot.app;

import com.google.gson.Gson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConversorJson {
    @Autowired
    private Gson gson;
    public ViaCepResponse converter(String json) {
        return gson.fromJson(json, ViaCepResponse.class);
    }
}
