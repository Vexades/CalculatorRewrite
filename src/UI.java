import javax.swing.*;

public class UI extends JFrame{
    private int width;
    private int height;

    public UI(int width, int height){
        this.width = width;
        this.height = height;

    }

    public void setSizeOfPanel(){
        setSize(width,height);
    }

    public void setFrame(){
        setLayout(null);
        setVisible(true);
    }



}

