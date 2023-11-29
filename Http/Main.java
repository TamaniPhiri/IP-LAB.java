package Http;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        String url = "https://google.com";
        try {
            String response = sendRequest(url);
            System.out.println(response.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String sendRequest(String ulString) throws IOException {
        StringBuilder response = new StringBuilder();
        URL url = new URL(ulString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line).append("\n");
            }
        } finally {
            connection.disconnect();
        }
        return response.toString();
    }
}
