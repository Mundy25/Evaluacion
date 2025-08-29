package com.opacre.evaluacion.servicios;


import com.opacre.evaluacion.entidades.Conductor;

import java.util.List;

public interface conductorServicio {

    Conductor save (Conductor conductor);
    List<Conductor> findAll();
    Conductor findById(Integer id);
    void deleteByID (Integer id);
    Conductor update(Conductor conductor);
}
