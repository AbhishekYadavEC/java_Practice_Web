package wspkg;

import model.User;
import service.UserService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBElement;
import java.util.ArrayList;
import java.util.List;

@Path("/webservice")
public class HelloWorld {
    UserService userService;
    List<User> userList=new ArrayList<> ();
    @GET
    @Path("/helloworld/{userid}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greet(@PathParam("userid")String id){
        if(id.equals("101"))
            throw new UserNotFoundException("User unavailable");
        else
        return "hello User "+id;

    }
    @POST
    @Path("/formdemo")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_HTML)
    public Response form(@FormParam("name") String name, @FormParam("userid")int id){

        User user=new User(id,name);
        return Response.status(200)
                .entity("user is "+user)
                 .entity("<h1>Form parameter name :   "+name+" id:  "+id+"</h1>")
                .build();
    }

    @GET
    @Path("/showAllUsers")
    @Produces(MediaType.APPLICATION_JSON)
    // @Produces(MediaType.APPLICATION_XML)
    public Response showUsers(){
        List<User> userList=new ArrayList<>();
        userList.add(new User(1,"Ramya"));
        userList.add(new User(2,"Niyank"));
        userList.add(new User(3,"Sahil"));
        return Response.status(200).entity(userList.toString()).build();
    }

    @GET
    @Path("/isValid")
    public Response isValid(@QueryParam("userId") int userId ){
        userService.isValid(userId);
        return null;
    }

    @PUT
    @Path("/addUser")
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void putUser(JAXBElement<User> userJAXBElement) {
        User user = userJAXBElement.getValue();
        System.out.println("user "+user);

    }
}
