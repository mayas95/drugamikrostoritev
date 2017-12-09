package si.prpo.drugamikrostoritev.v1.viri;

import si.prpo.drugamikrostoritev.servlet.InsuranceCompany;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("storitev")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class StoritevVir {


    List<InsuranceCompany> storitve=new ArrayList<InsuranceCompany>();


    @GET
    public Response vrniStoritve(){
        nastaviPodatke();
        return Response.status(Response.Status.OK).entity(storitve).build();
    }

    @Path("{id}")
    @GET
    public Response vrniStoritev(@PathParam("id") Integer id) {
        nastaviPodatke();
        if(id==1){
            InsuranceCompany s1=storitve.get(0);
            return Response.status(Response.Status.OK).entity(s1).build();
        }
        if(id==2){
            InsuranceCompany s2=storitve.get(1);
            return Response.status(Response.Status.OK).entity(s2).build();
        }
        if(id==3){
            InsuranceCompany s3=storitve.get(2);
            return Response.status(Response.Status.OK).entity(s3).build();
        }
        if(id==4){
            InsuranceCompany s4=storitve.get(3);
            return Response.status(Response.Status.OK).entity(s4).build();
        }
        else{
            return null;
        }
    }

    public void nastaviPodatke(){
        InsuranceCompany s1=new InsuranceCompany();
        s1.setId(1);
        s1.setName("Triglav");
        storitve.add(s1);

        InsuranceCompany s2=new InsuranceCompany();
        s2.setId(2);
        s2.setName("Adria");
        storitve.add(s2);

        InsuranceCompany s3=new InsuranceCompany();
        s3.setId(3);
        s3.setName("Sava");
        storitve.add(s3);

        InsuranceCompany s4=new InsuranceCompany();
        s4.setId(4);
        s4.setName("Generali");
        storitve.add(s4);

    }
}