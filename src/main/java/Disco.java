public class Disco {
    private String artista;
    private String titulo;
    private int ano;
    private String duracion;

    public Disco(String artista, String titulo, int ano, String duracion) {
        this.artista = artista;
        this.titulo = titulo;
        this.ano = ano;
        this.duracion = duracion;
    }

    public String getArtista() {
        return artista;
    }
    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDuracion() {
        return duracion;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return artista + " - \"" + titulo + "\" (" + ano + "), " + duracion;
    }
}