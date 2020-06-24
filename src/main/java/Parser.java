import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.JSONException;

class Parser{

    public Valute getValute(String response) throws JSONException {
        JsonElement jelement = new JsonParser().parse(response);
        JsonObject jobject = jelement.getAsJsonObject();
        jobject = jobject.getAsJsonObject("Valute");
        String responseString = jobject.get("HKD").toString();

        Gson gson = new Gson();
        Valute valute = gson.fromJson(responseString, Valute.class);

        return valute;
    }
}