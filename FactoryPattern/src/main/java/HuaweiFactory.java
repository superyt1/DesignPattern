public class HuaweiFactory implements AbstractFactory{
    @Override
    public Phone createPhone() {
        return new HuaWei();
    }
}

