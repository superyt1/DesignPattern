public class FactoryMethodPattern {
    public static void main(String[] args) {
        AbstractFactory huaweiFactory = new HuaweiFactory();
        AbstractFactory xiaomiFactory = new XiaoMiFactory();
        Phone phone = huaweiFactory.createPhone();
        phone.call();
        Phone phone1 = xiaomiFactory.createPhone();
        phone1.call();
    }
}
