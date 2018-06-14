import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListenerClass {
    public static void JustUI() {
        UI uiFrame = new UI(300, 500);
        TextUI text = new TextUI();
        uiFrame.setSizeOfPanel();

        GeneratedButtons btns = new GeneratedButtons();

        uiFrame.add(btns.button0);
        uiFrame.add(btns.button1);
        uiFrame.add(btns.button2);
        uiFrame.add(btns.button3);
        uiFrame.add(btns.button4);
        uiFrame.add(btns.button5);
        uiFrame.add(btns.button6);
        uiFrame.add(btns.button7);
        uiFrame.add(btns.button8);
        uiFrame.add(btns.button9);
        uiFrame.add(btns.bPunct);
        uiFrame.add(btns.bEgal);
        uiFrame.add(btns.bParDreapta);
        uiFrame.add(btns.bParStanga);
        uiFrame.add(btns.bImp);
        uiFrame.add(btns.bInm);
        uiFrame.add(btns.bMPlus);
        uiFrame.add(btns.bMMinus);
        uiFrame.add(btns.bMClear);
        uiFrame.add(btns.bAdd);
        uiFrame.add(btns.bSub);
        uiFrame.add(text);
        uiFrame.add(btns.back);
        uiFrame.setFrame();


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textInput = "";
                List<String> list = new ArrayList<>();

                Object obj = e.getSource();
                if (obj instanceof ButtonsUI ) {
                    ButtonsUI button = (ButtonsUI) obj;
                    ButtonsLogic logic = new ButtonsLogic(button);
                if(text.getText().isEmpty() && obj == btns.button0){
                        text.setText("");
                    }
                    text.setText(text.getText() + button.getValue());
                    textInput = text.getText();
                    list = logic.splitString(textInput);
                    if(list.get(list.size()-1).contains("*") || list.get(list.size()-1).contains("+") || list.get(list.size()-1).contains("/") || list.get(list.size()-1).contains("-")){
                        textInput = text.getText();
                        list = logic.splitString(textInput);
                        if(list.size() > 2 ){
                            if(list.get(list.size()-2).contains("*") || list.get(list.size()-2).contains("+") || list.get(list.size()-2).contains("/") || list.get(list.size()-2).contains("-")){
                                String firstSplit = textInput.substring(0,textInput.length() -2);
                                String secondSplit = textInput.substring(textInput.length()-1);
                                String apped = firstSplit+secondSplit;
                                list.remove(list.size()-2);
                                text.setText(apped);
                            }
                        }

                    }


                    System.out.println(list);
                    if(obj == btns.bEgal){
                            if(logic.isLastCharAnOperator(list, text) == true){
                                btns.button0.setEnabled(false);
                                btns.button1.setEnabled(false);
                                btns.button2.setEnabled(false);
                                btns.button3.setEnabled(false);
                                btns.button4.setEnabled(false);
                                btns.button5.setEnabled(false);
                                btns.button6.setEnabled(false);
                                btns.button7.setEnabled(false);
                                btns.button8.setEnabled(false);
                                btns.button9.setEnabled(false);
                                btns.bPunct.setEnabled(false);
                                btns.bEgal.setEnabled(false);
                                btns.bParDreapta.setEnabled(false);
                                btns.bParStanga.setEnabled(false);
                                btns.bImp.setEnabled(false);
                                btns.bInm.setEnabled(false);
                                btns.bMPlus.setEnabled(false);
                                btns.bMMinus.setEnabled(false);
                                btns.bMClear.setEnabled(false);
                                btns.bAdd.setEnabled(false);
                                btns.bSub.setEnabled(false);
                                return;
                            }
                            String calcul= logic.makeCalculus(list);
                            text.setText(calcul);
                    }
                    if(obj == btns.back){
                        String retrieve = logic.retrieveString(list);
                        text.setText(retrieve);
                    }

                }
            }
        };

        btns.button0.setListener(listener);
        btns.button1.setListener(listener);
        btns.button2.setListener(listener);
        btns.button3.setListener(listener);
        btns.button4.setListener(listener);
        btns.button5.setListener(listener);
        btns.button6.setListener(listener);
        btns.button7.setListener(listener);
        btns.button8.setListener(listener);
        btns.button9.setListener(listener);
        btns.bPunct.setListener(listener);
        btns.bEgal.setListener(listener);
        btns.bParDreapta.setListener(listener);
        btns.bParStanga.setListener(listener);
        btns.bImp.setListener(listener);
        btns.bInm.setListener(listener);
        btns.bMPlus.setListener(listener);
        btns.bMMinus.setListener(listener);
        btns.bMClear.setListener(listener);
        btns.bAdd.setListener(listener);
        btns.bSub.setListener(listener);
        btns.back.setListener(listener);
    }
    }


