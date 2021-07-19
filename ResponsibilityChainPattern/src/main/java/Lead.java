public class Lead extends Handler{
    @Override
    public void process(Integer info) {
        if (info<=10){
            System.out.println("lead handle---"+info);
        }else{
            nexhandler.process(info);
        }
    }
}
