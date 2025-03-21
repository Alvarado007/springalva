package com.alvaradoid.idproject.services;

import java.util.List;

import com.alvaradoid.idproject.models.Productos;

public interface ProductoServicios {
    public List<Productos> finAll();
    Productos buscaId(long idproducto);
}
