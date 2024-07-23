package foro.hub.api.domain.topico;


import java.time.LocalDate;

public record DatosRegistroTopico(
        String idUsuario,
        String titulo,
        String mensaje,
        String nombreCurso,
        LocalDate fecha
        ){
}
