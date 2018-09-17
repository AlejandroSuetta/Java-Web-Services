/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.curso.java.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author EducacionIT
 */
@WebService(serviceName = "HolaMundoWebService") //esta anotation dice que esta clase es un Web Service.
public class HolaMundoWebService {

    @WebMethod(operationName = "sumar")
    public double sumar(@WebParam(name = "num1")double num1, @WebParam(name = "num2")double num2) {
        return num1 + num2;
    }
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
}
