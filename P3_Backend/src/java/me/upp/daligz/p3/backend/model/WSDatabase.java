package me.upp.daligz.p3.backend.model;

import java.util.concurrent.atomic.AtomicReference;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSDatabase")
public class WSDatabase {

    @WebMethod(operationName = "create")
    public String hello(@WebParam(name = "name") String name, @WebParam(name = "user") String user,
            @WebParam(name = "password") String password) {
        Model.getInstance().create(name, user, password);
        return "OK!";
    }
}
