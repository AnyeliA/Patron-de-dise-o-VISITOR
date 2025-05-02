class Descuento implements Visitante {
    public double visitar(EntradaNormal normal) {
        return normal.getPrecio() * 0.9; // 10% de descuento
    }

    public double visitar(EntradaVIP vip) {
        return vip.getPrecio() * 0.8; // 20% de descuento
}
}