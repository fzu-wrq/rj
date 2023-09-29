import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JTextField;

import javax.swing.JButton;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import javax.swing.Action;

public class jcalculator extends JFrame {
    private JPanel contentPane;

    private JTextField textField;

    private JTextField textField_1;

    private final Action action = new SwingAction();

    private double sum=0;

    private boolean b=false;

    String opo="None";

    String pro="Digit";



    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jcalculator frame = new jcalculator();

                    frame.setVisible(true);

                } catch (Exception e) {
                    e.printStackTrace();

                }

            }

        });

    }



    public void JudgeDigit(int i){
        if (b == true) {
            textField.setText("");

            textField.setText(String.valueOf(i));

            b = false;

        }

        else {
            textField.setText(textField.getText() + String.valueOf(i));

        }

        pro="Digit";

    }

    public void JudgeOperator(String s){
        b=true;

        String opn=s;

        if(pro.equals("Digit")){
            switch(opo){
                case "+":sum += Double.parseDouble(textField.getText());opo=opn;break;

                case "-":sum -= Double.parseDouble(textField.getText());opo=opn;break;

                case "*":sum *= Double.parseDouble(textField.getText());opo=opn;break;

                case "/":sum /= Double.parseDouble(textField.getText());opo=opn;break;

                case "None":sum=Double.parseDouble(textField.getText());opo=opn;break;

            }

            textField_1.setText(textField_1.getText()+textField.getText() + s);

            textField.setText(String.valueOf(sum));

            pro="Operator";

        }

        if(opo.equals("=")){
            textField_1.setText("");

            textField.setText(String.valueOf(sum));

        }

    }

    public jcalculator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("wu的计算器");

        setBackground(Color.YELLOW);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setBounds(100, 100, 323, 345);

        contentPane = new JPanel();

        contentPane.setBackground(Color.WHITE);

        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);

        contentPane.setLayout(null);

        textField = new JTextField();

        textField.setBounds(10, 10, 289, 21);

        contentPane.add(textField);

        textField.setColumns(10);

        textField_1 = new JTextField();

        textField_1.setBounds(10, 41, 289, 21);

        contentPane.add(textField_1);

        textField_1.setColumns(10);

        JButton btnNewButton = new JButton("1");

        btnNewButton.setForeground(Color.RED);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(1);

            }

        });

        btnNewButton.setBounds(10, 72, 50, 50);

        contentPane.add(btnNewButton);

        JButton button = new JButton("2");

        button.setForeground(Color.RED);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(2);

            }

        });

        button.setBounds(70, 72, 50, 50);

        contentPane.add(button);

        JButton button_1 = new JButton("3");

        button_1.setForeground(Color.RED);

        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(3);

            }

        });

        button_1.setBounds(130, 72, 50, 50);

        contentPane.add(button_1);

        JButton button_2 = new JButton("+");

        button_2.setForeground(Color.RED);

        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeOperator("+");

            }

        });

        button_2.setBounds(190, 72, 50, 50);

        contentPane.add(button_2);

        JButton button_3 = new JButton("-");

        button_3.setForeground(Color.RED);

        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeOperator("-");

            }

        });

        button_3.setBounds(250, 72, 50, 50);

        contentPane.add(button_3);

        JButton button_4 = new JButton("4");

        button_4.setForeground(Color.RED);

        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(4);

            }

        });

        button_4.setBounds(10, 132, 50, 50);

        contentPane.add(button_4);

        JButton button_5 = new JButton("5");

        button_5.setForeground(Color.RED);

        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(5);

            }

        });

        button_5.setBounds(70, 132, 50, 50);

        contentPane.add(button_5);

        JButton button_6 = new JButton("6");

        button_6.setForeground(Color.RED);

        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(6);

            }

        });

        button_6.setBounds(130, 132, 50, 50);

        contentPane.add(button_6);

        JButton button_7 = new JButton("*");

        button_7.setForeground(Color.RED);

        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeOperator("*");

            }

        });

        button_7.setBounds(190, 132, 50, 50);

        contentPane.add(button_7);

        JButton button_8 = new JButton("/");

        button_8.setForeground(Color.RED);

        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeOperator("/");

            }

        });

        button_8.setBounds(249, 132, 50, 50);

        contentPane.add(button_8);

        JButton button_9 = new JButton("7");

        button_9.setForeground(Color.RED);

        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(7);

            }

        });

        button_9.setBounds(10, 192, 50, 50);

        contentPane.add(button_9);

        JButton button_10 = new JButton("8");

        button_10.setForeground(Color.RED);

        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(8);

            }

        });

        button_10.setBounds(72, 192, 50, 50);

        contentPane.add(button_10);

        JButton button_11 = new JButton("9");

        button_11.setForeground(Color.RED);

        button_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(9);

            }

        });

        button_11.setBounds(132, 192, 50, 50);

        contentPane.add(button_11);

        JButton btnC = new JButton("c");

        btnC.setForeground(Color.RED);

        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");

                textField_1.setText("");

                sum=0;

                b=false;

                opo="None";

            }

        });

        btnC.setBounds(249, 192, 50, 50);

        contentPane.add(btnC);

        JButton btnEsc = new JButton("=");

        btnEsc.setForeground(Color.RED);

        btnEsc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeOperator("=");

            }

        });

        btnEsc.setBounds(190, 192, 50, 50);

        contentPane.add(btnEsc);

        JButton button_12 = new JButton("0");

        button_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JudgeDigit(0);

            }

        });

        button_12.setForeground(Color.RED);

        button_12.setBounds(10, 252, 50, 50);

        contentPane.add(button_12);

        JButton button_13 = new JButton("\u221A");

        button_13.setForeground(Color.RED);

        button_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double D=Math.sqrt(Double.parseDouble(textField.getText()));

                textField.setText(String.valueOf(D));

            }

        });

        button_13.setBounds(72, 252, 50, 50);

        contentPane.add(button_13);

        JButton button_14 = new JButton(".");

        button_14.setForeground(Color.RED);

        button_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + ".");

            }

        });

        button_14.setBounds(132, 252, 50, 50);

        contentPane.add(button_14);

        JButton btnE_1 = new JButton("x2");

        btnE_1.setForeground(Color.RED);

        btnE_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Double D=Math.pow(Double.parseDouble(textField.getText()),2);

                textField.setText(String.valueOf(D));

            }

        });

        btnE_1.setBounds(190, 252, 50, 50);

        contentPane.add(btnE_1);

        JButton btnE = new JButton("E");

        btnE.setForeground(Color.RED);

        btnE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);

            }

        });

        btnE.setBounds(250, 252, 50, 50);

        contentPane.add(btnE);

    }

    private class SwingAction extends AbstractAction {
        public SwingAction() {
            putValue(NAME, "SwingAction");

            putValue(SHORT_DESCRIPTION, "Some short description");

        }

        public void actionPerformed(ActionEvent e) {
        }

    }

}
