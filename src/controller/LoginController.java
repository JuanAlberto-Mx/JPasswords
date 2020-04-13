package controller;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class LoginController extends Controller {

    private JTextField txtUser;
    private JPasswordField txtPassword;
    private JButton btnLogin;

    public LoginController(List components) {
        super(components);

        txtUser = (JTextField)components.get(0);
        txtPassword = (JPasswordField)components.get(1);
        btnLogin = (JButton)components.get(2);
    }

    @Override
    public void selectText(String name) {
        switch(name) {
            case "txtUser" : txtUser.setSelectionStart(0); txtUser.setSelectionEnd(txtUser.getText().length()); break;
            case "txtPassword" : txtPassword.setSelectionStart(0); txtPassword.setSelectionEnd(txtPassword.getPassword().length); break;
        }
    }

    @Override
    public void setFocus(KeyEvent evt) {
        String keySource = getKeySource(evt);
        int keyCode = evt.getKeyCode();

        if(keyCode == 10 || keyCode == 40)
            switch(keySource){
                case "txtUser": txtPassword.requestFocusInWindow(); selectText("txtPassword"); break;
                case "txtPassword": btnLogin.requestFocusInWindow(); break;
                case "btnLogin": txtUser.requestFocusInWindow(); selectText("txtUser"); break;
            }
        else if(keyCode == 38)
            switch(keySource){
                case "txtUser": btnLogin.requestFocusInWindow(); break;
                case "txtPassword": txtUser.requestFocusInWindow(); selectText("txtUser"); break;
                case "btnLogin": txtPassword.requestFocusInWindow(); selectText("txtPassword"); break;
            }
    }
}