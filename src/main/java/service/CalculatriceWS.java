package service;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService
public class CalculatriceWS {
    @WebMethod(operationName = "somme")
    public double somme(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }




    @WebMethod(operationName = "Soustraction")
    public double soustraction(@WebParam(name = "a") double a, @WebParam(name = "b") double b){
        return a-b;
    }

    @WebMethod(operationName = "Multiplication")
    public double  multiplication(@WebParam(name = "a") double a, @WebParam(name = "b") double b){
        return a*b;
    }

    @WebMethod(operationName = "Division")
    public Double division(@WebParam(name = "a") double a, @WebParam(name = "b") double b){


    if (b==0)
        return null;
    else
        return a/b;
    }
    public CalculatriceWS() {
    }
}
