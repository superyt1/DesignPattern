public class CookingFood extends AbstractCooking{

    @Override
    public void step1() {
        System.out.println("放西红柿和鸡蛋");
    }

    @Override
    public void step2() {
        System.out.println("少放油多放味精");
    }
    public void specialHandler(){
        System.out.println("特殊处理");
    }
}
