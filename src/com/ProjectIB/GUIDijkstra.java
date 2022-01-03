package com.ProjectIB;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.ArrayList;
import java.util.List;

public class GUIDijkstra extends JFrame  {
    private JPanel mainPanel;
    private JTextField txtEnd;
    private JLabel lblEnd;
    private JLabel lblTitle;
    private JButton btnEnter;
    private JLabel lblDistance;
    private JRadioButton rbt0;
    private JRadioButton rbt1;
    private JRadioButton rbt2;
    private JRadioButton rbt3;
    private JRadioButton rbt4;
    private JRadioButton rbt5;
    private JRadioButton rbt6;
    private JRadioButton rbt8;
    private JRadioButton rbt7;
    private JRadioButton rbt9;
    private JLabel lblArrow1;
    private JLabel lblArrow2;
    private JLabel lblArrow4;
    private JLabel lblArrow3;
    private JLabel lblArrow5;

    JLabel displayField;
    ImageIcon image;

    public GUIDijkstra(){
        setContentPane(mainPanel);
        setTitle("Dijkstra Algorithm");
        setSize(650,450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        try{
            image = new ImageIcon("/Users/alextintin/Downloads/quito.jpg");
            displayField = new JLabel(image);
            this.add(displayField);
        }catch (Exception c){
            System.out.println("No hay imagen");
        }
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);

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

                List<Integer> path = new ArrayList<>();
                path=solver.dijkstraList(0,4);
                for (int i = 0; i < path.size(); i++) {
                    System.out.println(path.get(i));
                }
                for (int i = 0; i <5; i++) {
                    switch (path.get(i)){
                        case 0:
                            rbt0.setSelected(true);
                            break;
                        case 1:
                            rbt1.setSelected(true);
                            break;
                        case 2:
                            rbt2.setSelected(true);
                            break;
                        case 3:
                            rbt3.setSelected(true);
                            break;
                        case 4:
                            rbt4.setSelected(true);
                            break;
                        case 5:
                            rbt5.setSelected(true);
                            break;
                        case 6:
                            rbt6.setSelected(true);
                            break;
                        case 7:
                            rbt7.setSelected(true);
                            break;
                        case 8:
                            rbt8.setSelected(true);
                            break;
                        case 9:
                            rbt9.setSelected(true);
                            break;
                        default: break;
                    }

                }
            }
        });
    }
    public static void main(String[] args){
        GUIDijkstra myFrame = new GUIDijkstra();
        Image i = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };
    }
}
