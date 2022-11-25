package com.domainmodule.Controller;

import com.domainmodule.Bean.Admin;
import com.domainmodule.DAO.AdminDAO;
import com.domainmodule.DAO.DAOImplementation.AdminDAOImpl;
import com.domainmodule.HelloApplication;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/admin")
public class AdminController extends HelloApplication {
    AdminDAO adminDAO = new AdminDAOImpl();

    @POST
    @Path("/addAdmin")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public Response add_admin(Admin admin){
        System.out.println("HIII Kisdfsdflj");
        System.out.printf(String.valueOf(admin));
        if(adminDAO.addAdmin(admin)){
            return Response.status(200).entity("Success").build();
        }

        return Response.status(400).entity("Failure while adding department").build();
    }

    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get_all_departments(){
        List<Admin> admins = adminDAO.getAdminList();
        System.out.printf("Hello world");
        return Response.status(200).entity(admins).build();
    }
}
