public class ConcretObserver extends AbstractObserver {

    private String name;

    public ConcretObserver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void update() {
        System.out.println(name+"--李白的诗更新了");
    }
}
