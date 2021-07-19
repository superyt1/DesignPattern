public class XiaoMi implements Phone{
    String prodName;

    public XiaoMi(String prodName) {
        this.prodName = prodName;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "prodName='" + prodName + '\'' +
                '}';
    }

    @Override
    public void call() {
        System.out.println("xiaomi");
    }
}
