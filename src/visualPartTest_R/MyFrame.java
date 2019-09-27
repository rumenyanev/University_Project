package visualPartTest_R;

import core.Manipulator;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyFrame extends JFrame implements ActionListener {

    private JLabel text1; //Текст 1 за показване
    private JTextField textField1; //Текстово поле за въвеждане на текст

    private String fontButtons = "Arial"; //Фонт за бутоните
    private int size = 15; // Размер на шрифта за бутона:

    private JButton sendInformationButton; //Бутон за записване на студента
    private String sendInformationName = "Запиши студента";// Име на бутона:

    private JButton starButton; //Бутон за записване на студента
    private String startButtonName = "Старт (бутон само за тест)";// Име на бутона:

    private JButton exitButton; //Бутон за записване на студента
    private String exitName = "Затвори";// Име на бутона:

    public MyFrame(){

        super("Студентска система 1.0");
        setBounds(250, 250, 500, 500);
        getContentPane().setBackground(Color.GREEN);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLayout(null);

        this.text1 = new JLabel();
        this.text1.setBounds(10, 10, 275, 30);
        this.text1.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        this.textField1 = new JTextField();
        this.textField1.setBounds(10, 50, 275, 30);

        this.starButton = new JButton();
        this.starButton.setBounds(60, 120, 175, 30);
        this.starButton.setText(this.startButtonName);
        this.starButton.setForeground(Color.RED);
        this.starButton.addActionListener(this);

        this.exitButton = new JButton();
        this.exitButton.setBounds(60, 90, 175, 30);
        this.exitButton.setText(this.exitName);
        this.exitButton.setFocusPainted(false);
        this.exitButton.setFont(new Font(this.fontButtons, Font.PLAIN, size));
        this.exitButton.setForeground(Color.BLUE);
        this.exitButton.addActionListener(this);

        //add(text1);
        //add(textField1);
        add(starButton);
        add(exitButton);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(exitButton)){
            System.exit(0);
        }else if (actionEvent.getSource().equals(starButton)){
            try {
                Manipulator m = new Manipulator();
                m.run();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
