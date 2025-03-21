package com.alvaradoid.idproject.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvaradoid.idproject.models.Productos;
import com.alvaradoid.idproject.services.Productos_Services_Imp;

@RestController
@RequestMapping("/api")
public class Product_Controller {
    @Autowired
    private Productos_Services_Imp servicios;
    @GetMapping()
    public List<Productos> ListProductos(){
        return servicios.finAll();
    }

    @GetMapping("/{idProducto}")
    public Productos mostrar(@PathVariable long idProducto){
        return servicios.buscaId(idProducto);
    }

}
