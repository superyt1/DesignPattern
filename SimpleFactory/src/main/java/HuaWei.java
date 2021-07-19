public class HuaWei implements Phone{
    String name;

    public HuaWei(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BWM{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void call() {
        System.out.println("huawei");
    }
}
