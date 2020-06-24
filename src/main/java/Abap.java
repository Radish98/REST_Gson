import java.io.BufferedReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStreamReader;

class Abap {

    public static void main(String[] args)throws IOException {
        String link = "https://www.cbr-xml-daily.ru/daily_json.js";
        Parser parser = new Parser();

        URL obj = new URL(link);
        HttpURLConnection connection = (HttpURLConnection) obj.openConnection();

        connection.setRequestMethod("GET");
        connection.connect();

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String inputLine;
        String response = new String();
        String valuteValue;
        while ((inputLine = in.readLine()) != null)  {
            response = response + inputLine;
        }
        in.close();

        Valute valute = parser.getValute(response);
       if(valute.CharCode.equals("HKD")){
                valuteValue = "" + valute.Value /valute.Nominal;
                System.out.println("курс гонконского доллара к российскому рублю составляет:" + valuteValue);
       }
    }
}