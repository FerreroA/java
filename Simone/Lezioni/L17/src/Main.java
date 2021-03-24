import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setMinimumSize(new Dimension(275, 200));

        //Panels setup
        JPanel basePanel = new JPanel();
        basePanel.setLayout(new BorderLayout());
        frame.setContentPane(basePanel);


        JMenuBar menuBar = new JMenuBar();
        basePanel.add(menuBar, BorderLayout.NORTH);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenu modifyMenu = new JMenu("Modify");
        menuBar.add(modifyMenu);


        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 2));
        basePanel.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BoxLayout(bottomPanel, BoxLayout.X_AXIS));
        basePanel.add(bottomPanel, BorderLayout.SOUTH);

        JPanel bottomLeftPanel = new JPanel();
        bottomLeftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.add(bottomLeftPanel);

        JPanel bottomRightPanel = new JPanel();
        bottomRightPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        bottomPanel.add(bottomRightPanel);


        // Adding Items to panels


        JMenuItem newFileMenuItem = new JMenuItem("New");
        JMenuItem settingsFileMenuItem = new JMenuItem("Settings");
        JMenuItem exitFileMenuItem = new JMenuItem("Exit");
        fileMenu.add(newFileMenuItem);
        fileMenu.add(settingsFileMenuItem);
        fileMenu.add(exitFileMenuItem);

        fileMenu.addSeparator();


        ButtonGroup radioGroup = new ButtonGroup();

        JRadioButtonMenuItem rb1FileMenuItem = new JRadioButtonMenuItem("Option 1", true);
        radioGroup.add(rb1FileMenuItem);
        fileMenu.add(rb1FileMenuItem);

        JRadioButtonMenuItem rb2FileMenuItem = new JRadioButtonMenuItem("Option 2");
        radioGroup.add(rb2FileMenuItem);
        fileMenu.add(rb2FileMenuItem);

        fileMenu.addSeparator();
        JMenu fileSubmenu = new JMenu("SubMenu");
        fileMenu.add(fileSubmenu);

        JMenuItem fileSubmenuItem1 = new JMenuItem("SubMenu Item 1");
        fileSubmenu.add(fileSubmenuItem1);

        JMenuItem fileSubmenuItem2 = new JMenuItem("SubMenu Item 2");
        fileSubmenu.add(fileSubmenuItem2);

        JMenuItem cropModifyMenuItem = new JMenuItem("Crop");
        JMenuItem selectionModifyMenuItem = new JMenuItem("Selection");
        modifyMenu.add(cropModifyMenuItem);
        modifyMenu.add(selectionModifyMenuItem);


        JButton buttonA = new JButton("A");
        JButton buttonB = new JButton("B");
        JButton buttonC = new JButton("C");
        JButton buttonD = new JButton("D");
        centerPanel.add(buttonA);
        centerPanel.add(buttonB);
        centerPanel.add(buttonC);
        centerPanel.add(buttonD);


        JLabel actionLabel = new JLabel("Modifica in corso...");
        bottomLeftPanel.add(actionLabel);

        JButton exitButton = new JButton("Exit");
        bottomRightPanel.add(exitButton);

        frame.setVisible(true);
    }
}