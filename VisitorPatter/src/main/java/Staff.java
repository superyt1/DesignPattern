public abstract class Staff {
    String name;
    int kpi;

    public Staff(String name, int kpi) {
        this.name = name;
        this.kpi = kpi;
    }
    abstract void accept(Vistor vistor);
}
