class AccesoZona implements Visitante {
    public double visitar(EntradaNormal normal) {
        System.out.println("Acceso solo a zona general.");
        return 0;
    }

    public double visitar(EntradaVIP vip) {
        System.out.println("Acceso a zona VIP y camerinos.");
        return 0;
    }
}