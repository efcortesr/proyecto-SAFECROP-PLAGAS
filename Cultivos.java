package GUI;

public class Cultivos {

    private String nombre;
    private String generalidades;
    private String plagas;
    
    public Cultivos(String nombre, String generalidades, String plagas) {
        this.nombre = nombre;
        this.generalidades = generalidades;
        this.plagas = plagas;
    }

    public String getPlagas() {
        return plagas;
    }

    public void setPlagas(String plagas) {
        this.plagas = plagas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneralidades() {
        return generalidades;
    }

    public void setGeneralidades(String generalidades) {
        this.generalidades = generalidades;
    }
}
