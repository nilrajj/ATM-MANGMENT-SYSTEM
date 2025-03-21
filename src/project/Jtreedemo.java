package project;

import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class Jtreedemo extends JFrame{

public Jtreedemo(){
Container ct = getContentPane();
ct.setLayout(new FlowLayout());
DefaultMutableTreeNode d = new DefaultMutableTreeNode("collage");
DefaultMutableTreeNode d1 = new DefaultMutableTreeNode("general science");
d.add(d1);
DefaultMutableTreeNode d2 = new DefaultMutableTreeNode("co");
d.add(d2);
DefaultMutableTreeNode d3 = new DefaultMutableTreeNode("ej");
d.add(d3);
DefaultMutableTreeNode d4 = new DefaultMutableTreeNode("sy");
d2.add(d4);
DefaultMutableTreeNode d5 = new DefaultMutableTreeNode("ty");
d2.add(d5);
DefaultMutableTreeNode d6 = new DefaultMutableTreeNode("sy");
d3.add(d6);
DefaultMutableTreeNode d7 = new DefaultMutableTreeNode("ty");
d3.add(d7);
JTree j = new JTree(d);
ct.add(new JScrollPane(j));
}

public static void main(String[]args){
	
Jtreedemo dm = new Jtreedemo();
dm.setSize(500,500);
dm.setVisible(true);
dm.setLocation(300,300);
}
}