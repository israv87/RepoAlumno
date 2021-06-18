/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.apirest;

import com.apirest.bean.Alumno;
import com.apirest.bean.Json;
import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Isra
 */
@Path("apiAlumno")
public class ApiAlumnoResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ApiAlumnoResource
     */
    public ApiAlumnoResource() {
    }

    /**
     * Retrieves representation of an instance of com.apirest.ApiAlumnoResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String consultaAlumno(@QueryParam("universidad") String universidad,
                                 @QueryParam("curso") String curso,
                                 @QueryParam("alumno") String alumno,
                                 @QueryParam("periodo") String periodo,
                                 @QueryParam("lenguaje") String lenguaje,
                                 @QueryParam("aspiracion") String aspiracion) {
        
        Alumno objAlumno = new Alumno();
        
        objAlumno.setUniversidad(universidad);
        objAlumno.setCurso(curso);
        objAlumno.setAlumno(alumno);
        objAlumno.setPeriodo(periodo);
        objAlumno.setLenguaje(lenguaje);
        objAlumno.setAspiracion(aspiracion);
        
        Json objJson = new Json();
        objJson.setAlumno(objAlumno);
        
        Gson objGson = new Gson();
        
        String jsonString = objGson.toJson(objJson);
        
        return jsonString;
       
    }

    /**
     * PUT method for updating or creating an instance of ApiAlumnoResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
