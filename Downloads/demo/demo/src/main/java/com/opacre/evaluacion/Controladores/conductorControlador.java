package com.opacre.evaluacion.Controladores;

import com.opacre.evaluacion.entidades.Camion;
import com.opacre.evaluacion.entidades.Conductor;
import com.opacre.evaluacion.servicios.conductorServicio;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conductores")
public class conductorControlador {
    private final conductorServicio conductorServicio;

    public conductorControlador(conductorServicio conductorServicio) {
        this.conductorServicio = conductorServicio;
    }

    @PostMapping
    public Conductor save(@RequestBody Conductor conductor){

        return conductorServicio.save(conductor);
    }

    @GetMapping
    public List<Conductor> findAll() {
        return conductorServicio.findAll();
    }

    @GetMapping("/{id}")
    public Conductor findById(@PathVariable Integer id) {
        return conductorServicio.findById(id);
    }

    @PutMapping("/{id}")
    public Conductor update(@PathVariable Integer id, @RequestBody Conductor conductor) {
        conductor.setId(id);
        return conductorServicio.update(conductor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        conductorServicio.deleteByID(id);
    }
}
