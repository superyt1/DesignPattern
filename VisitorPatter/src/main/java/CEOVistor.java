public class CEOVistor implements Vistor{

    @Override
    public void visite(Staff staff) {
        System.out.println("name:"+staff.name+";"+"kpi:"+staff.kpi);
    }
}
