package ButtonTextFieldCheckBox;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("GUI components demo");
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        Button button = new Button("Button 1");
        frame.add(button);

        TextField textField = new TextField("Type here");
        frame.add(textField);

        Scrollbar scrollbar = new Scrollbar();
        frame.add(scrollbar);

        Choice choice = new Choice();
        choice.add("Click here");
        choice.add("Click here also");

        frame.add(choice);

        Checkbox checkbox = new Checkbox();
        frame.add(checkbox);

        List list = new List();
        list.add("List item 1");
        list.add("List item 2");
        frame.add(list);
        frame.setVisible(true);
    }
}
