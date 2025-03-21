package com.alvaradoid.idproject.services;
import com.alvaradoid.idproject.models.Productos;
import com.alvaradoid.idproject.repositorios.ProductoRepositorio;
import com.alvaradoid.idproject.repositorios.Repo_Productos_Imp;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Productos_Services_Imp implements ProductoServicios {
    @Autowired
        private Repo_Productos_Imp repositorio;

        @Override
        public List<Productos> finAll() {
            return repositorio.finAll().stream().map(p->{
                Double precioTotal=p.getPrecio()*1.50d;
                Productos newProductos =(Productos)p.clone();
                newProductos.setPrecio(precioTotal.intValue());
                return newProductos;
            }).collect(Collectors.toList());
        }
        @Override
        public Productos buscaId(long idproducto){
            return repositorio.buscaId(idproducto);
        }
}
