public class PrintButton {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    void doPrint(){
        command.execute();
    }
}
