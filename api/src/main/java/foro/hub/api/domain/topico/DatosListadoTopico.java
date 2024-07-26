package foro.hub.api.domain.topico;

import java.time.LocalDate;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombreCurso,
        LocalDate fecha
) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getNombreCurso(), topico.getFecha());
    }
}
