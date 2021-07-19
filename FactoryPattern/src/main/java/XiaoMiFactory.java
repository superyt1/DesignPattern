public class XiaoMiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new XiaoMi();
    }
}

