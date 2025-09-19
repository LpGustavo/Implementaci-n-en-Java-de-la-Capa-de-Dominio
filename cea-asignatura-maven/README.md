# CEA - Asignatura (Dominio en Arquitectura Hexagonal)

## 📂 Estructura del dominio

```
src/main/java/edu/cea/domain/
│── Asignatura.java              (Entidad / Agregado raíz)
│── Profesor.java                (Entidad)
│── NumeroCreditos.java          (Value Object)
│── Email.java                   (Value Object)
│── Semestre.java                (Value Object)
│── ServicioCalculoCargaAcademica.java (Servicio de dominio)
│── AsignaturaFactory.java       (Factory Pattern)
│── SemestreValidoSpecification.java (Specification Pattern)
│── AsignaturaCreada.java        (Evento de dominio)
│── ProfesorAsignadoAAAsignatura.java (Evento de dominio)
│── AsignaturaInvalidaException.java (Excepción de dominio)
│── ProfesorNoAsignadoException.java (Excepción de dominio)
```

## ✅ Justificación de patrones aplicados
- **Factory**: asegura que una `Asignatura` siempre se cree con invariantes válidos.
- **Specification**: permite encapsular validaciones reutilizables (ej. semestre válido).
- **Domain Service**: `ServicioCalculoCargaAcademica` aplica reglas que involucran varias entidades.

## 🧪 Tests
Incluye pruebas unitarias con **JUnit 5** para:
- `NumeroCreditos` (Value Object con invariantes)
- `Asignatura` (Entidad y agregado raíz)
- `ServicioCalculoCargaAcademica` (Servicio de dominio)
