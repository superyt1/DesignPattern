import java.util.ArrayList;
import java.util.List;

public class ConcretSubject extends AbstractSubject{
    private List ObserverList = new ArrayList();
    @Override
    public void addObserve(AbstractObserver observer) {
        ObserverList.add(observer);
    }

    @Override
    public void notifyObserve() {
        for (Object o : ObserverList) {
            AbstractObserver o1 = (AbstractObserver) o;
            o1.update();
        }
    }
}
