package com.opacre.evaluacion.Controladores;


import com.opacre.evaluacion.entidades.Camion;
import com.opacre.evaluacion.servicios.camionServicio;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/camiones")
public class camionControlador {
    private final camionServicio camionServicio ;

    public camionControlador(camionServicio camionServicio) {
        this.camionServicio = camionServicio;
    }

    @PostMapping
    public Camion save(@RequestBody  Camion camion){

        return camionServicio.save(camion);
    }
    @GetMapping
    public List<Camion> findAll() {
        return camionServicio.findAll();
    }

    @GetMapping("/{id}")
    public Camion findById(@PathVariable Integer id) {
        return camionServicio.findById(id);
    }

    @PutMapping("/{id}")
    public Camion update(@PathVariable Integer id, @RequestBody Camion camion) {
        camion.setId(id);
        return camionServicio.update(camion);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id) {
        camionServicio.deleteByID(id);
    }


}
