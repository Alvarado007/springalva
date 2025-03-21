package com.alvaradoid.idproject.repositorios;

import java.util.List;

import com.alvaradoid.idproject.models.Productos;

public interface ProductoRepositorio {
    List<Productos> finAll();
    Productos buscaId(long idproducto);
}
