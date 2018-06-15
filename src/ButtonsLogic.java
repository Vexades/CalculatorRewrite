import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ButtonsLogic extends JButton {
    private JButton button;


    public ButtonsLogic(JButton button){
        this.button = button;
    }

    public List<String> splitString(String operator){
        List<String> list = new LinkedList<>(Arrays.asList(operator.split("(?=[+/*-])|(?<=[+/*-])")));
        return list;
    }

    public String makeCalculus (List<String> array){
        int inmultire = 0;
        while (array.size() > 1){
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("*")){
                    int numar1 = Integer.parseInt(array.get(i-1));
                    int numar2 = Integer.parseInt(array.get(i+1));
                    inmultire = numar1 * numar2;
                    String parse = Integer.toString(inmultire);
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.remove(array.get(i-1));
                    array.add(i-1,parse);
                    i = 0;
                }

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

            }
            for (int i = 0; i < array.size(); i++) {
                if(array.get(i).contains("+")){
                    if(array.size() > 3 && array.contains("-") ){
                        if(array.get(i-2).contains("-"));
                        break;
                    }
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


        }
        String returnedNumber = Integer.toString(inmultire);
        System.out.println(inmultire);
        return returnedNumber;
    }

   public boolean isLastCharAnOperator(List<String> list, JTextField field){
        if(list.get(list.size()-1).contains("*") || list.get(list.size()-1).contains("'") || list.get(list.size()-1).contains("+") || list.get(list.size()-1).contains("-")){
            field.setText("Invalid end of input! Press <-");
            return true;
        }
        return false;
   }
   public String retrieveString(List<String> list){
        String retrieve = "";
        for(String asd: list){
            retrieve +=asd;
        }
        return retrieve;
   }
   public String splitEveryChar(List<String> ,String text){
        List<String> list = new LinkedList<>();
       for (int i = 0; i < text.length(); i++) {

       }

   }




}
