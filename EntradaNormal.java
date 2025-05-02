// Clase para entradas normales
class EntradaNormal implements Entrada {
    private double precio;

    public EntradaNormal(double precio) {
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