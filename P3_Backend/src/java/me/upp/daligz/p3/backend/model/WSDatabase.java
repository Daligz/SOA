package me.upp.daligz.p3.backend.model;

import com.google.gson.Gson;
import java.util.concurrent.atomic.AtomicReference;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "WSDatabase")
public class WSDatabase {
    
    private final Gson gson = new Gson();

    @WebMethod(operationName = "create")
    public String create(@WebParam(name = "name") final String name, @WebParam(name = "user") final String user,
            @WebParam(name = "password") int password) {
        Model.getInstance().create(name, user, password);
        return "OK!";
    }
    
    // This is a bad implementation but I can't find another way and I'm lazy.
    @WebMethod(operationName = "read")
    public String read(@WebParam(name = "id") final int id) {
        final AtomicReference<String> atomicResponse = new AtomicReference<>();
        Model.getInstance().read(id).whenCompleteAsync((user, throwable) -> {
            if (throwable != null) {
                atomicResponse.updateAndGet(t -> throwable.getMessage());
                return;
            }
            atomicResponse.updateAndGet(t -> this.gson.toJson(user));
        });
        
        // Keep alive
        while(true) if (atomicResponse.get() != null) return atomicResponse.get();
    }
    
    @WebMethod(operationName = "update")
    public String update(@WebParam(name = "id") final int id, @WebParam(name = "value") final String value,
            @WebParam(name = "valueToUpdate") String valueToUpdate) {
        Model.getInstance().update(id, value, valueToUpdate);
        return "OK!";
    }
    
    @WebMethod(operationName = "delete")
    public String delete(@WebParam(name = "id") final int id) {
        Model.getInstance().delete(id);
        return "OK!";
    }
}