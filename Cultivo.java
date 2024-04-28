public class Cultivo {
    private String nombre;
    private String generalidades;
    private String plagas;
    private String productos;
    
    public Cultivo(String nombre, String generalidades, String plagas, String productos) {
        this.nombre = nombre;
        this.generalidades = generalidades;
        this.plagas = plagas;
        this.productos = productos;
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

    public String getProductos() {
        return productos;
    }

    public void setProductos() {
        this.productos = productos;
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
