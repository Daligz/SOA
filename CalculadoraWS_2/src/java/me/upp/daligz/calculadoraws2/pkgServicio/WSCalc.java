/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.upp.daligz.calculadoraws2.pkgServicio;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import me.upp.daligz.calculadoraws2.pkgFuncionalidad.Calculadora;
import me.upp.daligz.calculadoraws2.pkgFuncionalidad.Mul;
import me.upp.daligz.calculadoraws2.pkgFuncionalidad.Sum;

/**
 *
 * @author Dali
 */
@WebService(serviceName = "WSCalc")
public class WSCalc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Double suma(@WebParam(name = "num1") final int num1, @WebParam(name = "num2") final int num2) {
        //TODO write your implementation code here:
        return new Sum().calcular(num1, num2);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicar")
    public Double multiplicar(@WebParam(name = "num1") final int num1, @WebParam(name = "num2") final int num2) {
        //TODO write your implementation code here:
        return new Mul().calcular(num1, num2);
    }
}
