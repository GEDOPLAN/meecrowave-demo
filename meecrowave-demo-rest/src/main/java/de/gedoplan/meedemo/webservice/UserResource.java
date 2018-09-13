package de.gedoplan.meedemo.webservice;

import de.gedoplan.meedemo.entity.User;

import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("user")
@ApplicationScoped
public class UserResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public User getUser() {
    return new User("Duke", LocalDate.of(1995, 5, 23));
  }
}
