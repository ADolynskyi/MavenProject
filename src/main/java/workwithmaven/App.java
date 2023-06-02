package workwithmaven;

import com.google.gson.Gson;

import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
        Map<String, String> myData = new LinkedHashMap<>();
        myData.put("name", "Anatolii");
        myData.put("lastName","Dolynskyi");
        System.out.println( new Gson().toJson(myData));
    }
}
