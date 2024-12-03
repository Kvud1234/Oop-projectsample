import java.awt.*;
import java.awt.event.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import javax.swing.*;
import java.sql.*;

public class RegistrationForm extends JFrame implements ActionListener {
    private JLabel title, name, gender, dob, res, pass, Email, Cmail, cpass, Ttitle, imail, ipass;
    private JTextField tname, tnumber, tpass, tmail, tcmail, tcpass;
    private JRadioButton male, female;
    private JComboBox<String> date, month, year;
    private JTextArea tadd, tout, resadd;
    private JCheckBox term;
    private JButton sub, subb;

    private Container c;
    private String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    private String[] months = {"Jan", "Feb", "Mar", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};

    public RegistrationForm() {
        setTitle("Registration Form");
        setBounds(250, 90, 400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Sign Up");
        title.setFont(new Font("", 1, 20));
        title.setSize(350, 33);
        title.setLocation(164, 20);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("", 1, 15));
        name.setSize(100, 20);
        name.setLocation(30, 70);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("", 1, 15));
        tname.setSize(210, 25);
        tname.setLocation(130, 70);
        c.add(tname);

        Email = new JLabel("Email");
        Email.setFont(new Font("", 1, 15));
        Email.setFont(new Font("", 1, 15));
        Email.setSize(100, 20);
        Email.setLocation(30, 110);
        c.add(Email);

        tmail = new JTextField();
        tmail.setFont(new Font("", 1, 15));
        tmail.setSize(210, 25);
        tmail.setLocation(130, 110);
        c.add(tmail);

        gender = new JLabel("Gender");
        gender.setFont(new Font("", 1, 15));
        gender.setSize(100, 20);
        gender.setLocation(30, 150);
        c.add(gender);


        male = new JRadioButton("Male");
        male.setFont(new Font("", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(130, 150);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("", Font.PLAIN, 15));
        female.setSize(80, 20);
        female.setLocation(205, 150);
        c.add(female);

        ButtonGroup gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        dob = new JLabel("Birthday");
        dob.setFont(new Font("", 1, 15));
        dob.setSize(100, 20);
        dob.setLocation(30, 190);
        c.add(dob);

        date = new JComboBox<>(dates);
        date.setFont(new Font("", Font.PLAIN, 15));
        date.setSize(50, 20);
        date.setLocation(130, 190);
        c.add(date);

        month = new JComboBox<>(months);
        month.setFont(new Font("", Font.PLAIN, 15));
        month.setSize(60, 20);
        month.setLocation(190, 190);
        c.add(month);

        year = new JComboBox<>(years);
        year.setFont(new Font("", Font.PLAIN, 15));
        year.setSize(60, 20);
        year.setLocation(260, 190);
        c.add(year);

        pass = new JLabel("Password");
        pass.setFont(new Font("", 1, 15));
        pass.setSize(100, 20);
        pass.setLocation(30, 230);
        c.add(pass);

        tpass = new JTextField();
        tpass.setFont(new Font("", Font.PLAIN, 15));
        tpass.setSize(210, 25);
        tpass.setLocation(130, 230);
        c.add(tpass);

        term = new JCheckBox("I am not a robot");
        term.setFont(new Font("", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(28, 270);
        c.add(term);

        sub = new JButton("Sign Up");
        sub.setFont(new Font("", 1, 15));
        sub.setSize(330, 30);
        sub.setLocation(30, 310);
        sub.addActionListener(this);
        c.add(sub);

        //--------- sign in page ---------

        Ttitle = new JLabel("Sign In");
        Ttitle.setFont(new Font("", 1, 20));
        Ttitle.setSize(350, 33);
        Ttitle.setLocation(164, 350);
        c.add(Ttitle);

        Cmail = new JLabel("Email");
        Cmail.setFont(new Font("", 1, 15));
        Cmail.setSize(100, 20);
        Cmail.setLocation(30, 390);
        c.add(Cmail);

        tcmail = new JTextField();
        tcmail.setFont(new Font("", Font.PLAIN, 15));
        tcmail.setSize(210, 25);
        tcmail.setLocation(130, 390);
        c.add(tcmail);

        cpass = new JLabel("Password");
        cpass.setFont(new Font("", 1, 15));
        cpass.setSize(100, 20);
        cpass.setLocation(30, 430);
        c.add(cpass);

        tcpass = new JTextField();
        tcpass.setFont(new Font("", Font.PLAIN, 15));
        tcpass.setSize(210, 25);
        tcpass.setLocation(130, 430);
        c.add(tcpass);

        subb = new JButton("Sign In");
        subb.setFont(new Font("", 1, 15));
        subb.setSize(330, 30);
        subb.setLocation(30, 480);
        subb.addActionListener(this);
        c.add(subb);

        res = new JLabel("");
        res.setFont(new Font("", Font.PLAIN, 15));
        res.setSize(500, 25);
        res.setLocation(30, 525);
        c.add(res);

        ipass = new JLabel("");
        ipass.setFont(new Font("", Font.PLAIN, 15));
        ipass.setSize(500, 25);
        ipass.setLocation(30, 525);
        c.add(ipass);

        imail = new JLabel("");
        imail.setFont(new Font("", Font.PLAIN, 15));
        imail.setSize(500, 25);
        imail.setLocation(30, 525);
        c.add(imail);


        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String name = tname.getText();
                String email = tmail.getText();
                String gender = male.isSelected() ? "Male" : "Female";
                String birthday = year.getSelectedItem() + "-" + (month.getSelectedIndex() + 1) + "-" + date.getSelectedItem();
                String password = tpass.getText();

                try {
                    String url = "jdbc:mysql://localhost:3306/logpage";
                    String username = "root";
                    String dbPassword = "71262202Abc#";

                    Connection con = DriverManager.getConnection(url, username, dbPassword);

                    String query = "INSERT INTO users (name, email, gender, birthday, password) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(query);

                    pstmt.setString(1, name);
                    pstmt.setString(2, email);
                    pstmt.setString(3, gender);
                    pstmt.setString(4, birthday);
                    pstmt.setString(5, password);

                    int rowsInserted = pstmt.executeUpdate();
                    if (rowsInserted > 0) {
                        res.setText("Registration Successful!");
                    }

                    pstmt.close();
                    con.close();

                } catch (Exception ex) {
                    res.setText("Database Error: " + ex.getMessage());
                }
            } else {
                res.setText("Please accept the Terms & Conditions.");
            }
            //----for the sign in part--------
        } else if (e.getSource() == subb) {
            String enteredEmail = tcmail.getText();
            String enteredPassword = tcpass.getText();

            try {
                String url = "jdbc:mysql://localhost:3306/logpage";
                String username = "root";
                String dbPassword = "71262202Abc#";

                Connection con = DriverManager.getConnection(url, username, dbPassword);

                String query = "SELECT * FROM users WHERE email = ? AND password = ?";
                PreparedStatement pstmt = con.prepareStatement(query);
                pstmt.setString(1, enteredEmail);
                pstmt.setString(2, enteredPassword);

                ResultSet rs = pstmt.executeQuery();

                if (rs.next()) { // If a matching record is found
                    res.setText("Sign In Successful! Welcome, " + rs.getString("name"));
                } else {
                    res.setText("Invalid Email or Password. Please try again.");
                }

                pstmt.close();
                con.close();

            } catch (Exception ex) {
                res.setText("Database Error: " + ex.getMessage());
            }
        }

    }
    public static void main(String[] args) {
        new RegistrationForm();
    }
}