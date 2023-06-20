package wspkg.day1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import model.Loan;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@Path("/webservice")
public class HelloWorld {
    /*@GET
        @Path("/helloworld/")
        @Produces(MediaType.TEXT_PLAIN)
        //Qns1
        *//*public String greet(@QueryParam("name")String name){
        return "Hello World";
    }*//*
    //Qns2
//    public String greet(@QueryParam ("name") String name){
//        return "Hello "+name;
//    }

    //Qns3-Here we are using Pathparam Annotation.
   *//*@Path("/helloworld/{name}")
    public String greet(@PathParam ("name") String name){
        return "Hello "+name;
    }*/

    //Qns 4

    /*List<Loan> loans = new ArrayList<> ();
    private List<Loan> fetchCustomerLoans(int customerId){
        loans.add (new Loan (101,3453,23000000,"active","Abhishek"));
        loans.add (new Loan (102,8233,780000,"close","Thamesh"));
        loans.add (new Loan (103,8976,670000,"active","Rajneesh"));
        return loans;
    }*/
   /* @GET
    @Path("/helloworld/{customerId}/loans")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCustomerLoans(@PathParam("customerId") int customerId) {
        // Fetch all loans for the given customer ID
        List<Loan> loans = fetchCustomerLoans(customerId);
        // Convert the loans data to a JSON response
        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new ToStringSerializer ());
        mapper.registerModule(module);
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        String json = "";
        try {
            json = mapper.writeValueAsString(loans);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return Response.ok(json).build();
    }*/

}
