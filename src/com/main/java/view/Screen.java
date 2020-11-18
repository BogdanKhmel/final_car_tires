package com.main.java.view;

import com.main.java.entity.Tire;
import com.main.java.service.TireService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class Screen {
    private JTextField displayField;

    public String getDisplayField() {
        return displayField.getText();
    }

    public void setDisplayField(String value) {
        displayField.setText (value);
    }

    public   Screen() throws SQLException {


        // 1 set panel-container
        JPanel windowContent = new JPanel();

        //2 set which layout will control dynamic size
        FlowLayout flowLayout = new FlowLayout();
        windowContent.setLayout(flowLayout);
        // 3 create controls components
        JLabel carBrand= new JLabel("Brand:");
        JTextField textField1 = new JTextField(10);
        JLabel carModel = new JLabel("Model:");
        JTextField textField2 = new JTextField(10);
        JLabel carYear = new JLabel("Year");
        JTextField textField3 = new JTextField(10);
        JButton go = new JButton("Select");

        JLabel tire= new JLabel("Tire:");
        JLabel resultTire= new JLabel();


        go.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
String brand = textField1.getText();
                String model = textField2.getText();
                int year = Integer.parseInt(textField3.getText());

                TireService tireService = new TireService();
                try {
                    List<Tire> tireList = tireService.getByCar(brand,model,year);

                        for (Tire tire : tireList)

                                resultTire.setText(String.valueOf(tire));



                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            } });


        // 4 Add controls to panel
        windowContent.add(carBrand);
        windowContent.add(textField1);
        windowContent.add(carModel);
        windowContent.add(textField2);
        windowContent.add(carYear);
        windowContent.add(textField3);
        windowContent.add(go);
        windowContent.add(tire);
        windowContent.add(resultTire);


        // 5 Create the Frame outer container
        JFrame jFrame = new JFrame("Selection of tires");

        //6 Add the panel to Frame
        jFrame.setContentPane(windowContent);


        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //7 Set size and visible
        jFrame.setSize(550,200);
        jFrame.setVisible(true);


    }
}
