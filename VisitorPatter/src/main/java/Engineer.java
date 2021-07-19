public class Engineer extends Staff{
    public Engineer(String name, int kpi) {
        super(name, kpi);
    }

    @Override
    void accept(Vistor vistor) {
        vistor.visite(this);
    }
}
