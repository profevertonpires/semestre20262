package abstracty.factory;

import abstracty.factory.mac.MacButton;
import abstracty.factory.mac.MacCheckbox;

public class MacFactory  implements GUIFactory {
    public Button createButton() { return new MacButton(); }
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}



