import javax.swing.plaf.ButtonUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        UI mainFrame = new UI(300,500);
        mainFrame.setSizeOfPanel();
        mainFrame.setFrame();
        mainFrame.setButtons();
        for (ButtonsUI currentButton : mainFrame.getAllButtons()) {
            mainFrame.add(currentButton);
        }

        ActionListener listener = e -> {
            if (e.getSource() instanceof ButtonsUI ) {
                ButtonsUI currentButton = ((ButtonsUI) e.getSource());
                if (CurrentState.getInstance().getCurrentItem().isEmpty()) {
                    if ((CurrentState.currentItem.equals("-") || CurrentState.currentItem.equals("+")) &&
                            currentButton.getValue().equals("+") || currentButton.getValue().equals("-")) {
                        CurrentState.currentItem = currentButton.getValue();
                    } else if (currentButton.getValue().equals("+") || currentButton.getValue().equals("-") ||
                            currentButton.getValue().equals("*") || currentButton.getValue().equals("/")) {
                        if (!CurrentState.currentItem.isEmpty()) {
                            CurrentState.elements.add(CurrentState.currentItem);
                            CurrentState.elements.add(currentButton.getValue());
                            CurrentState.currentItem = "";
                            CurrentState.lastAction = currentButton.getValue();
                        }
                    } else {
                        CurrentState.currentItem = CurrentState.currentItem + ((ButtonsUI) e.getSource()).getValue();
                    }
                } else {
                    if ((CurrentState.currentItem.equals("-") || CurrentState.currentItem.equals("+")) &&
                            currentButton.getValue().equals("+") || currentButton.getValue().equals("-")) {
                        CurrentState.currentItem = currentButton.getValue();
                    } else if ((currentButton.getValue().equals("+") || currentButton.getValue().equals("-"))
                            && CurrentState.currentItem.isEmpty()) {
                        CurrentState.currentItem = currentButton.getValue();
                    } else if (currentButton.getValue().equals("+") || currentButton.getValue().equals("-") ||
                            currentButton.getValue().equals("*") || currentButton.getValue().equals("/")) {
                        if (!CurrentState.currentItem.isEmpty()) {
                            CurrentState.elements.add(CurrentState.currentItem);
                            CurrentState.elements.add(currentButton.getValue());
                            CurrentState.currentItem = "";
                            CurrentState.lastAction = currentButton.getValue();
                        }
                    } else {
                        CurrentState.currentItem = CurrentState.currentItem + ((ButtonsUI) e.getSource()).getValue();
                    }
                }


                if (currentButton.getValue().equals("=")) {
                    if (!CurrentState.currentItem.isEmpty()) {
                        CurrentState.elements.add(CurrentState.currentItem);
                        CurrentState.elements.add(currentButton.getValue());
                        CurrentState.currentItem = "";
                        CurrentState.lastAction = currentButton.getValue();
                    }
                    for (int i = 0; i < CurrentState.elements.size(); i++) {
                        System.out.println(CurrentState.elements.get(i) + " ");

                    }
                }

            }

    };

        for(ButtonsUI currentButton : mainFrame.getAllButtons()) {
            currentButton.setListener(listener);
        }

//
//        ListenerClass.JustUI();

//        Calcul calcul;
//        calcul = new Add();
//        System.out.println(calcul.calcul(4,5));
//
//        ArrayList<String> listOfMemebers = new ArrayList<>();
//
//        if(listOfMemebers.get(1).equals(Calcul.ADD)) {
//            calcul = new Add();
//        } else {
//            calcul = new Minus();
//        }
//        System.out.println(calcul.calcul(Double.parseDouble(listOfMemebers.get(0)), Double.parseDouble(listOfMemebers.get(1))));
//
//




    }
}
