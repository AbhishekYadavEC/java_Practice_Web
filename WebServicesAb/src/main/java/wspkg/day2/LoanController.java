package wspkg.day2;


import service.LoanInterfImpl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/webservice")
public class LoanController {
    //Qns4
    /*@GET
    @Path("/loan/{applicant}")
    public Response getLoan(@PathParam("applicant") String applicant) {
        // your code here
        if (applicant.equals("John")) {
            return Response.status(200).entity("Eligible for $1000 loan").build();
        } else if (applicant.equals("Jane")) {
            return Response.status(200).entity("Eligible for $500 loan").build();
        } else {
            return Response.status(404).entity("Applicant not found").build();
        }
    }*/

    //Qns 5
    private LoanInterfImpl loanInterf=new LoanInterfImpl ();
        @GET
        @Path("/loan/{id}")
        @Produces(MediaType.APPLICATION_JSON)
        public Response getLoan(@PathParam("id") int id) {
            // your code here

            if (loanInterf.getLoanList () == null) {
                return Response.status(404).entity("Loan not found").build();
            } else {
                return Response.status(200).entity(loanInterf.getLoanList ()).build();
            }
        }

}
