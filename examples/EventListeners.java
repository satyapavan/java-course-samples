import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class EventListeners extends Applet implements ActionListener{
  TextArea txtArea;
  String Add, Subtract,Multiply,Divide;
  int i = 10, j = 20, sum =0,Sub=0,Mul = 0,Div = 0;

  public void init(){
    txtArea = new TextArea(10,20);
    txtArea.setEditable(false);
    add(txtArea,"center");
    Button b = new Button("Add");
    Button c = new Button("Subtract");
    Button d = new Button("Multiply");
    Button e = new Button("Divide");
    b.addActionListener(this);
    c.addActionListener(this);
    d.addActionListener(this);
    e.addActionListener(this);

    add(b);
    add(c);
    add(d);
    add(e);
  }


  public void actionPerformed(ActionEvent e){
    sum = i + j;
    txtArea.setText("");
    txtArea.append("i = "+ i + "\t" + "j = " + j + "\n");
    Button source = (Button)e.getSource();
    if(source.getLabel() == "Add"){
    txtArea.append("Sum : " + sum + "\n");
    }

    if(i >j){
      Sub = i - j;
    }
    else{
    Sub = j - i;
    }
    if(source.getLabel() == "Subtract"){
    txtArea.append("Sub : " + Sub + "\n");
    }

    Mul = i*j;
    if(source.getLabel() == "Multiply"){
      txtArea.append("Mul = " + Mul + "\n");
    }

    if(i > j){
      Div = i / j;
    }
    else{
      Div = j / i;
    }

    if(source.getLabel() == "Divide"){
      txtArea.append("Divide = " + Div);
    }
  }
}
