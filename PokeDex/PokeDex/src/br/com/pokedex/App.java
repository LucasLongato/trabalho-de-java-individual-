package br.com.pokedex;

import br.com.pokedex.network.HTTPRequest;
import br.com.pokedex.network.JSONObject;

public class App {
    private static String key;
    private static Object JSONarray;

    public static void main(String[] args) throws Exception {
     JSONObject object=new HTTPRequest().requestGetMethod("https://pokeapi.co/api/v2/pokemon");

    
      //int count = (object.getInt("count"));
    //String next =object.getString("next");
        JSONarray = object.getJSONArray("results");

        String array;
        for(int index=0; index < array.length(); index++){

            JSONObject pokeObject=array.getJSONObject(index);

            String Pokenome = pokeObject.getString( "name");
            String pokeURL = pokeObject.getString( "url");
            
            System.out.println(Pokenome + "-"+ pokeURL);
        }
        }
        System.out.println(next);
    }
}
