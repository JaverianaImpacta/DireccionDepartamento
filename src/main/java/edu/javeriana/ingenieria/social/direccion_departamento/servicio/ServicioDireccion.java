package edu.javeriana.ingenieria.social.direccion_departamento.servicio;

import edu.javeriana.ingenieria.social.direccion_departamento.dominio.Direccion;
import edu.javeriana.ingenieria.social.direccion_departamento.repositorio.RepositorioDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDireccion {
    @Autowired
    private RepositorioDireccion repositorio;

    public List<Direccion> obtenerDirecciones(){
        return repositorio.findAll();
    }

    public List<Direccion> obtenerDirecciones(Integer departamento){
        return repositorio.findAllByDepartamento(departamento);
    }

    public boolean direccionExiste(Integer id){
        return repositorio.existsById(id);
    }

    public Direccion obtenerDireccion(Integer id){
        return repositorio.findOneById(id);
    }
}
