// Clase principal para probar todo
public class Concierto {
    public static void main(String[] args) {
        Entrada entrada1 = new EntradaNormal(100);
        Entrada entrada2 = new EntradaVIP(200);

        Visitante descuento = new Descuento();
        Visitante acceso = new AccesoZona();

        System.out.println("Precio con descuento (Normal): " + entrada1.aceptar(descuento));
        System.out.println("Precio con descuento (VIP): " + entrada2.aceptar(descuento));

        entrada1.aceptar(acceso); // imprime acceso
        entrada2.aceptar(acceso); // imprime acceso
    }
}