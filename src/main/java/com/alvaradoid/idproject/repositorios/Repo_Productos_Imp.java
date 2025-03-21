package com.alvaradoid.idproject.repositorios;

import java.util.Arrays;
import java.util.List;

import com.alvaradoid.idproject.models.Productos;

public class Repo_Productos_Imp {
    List<Productos> datos;

    public Repo_Productos_Imp() {
        this.datos = Arrays.asList(
            new Productos(1, "Producto 1", 100),
            new Productos(2, "Producto 2", 200),
            new Productos(3, "Producto 3", 300),
            new Productos(4, "Producto 4", 400)
        );
    }
    public List<Productos> finAll() {
        return datos;
    }

    public Productos buscaId(long idproducto){
        return datos.stream()
        .filter(p->p.getIdProducto()
        ==idproducto)
        .findFirst().orElse(null);
    }

}
