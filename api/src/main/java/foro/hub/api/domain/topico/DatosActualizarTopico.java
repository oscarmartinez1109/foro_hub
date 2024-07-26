package foro.hub.api.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(
        @NotNull
        Long id,
        String idUsuario,
        String titulo,
        String mensaje,
        String nombreCurso
) {
}
