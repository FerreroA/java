package mv.view;

import mv.StudentListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentView extends JFrame implements StudentListener {

    private StudentListener studentListener;

    private JLabel yearLabel;
    private JLabel letterLabel;
    private JLabel fullnameLabel;

    public StudentView(StudentListener studentListener) {
        super("Student View");

        this.studentListener = studentListener;


        // Create graphic interface
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(500, 500));

        JPanel basePane = new JPanel(new BorderLayout());
        setContentPane(basePane);


        // Create grid
        JPanel topPane = new JPanel();
        basePane.add(topPane, BorderLayout.NORTH);

        JPanel centerPane = new JPanel();
        centerPane.setLayout(new BoxLayout(centerPane, BoxLayout.Y_AXIS));
        basePane.add(centerPane, BorderLayout.CENTER);

        JPanel topCenterPane = new JPanel();
        //topCenterPane.setLayout(new BoxLayout(topCenterPane, BoxLayout.Y_AXIS));
        centerPane.add(topCenterPane);

        JPanel bottomCenterPane = new JPanel();
        bottomCenterPane.setLayout(new FlowLayout());
        centerPane.add(bottomCenterPane);

        JPanel dialogPane = new JPanel();



        // Create content
        dialogPane.add(new JLabel("Year:"));
        yearLabel = new JLabel();
        topPane.add(yearLabel);

        dialogPane.add(new JLabel("Class:"));
        letterLabel = new JLabel();
        topPane.add(letterLabel);

        dialogPane.add(new Label("Year"));
        yearText = new JTextField(5);
        dialogPane.add(yearText);

        topPane.add(new Label("Class"));
        letterText = new JTextField(5);
        topPane.add(letterText);

        JButton updateButton = new JButton("Update");
        topPane.add(updateButton);

        topCenterPane.add(new JLabel("Full name:"));

        fullnameLabel = new JLabel();
        topCenterPane.add(fullnameLabel);

        fullNameText = new JTextField(10);
        bottomCenterPane.add(fullNameText);

        JButton fullNameButton = new JButton("Update");
        bottomCenterPane.add(fullNameButton);



        // register updateButton action
        updateButton.addActionListener(e -> {
            studentListener.onUpdateYear(Integer.parseInt(yearText.getText()));
            if (!letterText.getText().isEmpty())
                studentListener.onUpdateLetter(letterText.getText().charAt(0));
        });


        //register fullNameButton action
        fullNameButton.addActionListener(e -> studentListener.onUpdateFullName(fullNameText.getText()));





        setVisible(true);

        JOptionPane.showMessageDialog(null, dialogPane,"Set student data", JOptionPane.PLAIN_MESSAGE);
    }


    @Override
    public void onUpdateYear(int age) {
        yearLabel.setText(Integer.toString(age));
    }

    @Override
    public void onUpdateLetter(char letter) {
        letterLabel.setText(Character.toString(letter));
    }

    @Override
    public void onUpdateGrades(ArrayList<Integer> grades) {}

    @Override
    public void onUpdateFullName(String fullName) { fullnameLabel.setText(fullName); }
}
