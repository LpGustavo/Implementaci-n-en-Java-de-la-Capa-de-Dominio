package infrastructure.persistence;

import domain.model.Asignatura;
import domain.repository.AsignaturaRepository;
import infrastructure.persistence.mapper.AsignaturaMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AsignaturaJpaRepository implements AsignaturaRepository {

    private final List<AsignaturaEntity> database = new ArrayList<>();
    private final AsignaturaMapper mapper = new AsignaturaMapper();

    @Override
    public void guardar(Asignatura asignatura) {
        database.add(mapper.toEntity(asignatura));
    }

    @Override
    public Asignatura buscarPorCodigo(String codigo) {
        return database.stream()
                .filter(a -> a.getCodigo().equals(codigo))
                .findFirst()
                .map(mapper::toDomain)
                .orElse(null);
    }

    @Override
    public List<Asignatura> listar() {
        List<Asignatura> result = new ArrayList<>();
        for (AsignaturaEntity entity : database) {
            result.add(mapper.toDomain(entity));
        }
        return result;
    }
}
