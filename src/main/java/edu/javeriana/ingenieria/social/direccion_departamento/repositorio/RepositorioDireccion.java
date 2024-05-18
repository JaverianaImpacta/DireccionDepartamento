package edu.javeriana.ingenieria.social.direccion_departamento.repositorio;

import edu.javeriana.ingenieria.social.direccion_departamento.dominio.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioDireccion extends JpaRepository<Direccion, Integer> {
    List<Direccion> findAllByDepartamento(Integer departamento);

    Direccion findOneById(Integer id);
}
