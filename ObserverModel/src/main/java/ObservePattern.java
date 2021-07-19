public class ObservePattern {

    public static void main(String[] args) {
        AbstractSubject subject = new ConcretSubject();
        AbstractObserver eg01 = new ConcretObserver("易拓的频道");
        AbstractObserver eg02 = new ConcretObserver("刘炜的频道");
        subject.addObserve(eg01);
        subject.addObserve(eg02);
        subject.notifyObserve();

    }
}
