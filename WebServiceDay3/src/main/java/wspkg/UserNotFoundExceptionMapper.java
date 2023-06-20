package wspkg;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UserNotFoundExceptionMapper implements ExceptionMapper<UserNotFoundException> {
    @Override
    public Response toResponse(UserNotFoundException userNotFoundException) {

        return Response.status(404).entity("User Not Availabe"+userNotFoundException.getMessage()).build();
    }
}
