public class ResponsibilityChain {
    public static void main(String[] args) {
        Handler lead = new Lead();
        Handler boss = new Boss();
        lead.setNexhandler(boss);

        lead.process(8);
        lead.process(9);
        lead.process(10);
        lead.process(11);
        lead.process(19);
    }
}
