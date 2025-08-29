package com.opacre.evaluacion.servicios;

import com.opacre.evaluacion.entidades.Camion;
import com.opacre.evaluacion.repositorios.camionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class camionServicioImp implements camionServicio{

    private final camionRepository camionRepository;

    public camionServicioImp(camionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    @Override
    public Camion save(Camion camion) {
        return camionRepository.save(camion);
    }

    @Override
    public List<Camion> findAll() {
        return camionRepository.findAll();
    }

    @Override
    public Camion findById(Integer id) {
        return camionRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteByID(Integer id) {
        camionRepository.deleteById(id);
    }

    @Override
    public Camion update(Camion camion) {
        return camionRepository.save(camion);
    }
}
