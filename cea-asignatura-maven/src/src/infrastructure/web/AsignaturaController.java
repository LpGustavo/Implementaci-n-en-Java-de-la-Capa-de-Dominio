package infrastructure.web;

import domain.model.Asignatura;
import application.usecases.CrearAsignaturaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {

    private final CrearAsignaturaService crearService;

    public AsignaturaController(CrearAsignaturaService crearService) {
        this.crearService = crearService;
    }

    @PostMapping
    public void crearAsignatura(@RequestBody Asignatura asignatura) {
        crearService.ejecutar(asignatura);
    }

    @GetMapping("/{codigo}")
    public Asignatura obtener(@PathVariable String codigo) {
        // Este ejemplo asume que tu servicio tiene un método buscar
        return crearService.buscarPorCodigo(codigo);
    }
}
