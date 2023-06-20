package wspkg.day2;


import model.Customers;
import service.CustomerServiceImpl;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/webservice")
public class RestController {
    //Qns1
    @POST
    @Path("/postMethod")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String testPostMethod(@FormParam("username") String username) {
        return "Hello " + username;
    }
   private CustomerServiceImpl customerService = new CustomerServiceImpl ();

    @GET
    @Path("/customers")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customers> getCustomers() {
        return customerService.getCustomer();
    }

    @GET
    @Path("/customers/{customerId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Customers getCustomer(@PathParam("customerId") int customerId) {
        for (Customers c : customerService.getCustomer()) {
            if (c.getCustomerId ( ) == customerId) {
                return c;
            }
        }
        return null;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void addCustomer(Customers customer) {
        customerService.add(customer);
    }

    /*@DELETE
    @Path("delete/customers/{customerId}")
    public void deleteCustomer(@PathParam("customerId") int customerId) {
        for (Customers c : customerService){
            if (c.getCustomerId ( ) == customerId) {
                customerService.remove (c);
                break;
            }
        }
    }*/
}

