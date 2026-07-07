public class PlanBasico implements PlanSuscripcion {
    private final double precio = 5.00;
    private final int pantallas = 1;
    private final String calidad = "SD";


    @Override
    public double calcularCosto(int meses) {
        return meses * precio;
    }


    public void mostrarInfo(){
        System.out.println("---PLAN BASICO---");
        System.out.println("Precio: $" + precio + "USD por mes");
        System.out.println("Pantallas: " + pantallas);
        System.out.println("Calidad: " + calidad);
    }
}
