package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.clases.ClienteModel;
import vista.LoginCliente;
import ws.Cliente;

public class LoginControlador {

    private LoginCliente vista;
    private ClienteModel modelo;

    public LoginControlador() {
        vista = new LoginCliente();
        modelo = new ClienteModel();
        init();
    }

    public void init() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        

        vista.btnIngresar.addActionListener(l -> login(vista.txtUsuario.getText(), vista.txtPassword.getText()));
        vista.registrarse.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                registrase();
            
         }
        });
    
    }
    
    
    public void login(String user, String password) {
        Cliente cliente = modelo.login(user, password);
        if (cliente != null) {
            vista.dispose();
            TransaccionesControlador controlador = new TransaccionesControlador(cliente);
        } else {
            vista.txtNotificacion.setText("No existe ese usuario");
        }
    }

    private void registrase() {
        vista.dispose();
        RegistrarControlador registar = new RegistrarControlador();
    }

}
