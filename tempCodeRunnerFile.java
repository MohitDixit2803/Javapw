if(c1.getSelectedIndex()==5 & c2.getSelectedIndex()==6)
c= a*1.73;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==0)
c= a*0.16;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==1)
c= a*11.95;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==2)
c= a*0.12;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==3)
c= a*0.14;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==4)
c= a*0.20;
if(c1.getSelectedIndex()==6 & c2.getSelectedIndex()==5)
c= a*0.58;
t2.setText(String.valueOf(c));
}
catch(Exception x)
{
System.out.println("Error");
} }
if(ae.getSource()==b2)
{
t1.setText("0000");
t2.setText("0000");
} } }