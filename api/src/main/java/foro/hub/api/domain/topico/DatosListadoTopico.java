package foro.hub.api.domain.topico;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String nombreCurso
) {
    public DatosListadoTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getNombreCurso());
    }
}
