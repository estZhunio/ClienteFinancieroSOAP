package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import model.clases.ClienteModel;
import vista.LoginCliente;
import vista.RegistrarCliente;
import ws.Cliente;

public class RegistrarControlador {
    private RegistrarCliente vista;
    private ClienteModel modelo;
    
    public RegistrarControlador() {
        vista = new RegistrarCliente();
        modelo = new ClienteModel();
        init();
    }
    
    public void init() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        
        vista.btnRegistrar.addActionListener(l -> { 
            Cliente cliente = new Cliente();
            cliente.setUsuarioCli(vista.txtUsuario.getText());
            cliente.setPasswordCli(vista.txtPassword.getText());
            cliente.setSaldoCli(Double.parseDouble(vista.txtValor.getText()));
            registrar(cliente);
        });
        
        vista.btnLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login();
            
         }
        });
    }
    
    public void registrar(Cliente clienteNuevo) {
        if (modelo.registrar(clienteNuevo)) {
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
            vista.txtUsuario.setText("");
            vista.txtPassword.setText("");
            vista.txtPassword1.setText("");
            vista.txtValor.setText("");
        } else {
            JOptionPane.showMessageDialog(null, "No se ha podido guardar");
            
        }
    }
    
    
    
    public void login() {
        vista.dispose();
        LoginControlador controlador = new LoginControlador();
        
    }
    
}
