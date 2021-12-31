package com.ProjectIB;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDijkstra extends JFrame  {
    private JPanel mainPanel;
    private JTextField txtEnd;
    private JLabel lblEnd;
    private JLabel lblTitle;
    private JButton btnEnter;
    private JLabel lblDistance;

    public GUIDijkstra(){
        setContentPane(mainPanel);
        setTitle("Dijkstra Algorithm");
        this.setSize(450,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setVisible(true);
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n=5;
                double min=0;
                int endNode=Integer.parseInt(txtEnd.getText());
                Main solver =  new Main(n);
                solver.addEdge(0, 1, 4);
                solver.addEdge(0, 2, 1);
                solver.addEdge(1, 3, 1);
                solver.addEdge(2, 1, 2);
                solver.addEdge(2, 3, 5);
                solver.addEdge(3, 4, 3);
                min=solver.dijkstra(0, endNode);
                System.out.println("Pasos del camino mas corto dentro de nuestro sistema: "+min);
                lblDistance.setText(Double.toString(min));
            }
        });
    }
    public static void main(String[] args){
        GUIDijkstra myFrame = new GUIDijkstra();
    }
}
