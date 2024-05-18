package edu.javeriana.ingenieria.social.direccion_departamento.dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name="direccion_departamento")
public class Direccion {
    @Id
    private Integer id;
    private Integer departamento, director;
    @Column(name="fecha_inicio")
    private Date fechaInicio;
    @Column(name="fecha_final")
    private Date fechafinal;
}
