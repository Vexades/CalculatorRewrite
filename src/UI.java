import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class UI extends JFrame{
    private int width;
    private int height;
    private ArrayList<ButtonsUI> listOfButtons;

    UI(int width, int height){
        this.width = width;
        this.height = height;


    }

    void setSizeOfPanel(){
        setSize(width,height);
    }

    void setFrame(){
        setLayout(null);
        setVisible(true);
    }

    @Override
    public Component add(Component comp) {
        return super.add(comp);
    }

    public void setButtons() {
        ButtonsUI button0 = new ButtonsUI("0", 10, 400, 50, 50, "0");
        ButtonsUI bPunct = new ButtonsUI(".", 70, 400, 50, 50);
        ButtonsUI bEgal = new ButtonsUI("=", 130, 400, 50, 50,"=");
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


        listOfButtons = new ArrayList<>();
        listOfButtons.add(button0);
        listOfButtons.add(button1);
        listOfButtons.add(button2);
        listOfButtons.add(button3);
        listOfButtons.add(button4);
        listOfButtons.add(button5);
        listOfButtons.add(button6);
        listOfButtons.add(button7);
        listOfButtons.add(button8);
        listOfButtons.add(button9);
        listOfButtons.add(bPunct);
        listOfButtons.add(bEgal);
        listOfButtons.add(bParDreapta);
        listOfButtons.add(bParStanga);
        listOfButtons.add(bAdd);
        listOfButtons.add(bImp);
        listOfButtons.add(bInm);
        listOfButtons.add(bSub);
    }

    public ArrayList<ButtonsUI> getAllButtons() {
        return listOfButtons;
    }

}

