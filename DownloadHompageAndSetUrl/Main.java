package DownloadHompageAndSetUrl;

import java.io.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.google.com";

        try {
            String content = readUrl(url);
            System.out.println(content);
            System.out.println(content.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readUrl(String urlString) throws IOException {
        StringBuilder content = new StringBuilder();
        URL url = new URL(urlString);
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
