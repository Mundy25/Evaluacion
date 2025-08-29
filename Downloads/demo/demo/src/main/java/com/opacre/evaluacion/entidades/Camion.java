package com.opacre.evaluacion.entidades;

import jakarta.persistence.*;

@Entity
public class Camion {



    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id ;
    private  String placa ;

    @OneToOne
    @JoinColumn(name = "conductor_id")
    private String conductor;

    public Camion() {

    }


    public Camion(Integer id, String placa, String conductor) {
        this.id = id;
        this.placa = placa;
        this.conductor = conductor;
    }

    public Integer getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}
