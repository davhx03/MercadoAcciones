public class DatosAcciones {
    private String NombreAccion;
    private double precioAccion;


    public String getNombreAccion() {
        return NombreAccion;
    }

    public double getPrecio() {
        return precioAccion;
    }


    @Override
    public String toString() {
        return "Stock [Compañia=" + NombreAccion + ", Precio=" + precioAccion + "]";
    }

}
