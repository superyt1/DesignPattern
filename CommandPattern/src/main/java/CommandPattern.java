public class CommandPattern {
    public static void main(String[] args) {
        Command printCommand = new PrintCommand(new TextBox("易拓的毕业论文"));
        PrintButton printButton = new PrintButton();
        printButton.setCommand(printCommand);
        printButton.doPrint();
    }
}
