package abstracty.factory;

import abstracty.factory.windows.WindowsButton;
import abstracty.factory.windows.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    public Button createButton() { return new WindowsButton(); }
    public Checkbox createCheckbox() { return new WindowsCheckbox(); }
}
