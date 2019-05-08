//psvm - automatycznie generujemy main

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ReaktorGUI {
    public static void main(String[] args) {
        //window declaration
        JFrame frame = new JFrame("Reaktor Workshop GUI");

        //labels and text fields
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(20, 20, 150, 20);
        JTextField tfName = new JTextField();
        tfName.setBounds(20, 50, 150, 20);
        JLabel lblLastName = new JLabel("Last Name");
        lblLastName.setBounds(20, 80, 150, 20);
        JTextField tfLastName = new JTextField();
        tfLastName.setBounds(20, 110, 150, 20);
        JLabel lblJob = new JLabel("Job");
        lblJob.setBounds(20, 140, 150, 20);
        JTextField tfJob = new JTextField();
        tfJob.setBounds(20, 170, 150, 20);
        JLabel lblEmail = new JLabel("e-mail");
        lblEmail.setBounds(20, 200, 150, 20);
        JTextField tfEmail = new JTextField();
        tfEmail.setBounds(20, 230, 150, 20);
        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(20, 230, 150, 20);
        JLabel lblPrLan = new JLabel("What programming languages do you know?");
        lblPrLan.setBounds(320, 20, 260, 20);
        JLabel lblLan = new JLabel("How well do you know english?");
        lblLan.setBounds(320, 140, 260, 20);
        JLabel lblCourse = new JLabel("Select your course:");
        lblCourse.setBounds(320, 260, 260, 20);
        JLabel lblPrint = new JLabel();
        lblPrint.setBounds(720, 250, 170, 20);

        //gender radio buttons
        JRadioButton genderButtonM = new JRadioButton("Male");
        genderButtonM.setBounds(20, 260, 150, 20);
        genderButtonM.setSelected(true);
        JRadioButton genderButtonF = new JRadioButton("Female");
        genderButtonF.setBounds(20, 290, 150, 20);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(genderButtonM);
        genderGroup.add(genderButtonF);

        //english radio buttons
        JRadioButton eng1 = new JRadioButton("Basic");
        eng1.setBounds(320, 170, 150, 20);
        eng1.setSelected(true);
        JRadioButton eng2 = new JRadioButton("Semi-advanced");
        eng2.setBounds(320, 200, 150, 20);
        JRadioButton eng3 = new JRadioButton("Advanced");
        eng3.setBounds(320, 230, 150, 20);
        ButtonGroup engGroup = new ButtonGroup();
        engGroup.add(eng1);
        engGroup.add(eng2);
        engGroup.add(eng3);

        //buttons
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(20, 320, 100, 20);
        JButton closeButton = new JButton("Close");
        closeButton.setBounds(140, 320, 100, 20);

        //checkbox
        JCheckBox chJava = new JCheckBox("Java");
        chJava.setBounds(320, 50, 260, 20);
        JCheckBox chPython = new JCheckBox("Python");
        chPython.setBounds(320, 80, 260, 20);
        JCheckBox chOther = new JCheckBox("Other");
        chOther.setBounds(320, 110, 260, 20);

        //combo list
        JComboBox cmbCourses = new JComboBox();
        cmbCourses.setBounds(320, 290, 260, 20);
        cmbCourses.addItem("Back-end-Developer");
        cmbCourses.addItem("Front-end-Developer");
        cmbCourses.addItem("Python-Developer");
        cmbCourses.addItem("Other");

        //text area
        JTextArea printArea = new JTextArea();
        printArea.setBounds(720, 20, 300, 210);

        //buttons handling
        submitButton.addActionListener(e -> {
            //printing in text area
            String str = (chJava.isSelected() ? "\n-Java" : "") + " " +
                    (chPython.isSelected() ? "\n-Python" : "") + " " + (chOther.isSelected() ? "\n-Other" : "");

            printArea.setText(
                    "DB registration:\n" +
                            "\nName: " + tfName.getText() +
                            "\nLast Name: " + tfLastName.getText() +
                            "\nJob: " + tfJob.getText() +
                            "\nEmail: " + tfEmail.getText() +
                            "\nGender: " + (genderButtonF.isSelected() ? "female" : "male") +
                            "\nChosen programming languages: " + (chJava.isSelected() ? str : (chPython.isSelected() ? str : chOther.isSelected() ? str :
                            "\n-none")) +
                            "\nEnglish: " + (eng1.isSelected() ? "Basic" : (eng2.isSelected() ? "Semi-advanced" : "Advanced")) +
                            "\nCourse chosen: " + cmbCourses.getSelectedItem()
            );

            //printing in console
            System.out.println("Zapis do DB:");
            System.out.println("Imię: " + tfName.getText());
            System.out.println("Nazwisko: " + tfLastName.getText());
            System.out.println("Stanowisko: " + tfJob.getText());
            System.out.println("Email: " + tfEmail.getText());
            System.out.println("Płeć: " + (genderButtonF.isSelected() ? "kobieta" : "mężczyzna"));
            System.out.println("Wybrane języki programowania: " + (chJava.isSelected() ? "Java" : "") + " " +
                    (chPython.isSelected() ? "Python" : "") + " " + (chOther.isSelected() ? "Other" : ""));
            System.out.println("J. Angielski: " + (eng1.isSelected() ? "Basic" : (eng2.isSelected() ? "Semi-advanced" : "Advanced")));
            System.out.println("Wybrany kurs: " + cmbCourses.getSelectedItem());
            lblPrint.setText("Thanks for submitting!");
        });
        closeButton.addActionListener(e -> System.exit(0));

        //app window setup
        frame.setSize(1055, 450);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(3);

        frame.add(lblName);
        frame.add(lblLastName);
        frame.add(lblJob);
        frame.add(lblEmail);
        frame.add(lblGender);
        frame.add(lblPrLan);
        frame.add(lblLan);
        frame.add(lblCourse);
        frame.add(lblPrint);

        frame.add(tfName);
        frame.add(tfLastName);
        frame.add(tfJob);
        frame.add(tfEmail);

        frame.add(genderButtonM);
        frame.add(genderButtonF);
        frame.add(submitButton);
        frame.add(closeButton);
        frame.add(eng1);
        frame.add(eng2);
        frame.add(eng3);
        frame.add(chJava);
        frame.add(chPython);
        frame.add(chOther);
        frame.add(cmbCourses);
        frame.add(printArea);
    }
}