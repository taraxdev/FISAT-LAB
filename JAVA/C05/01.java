import java.awt.*;
import java.awt.event.*;
class Fr extends Frame implements ActionListener
{
Label L1,L2,L3,L4;
Button b1;
Button b2;
TextField t1,t2,t3,t4;
Fr()
{
L1=new Label("First Number");
L2=new Label("Second Number");
L3=new Label("Third Number");
L4=new Label("Biggest Number");
b1=new Button("Check");
b2=new Button("Exit");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
t4=new TextField(20);
setBackground(Color.cyan);
t1.setBackground(Color.blue);
setLayout(new FlowLayout());
setBounds(30,100,80,30);

add(L1);
add(t1);
add(L2);
add(t2);
add(L3);
add(t3);
add(L4);
add(t4);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
setTitle("My first window");
setSize(300,350);
}
public void actionPerformed(ActionEvent ae)
{
int n1,n2,n3;
n1=Integer.parseInt(t1.getText());
n2=Integer.parseInt(t2.getText());
n3=Integer.parseInt(t3.getText());
if(n1>n2 && n1>n3){
t4.setText("The biggest number is "+n1);
}
if(ae.getSource()==b2)
{
System.exit(0);
}
}


} 
class Mpr
{
public static void main(String[] args)
{
Fr obj=new Fr();
obj.show();

}
}
