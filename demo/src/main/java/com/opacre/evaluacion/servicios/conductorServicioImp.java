package com.opacre.evaluacion.servicios;

import com.opacre.evaluacion.entidades.Camion;
import com.opacre.evaluacion.entidades.Conductor;
import com.opacre.evaluacion.repositorios.conductorRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class conductorServicioImp  implements conductorServicio {

    private final conductorRepositorio conductorRepositorio;

    public conductorServicioImp(conductorRepositorio conductorRepositorio) {
        this.conductorRepositorio = conductorRepositorio;
    }

    @Override
    public Conductor save(Conductor conductor) {
        return conductorRepositorio.save(conductor);
    }

    @Override
    public List<Conductor> findAll() {
        return conductorRepositorio.findAll();
    }

    @Override
    public Conductor findById(Integer id) {
        return conductorRepositorio.findById(id).orElse(null);
    }

    @Override
    public void deleteByID(Integer id) {
    conductorRepositorio.deleteById(id);
    }

    @Override
    public Conductor update(Conductor conductor) {
        return conductorRepositorio.save(conductor);
    }
}