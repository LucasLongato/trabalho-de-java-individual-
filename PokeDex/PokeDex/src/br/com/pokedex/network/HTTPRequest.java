package br.com.pokedex.network;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import netscape.javascript.JSObject;

public class HTTPRequest {

    public JSONObject requestGetMethod(String stringUrl) {

        try {
            URL url = new URL(stringUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            String response = IOUtils.toString(
                    connection.getInputStream(),
                    "utf-8");
            JSONObject jsonobject = new JSONObject(response);
            System.out.println(response);
            return jsonobject;
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
