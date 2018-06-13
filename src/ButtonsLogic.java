import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ButtonsLogic extends JButton {
    private JButton button;
    private String operator;


    public ButtonsLogic(JButton button){
        this.button = button;
    }

    public List<String> splitString(String operator){
        List<String> list = new ArrayList<>();
        list = Arrays.asList(operator.split("(?=[*-/+])|(?<=[*-/+])"));
        List<String> listFinal = Lists.newArrayList(list);
        return listFinal;
    }

    public double makeCalculus (List<String> array){
        int inmultire = 0;
        while (array.size() > 1){
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("*")){
                    int numar1 = Integer.parseInt(array.get(i-1));
                    int numar2 = Integer.parseInt(array.get(i+1));
                    inmultire = numar1 * numar2;
                    String parse = Integer.toString(  inmultire);
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.add(i-1,parse);
                    i = 0;
                }
                break;
            }
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("/")){
                    int numar1 = Integer.parseInt(array.get(i-1));
                    int numar2 = Integer.parseInt(array.get(i+1));
                    inmultire = numar1 / numar2;
                    String parse = Integer.toString(  inmultire);
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.add(i-1,parse);
                    i = 0;
                }
                break;
            }
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("+")){
                    int numar1 = Integer.parseInt(array.get(i-1));
                    int numar2 = Integer.parseInt(array.get(i+1));
                    inmultire = numar1 + numar2;
                    String parse = Integer.toString(  inmultire);
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.add(i-1,parse);
                    i = 0;
                }
                break;
            }
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("-")){
                    int numar1 = Integer.parseInt(array.get(i-1));
                    int numar2 = Integer.parseInt(array.get(i+1));
                    inmultire = numar1 - numar2;
                    String parse = Integer.toString(  inmultire);
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.add(i-1,parse);
                    i = 0;
                }
            }
            break;

        }
        System.out.println(inmultire);
        return inmultire;
    }


}