package clientpkg;

import com.sun.jersey.api.client.WebResource;
import model.User;
import org.glassfish.jersey.client.ClientResponse;

import javax.ws.rs.client.Client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TesterClient {

    static WebResource webResource;

    public static void main(String[] arg) throws IOException {

        //1.. create client
        Client client = Client.create();
        //2- get the resource

        webResource = client.resource("http://localhost:8080/Webservice/rest");


        //getDetails();
        putUser();
    }

        HttpURLConnection urlConnection=null;
        URL url=new URL("http://localhost:8080/Webservice/rest/webservice/helloworld/pk?name=Abhishek");
        urlConnection=(HttpURLConnection); url.openConnection();
        urlConnection.setRequestMethod("GET");

        StringBuilder result=new StringBuilder();
        String line;
        try(BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));){
            while((line=bufferedReader.readLine())!=null){
                    result.append(line);
                    }
            System.out.println(result);
        }
    }

    //Here we are finding the details of all user

    public static void getDetails(){
        //3 get response from web service method

        ClientResponse response = webResource.path("webservice/helloworld/101").accept("text/plain").get(ClientResponse.class);
		if (response.getStatus() != 200)
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());

		String output = response.getEntity(String.class);
		System.out.println(output);
    }

    public static void putUser(){
        User user=new User(101,"PP");
        webResource.path("webservice/addUser").put(user);
    }


}


