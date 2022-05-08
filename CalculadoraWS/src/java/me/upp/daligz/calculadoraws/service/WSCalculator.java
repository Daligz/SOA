package me.upp.daligz.calculadoraws.service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import me.upp.daligz.calculadoraws.functionality.Div;
import me.upp.daligz.calculadoraws.functionality.Mul;
import me.upp.daligz.calculadoraws.functionality.Sub;
import me.upp.daligz.calculadoraws.functionality.Sum;

@WebService(serviceName = "WSCalculator")
public class WSCalculator {

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return new Sum().operation(num1, num2);
    }
    
    
    @WebMethod(operationName = "resta")
    public double resta(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return new Sub().operation(num1, num2);
    }
    
    
    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return new Div().operation(num1, num2);
    }
    
    
    @WebMethod(operationName = "multiplicacion")
    public double multiplicacion(@WebParam(name = "num1") int num1, @WebParam(name = "num2") int num2) {
        return new Mul().operation(num1, num2);
    }
}
