public abstract class AbstractCooking {
    public abstract void step1();
    public abstract void step2();
    public void cook(){
        System.out.println("做饭开始");
        step1();
        step2();
        System.out.println("做饭结束");
    }
}
