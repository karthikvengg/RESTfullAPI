/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.struts;
import javax.ws.rs.*; 
import javax.ws.rs.core.MediaType;
/**
 *
 * @author Karthikeyan_Varadara
 */

@Path("/test")
public class NewClass {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String test(){
        String response="Hello world";
        return response;
    }
}
