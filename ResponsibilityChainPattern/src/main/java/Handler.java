public abstract class Handler {
    protected Handler nexhandler;

    public Handler getNexhandler() {
        return nexhandler;
    }

    public void setNexhandler(Handler nexhandler) {
        this.nexhandler = nexhandler;
    }

    public abstract void  process(Integer info);
}
