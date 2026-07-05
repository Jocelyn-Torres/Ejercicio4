public class PlanBasico implements PlanSuscripcion{

    @Override
    public double clacularCosto(int meses) {
        return meses * 5;
    }

}
