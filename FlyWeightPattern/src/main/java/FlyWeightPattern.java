import java.util.Set;

public class FlyWeightPattern {
    public static void main(String[] args) {
        FlyWeightFactory instance1 = FlyWeightFactory.getInstance();
        FlyWeightFactory instance2 = FlyWeightFactory.getInstance();
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
        Set<FlyWeight> pool = instance1.getPool();
        System.out.println(pool);
        FlyWeight bike1 = instance2.getBike();
        bike1.ride("lisi");
        FlyWeight bike2 = instance2.getBike();
        bike2.ride("wangwu");
        bike2.back();
        FlyWeight bike3 = instance2.getBike();
        System.out.println(bike2 == bike3);
    }
}
