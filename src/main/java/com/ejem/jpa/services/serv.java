package com.ejem.jpa.services;

import com.ejem.jpa.beans.usuario;
import java.util.List;
import org.springframework.http.RequestEntity;

public interface serv {

    public String mensaje();
    public String guardar(usuario usr);
    public List<usuario> findAll();
    public usuario porpersona(RequestEntity<Object> request);
    public usuario erase(RequestEntity<Object> request);

}
