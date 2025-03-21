package com.alvaradoid.idproject.services;
import com.alvaradoid.idproject.models.Productos;
import com.alvaradoid.idproject.repositorios.Repo_Productos;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Productos_Services {
    private Repo_Productos repositorio = new Repo_Productos();

    public List<Productos> finAll() {
        return repositorio.finAll().stream().map(p->{
            Double precioTotal=p.getPrecio()*1.50d;
            Productos newProductos =(Productos)p.clone();
            newProductos.setPrecio(precioTotal.intValue());
            return newProductos;
        }).collect(Collectors.toList());
    }
    public Productos buscaId(long idproducto){
        return repositorio.buscaId(idproducto);
    }
}
