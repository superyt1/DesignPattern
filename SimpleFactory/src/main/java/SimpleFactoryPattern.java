public class SimpleFactoryPattern {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Phone huwei = factory.createPhone("huawei");
        huwei.call();
        Factory factory1 = new Factory();
        Phone xiaomi = factory1.createPhone("xiaomi");
        xiaomi.call();
    }
}
