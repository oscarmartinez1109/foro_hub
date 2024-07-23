package foro.hub.api.domain.topico;

import java.time.LocalDate;

public record DatosRespuestaTopico(
        Long id,
        String idUsuario,
        String titulo,
        String mensaje,
        String nombreCurso,
        LocalDate fecha
) {
}
