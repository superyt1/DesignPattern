import javax.xml.soap.Text;

public class PrintCommand implements Command{
    TextBox textBox;

    public PrintCommand(TextBox textBox) {
        this.textBox = textBox;
    }

    @Override
    public void execute() {
        System.out.println(textBox.text);
    }
}
