package infrastructure.persistence.mapper;

import domain.model.Asignatura;

public class AsignaturaMapper {

    public AsignaturaEntity toEntity(Asignatura asignatura) {
        AsignaturaEntity entity = new AsignaturaEntity();
        entity.setCodigo(asignatura.getNombre()); // ejemplo simplificado
        entity.setNombreCompleto(asignatura.getNombreCompleto());
        entity.setDescripcion(asignatura.getDescripcion());
        return entity;
    }

    public Asignatura toDomain(AsignaturaEntity entity) {
        return new Asignatura(
            entity.getCodigo(),
            entity.getNombreCompleto(),
            entity.getDescripcion(),
            "areaEjemplo",
            "carreraEjemplo",
            3,
            "contenidoEjemplo",
            1,
            "profesorEjemplo"
        );
    }
}
