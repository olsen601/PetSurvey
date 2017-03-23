package com.RyanOlsen;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by olsen on 3/22/17.
 */
public class PetSurvey extends JFrame {
    private JCheckBox dogCheckBox;
    private JCheckBox fishCheckBox;
    private JCheckBox catCheckBox;
    private JButton submitButton;
    private JLabel Results;
    private JPanel mainPanel;

    private boolean dog;
    private boolean fish;
    private boolean cat;
    String r;

    protected PetSurvey() {
        setContentPane(mainPanel);
        pack();
        setVisible(true);
        setTitle("Pet Survey Program");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
        Alternate output
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Results.setText("You submited "+ r);
            }
        }); */

    dogCheckBox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            dog = dogCheckBox.isSelected();
            updateResults();
            /*if(dog){
                r = "dog";
            }*/
        }
    });

    fishCheckBox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            fish = fishCheckBox.isSelected();
            updateResults();
            /*if(fish){
                r = "fish";
            }*/
        }

    });

    catCheckBox.addItemListener(new ItemListener() {
        @Override
        public void itemStateChanged(ItemEvent e) {
            cat = catCheckBox.isSelected();
            updateResults();
            /*if(cat){
                r = "cat";
            }*/
        }

    });
    }

    private void updateResults(){
        String hasDog = dog ? "one dog" : "no dogs";
        String hasCat = cat ? "one cat" : "no cats";
        String hasFish = fish ? "one fish" : "no fish";

        String results = "you have " + hasDog + " and " + hasCat + " and " + hasFish;
        Results.setText(results);
    }
}
