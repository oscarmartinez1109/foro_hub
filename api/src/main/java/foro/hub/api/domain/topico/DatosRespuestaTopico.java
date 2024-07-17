package foro.hub.api.domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String idUsuario,
        String titulo,
        String mensaje,
        String nombreCurso
) {
}
