package edu.javeriana.ingenieria.social.direccion_departamento.controlador;

import edu.javeriana.ingenieria.social.direccion_departamento.dominio.Direccion;
import edu.javeriana.ingenieria.social.direccion_departamento.servicio.ServicioDireccion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/direcciones/departamento")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorDireccion {

    @Autowired
    private ServicioDireccion servicio;
    @GetMapping("listar")
    public List<Direccion> obtenerDirecciones(){
        return servicio.obtenerDirecciones();
    }

    @GetMapping("obtener")
    public ResponseEntity<Direccion> obtenerDireccion(@RequestParam Integer id){
        if(id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.direccionExiste(id)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerDireccion(id), HttpStatus.OK);
    }

    @GetMapping("obtenerDepartamento")
    public ResponseEntity<List<Direccion>> obtenerDirecciones(Integer departamento){
        if(departamento == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(servicio.obtenerDirecciones(departamento).isEmpty()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerDirecciones(departamento), HttpStatus.OK);
    }
}
