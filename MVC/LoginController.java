
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class LoginController {
    private LoginModel model;
    private LoginView view;

    public LoginController(LoginView view) {
        this.view = view;

        view.addLoginListener(new LoginListener());
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                model = view.getUser();
                System.out.println("Bye");
                if (checkUser(model)) {
                    view.showMessage("Login succesfully!");
                } else {
                    view.showMessage("Invalid username and/or password!");
                }
            } catch (Exception ex) {
                view.showMessage(ex.getStackTrace().toString());
            }
        }
    }

    public boolean checkUser(LoginModel user) throws Exception {

        String query = "Select * FROM users WHERE username ='" + user.getUserName()
                + "' AND password ='" + user.getPassword() + "'";
        System.out.println(query);
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println(e);
            System.exit(-1);
        }
        try {
            Connection connection = DriverManager.getConnection(
                    // "jdbc:postgresql://dbhost:port/dbname", "user", "dbpass");
                    "jdbc:postgresql://127.0.0.1:5433/postgres", "postgres", "S01m13i20h");

            // build query, here we get info about all databases"

            // execute query
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);

            // return query result
            while (rs.next()) {
                // display table name
                return true;
            }
            rs.close();
            statement.close();
            connection.close();
            return false;
        } catch (Exception e) {
            throw e;
        }

    }
}
