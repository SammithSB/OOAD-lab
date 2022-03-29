
public class Login {
    public static void main(String[] args) {
        LoginView view = new LoginView();
        LoginController controller = new LoginController(view);
        view.setVisible(true);
    }
}
