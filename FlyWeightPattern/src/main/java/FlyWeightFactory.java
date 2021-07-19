import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlyWeightFactory {

    //单列模式
    public static FlyWeightFactory flyWeightFactory = new FlyWeightFactory();
    static FlyWeightFactory getInstance(){
        return flyWeightFactory;
    }

    public Set<FlyWeight> getPool() {
        return pool;
    }

    public void setPool(Set<FlyWeight> pool) {
        this.pool = pool;
    }

    //引入池子
    private Set<FlyWeight> pool = new HashSet<>();
    //初始化池子


    public FlyWeightFactory() {
        for (int i = 0; i < 10; i++) {
            FlyWeight moByFlyWeight = new MoByFlyWeight(i + "");
            pool.add(moByFlyWeight);
        }
    }
    public FlyWeight getBike(){
        FlyWeight res = null;
        for (FlyWeight item :
                pool) {
            System.out.println("111");
            if (item.getIsRide() == false) {
                res = item;
                break;
            }
        }
        return  res;
    }
}
