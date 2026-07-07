public class PlanEstandar implements PlanSuscripcion {
    private final double precio = 9.00;
    private final int pantallas = 2;
    private final String calidad = "Full HD";

    @Override
    public double calcularCosto(int meses){
        return meses * 9;
    }

    public void mostrarInfo(){
        System.out.println("Precio: $" + precio + "USD por mes");
        System.out.println("Pantallas: " + pantallas );
        System.out.println("Calidad: " + calidad);
    }
}
