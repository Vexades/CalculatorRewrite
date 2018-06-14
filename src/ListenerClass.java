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
                                button1.setEnabled(false);
                                button2.setEnabled(false);
                                button3.setEnabled(false);
                                button4.setEnabled(false);
                                button5.setEnabled(false);
                                button6.setEnabled(false);
                                button7.setEnabled(false);
                                button8.setEnabled(false);
                                button9.setEnabled(false);
                                bPunct.setEnabled(false);
                                bEgal.setEnabled(false);
                                bParDreapta.setEnabled(false);
                                bParStanga.setEnabled(false);
                                bImp.setEnabled(false);
                                bInm.setEnabled(false);
                                bMPlus.setEnabled(false);
                                bMMinus.setEnabled(false);
                                bMClear.setEnabled(false);
                                bAdd.setEnabled(false);
                                bSub.setEnabled(false);

                            }
                        if(obj == back){
                            text.setText(textInput);
                        }
                            double calcul= logic.makeCalculus(list);
                            text.setText(Double.toString(calcul));
                    }

                }
            }
        };

        button0.setListener(listener);
        button1.setListener(listener);
        button2.setListener(listener);
        button3.setListener(listener);
        button4.setListener(listener);
        button5.setListener(listener);
        button6.setListener(listener);
        button7.setListener(listener);
        button8.setListener(listener);
        button9.setListener(listener);
        bPunct.setListener(listener);
        bEgal.setListener(listener);
        bParDreapta.setListener(listener);
        bParStanga.setListener(listener);
        bImp.setListener(listener);
        bInm.setListener(listener);
        bMPlus.setListener(listener);
        bMMinus.setListener(listener);
        bMClear.setListener(listener);
        bAdd.setListener(listener);
        bSub.setListener(listener);
        back.setListener(listener);
    }
    }


