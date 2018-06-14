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

        ButtonsUI button0 = new ButtonsUI("0", 10, 400, 50, 50, "0");
        ButtonsUI bPunct = new ButtonsUI(".", 70, 400, 50, 50);
        ButtonsUI bEgal = new ButtonsUI("=", 130, 400, 50, 50,"");
        ButtonsUI bParDreapta = new ButtonsUI(")", 200, 400, 50, 50);
        ButtonsUI button1 = new ButtonsUI("1", 10, 330, 50, 50, "1");
        ButtonsUI button2 = new ButtonsUI("2", 70, 330, 50, 50, "2");
        ButtonsUI button3 = new ButtonsUI("3", 130, 330, 50, 50, "3");
        ButtonsUI bParStanga = new ButtonsUI("(", 200, 330, 50, 50);
        ButtonsUI button4 = new ButtonsUI("4", 10, 260, 50, 50, "4");
        ButtonsUI button5 = new ButtonsUI("5", 70, 260, 50, 50, "5");
        ButtonsUI button6 = new ButtonsUI("6", 130, 260, 50, 50, "6");
        ButtonsUI bImp = new ButtonsUI("/", 200, 260, 50, 50,"/");
        ButtonsUI button7 = new ButtonsUI("7", 10, 190, 50, 50, "7");
        ButtonsUI button8 = new ButtonsUI("8", 70, 190, 50, 50, "8");
        ButtonsUI button9 = new ButtonsUI("9", 130, 190, 50, 50, "9");
        ButtonsUI bInm = new ButtonsUI("*", 200, 190, 50, 50,"*");
        ButtonsUI bMPlus = new ButtonsUI("M+", 10, 120, 60, 60);
        ButtonsUI bMMinus = new ButtonsUI("M-", 80, 120, 60, 60);
        ButtonsUI bMClear = new ButtonsUI("MC", 150, 120, 60, 60);
        ButtonsUI bAdd = new ButtonsUI("+", 10, 60, 50, 50,"+");
        ButtonsUI bSub = new ButtonsUI("-", 70, 60, 50, 50,"-");
        ButtonsUI back = new ButtonsUI("<-", 130, 60, 50, 50,"-");

        uiFrame.add(button0);
        uiFrame.add(button1);
        uiFrame.add(button2);
        uiFrame.add(button3);
        uiFrame.add(button4);
        uiFrame.add(button5);
        uiFrame.add(button6);
        uiFrame.add(button7);
        uiFrame.add(button8);
        uiFrame.add(button9);
        uiFrame.add(bPunct);
        uiFrame.add(bEgal);
        uiFrame.add(bParDreapta);
        uiFrame.add(bParStanga);
        uiFrame.add(bImp);
        uiFrame.add(bInm);
        uiFrame.add(bMPlus);
        uiFrame.add(bMMinus);
        uiFrame.add(bMClear);
        uiFrame.add(bAdd);
        uiFrame.add(bSub);
        uiFrame.add(text);
        uiFrame.add(back);
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
                if(text.getText().isEmpty() && obj == button0){
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
                    if(obj == bEgal){
                            logic.isLastCharAnOperator(list, text);
                            if(obj == button0){

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


