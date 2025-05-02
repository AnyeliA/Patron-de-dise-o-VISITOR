// Clase para entradas VIP
class EntradaVIP implements Entrada {
    private double precio;

    public EntradaVIP(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

     public double aceptar(Visitante visitante) {
        double resultado = visitante.visitar(this);
        return resultado;
    }
}