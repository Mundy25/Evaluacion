package com.opacre.evaluacion.servicios;

import com.opacre.evaluacion.entidades.Camion;

import java.util.List;

public interface camionServicio {
    Camion save (Camion camion);
    List<Camion> findAll();
    Camion findById(Integer id);
    void deleteByID (Integer id);
    Camion update(Camion camion);
}
