package com.opacre.evaluacion.repositorios;

import com.opacre.evaluacion.entidades.Camion;
import com.opacre.evaluacion.entidades.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface camionRepository extends JpaRepository<Camion, Integer> {
}
