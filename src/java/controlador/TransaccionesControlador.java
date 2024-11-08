package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import model.clases.ClienteModel;
import vista.LoginCliente;
import vista.Transacciones;
import ws.Cliente;

public class TransaccionesControlador {

    private Transacciones vista;
    private ClienteModel modelo;
    private Cliente cliente;

    public TransaccionesControlador(Cliente cliente) {
        vista = new Transacciones();
        modelo = new ClienteModel();
        this.cliente = cliente;
        init();
    }

    public void init() {
        vista.setVisible(true);
        vista.setLocationRelativeTo(null);
        vista.txtSaldo.setEditable(false);
        
        vista.txtSaldo.setText(String.valueOf(cliente.getSaldoCli()));
        vista.bienvenida.setText("NOS ALEGRA VOLVER A VERLO " + cliente.getUsuarioCli());

        vista.btnProcesar.addActionListener(l -> { 
            if (validar()) {
                String opcion = vista.rdDeposito.isSelected()? "d": "r";
                transaccion(opcion);
         
            }
        });
        
        vista.salir.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                volverInicio();
            
         }
        });
    
    }
    
    
    public void login(String user, String password) {
        Cliente cliente = modelo.login(user, password);
        if (cliente != null) {
            vista.dispose();
            RegistrarControlador controlador = new RegistrarControlador();
        } else {
            vista.txtNotificacion.setText("No existe ese usuario");
        }
    }

    private void volverInicio() {
        vista.dispose();
        LoginControlador login = new LoginControlador();
    }
    
    private void transaccion(String opcion) {
        
        Cliente modificacion = modelo.transaccionar(cliente, opcion, Double.parseDouble(vista.txtValor.getText()));
        if (modificacion != null) {
            this.cliente = modificacion;
            vista.txtSaldo.setText(String.valueOf(cliente.getSaldoCli()));
        } else {
            JOptionPane.showMessageDialog(null, "NO SE PUDO REALIZAR TU TRANSFERENCIA");
        }
        
        vista.txtValor.setText("");
        
    }
    
    private Boolean validar() {
        if ((!vista.rdDeposito.isSelected() && !vista.rdRetiro.isSelected()) && vista.txtValor.getText().isEmpty() ) {
            // System.out.println("RDDEPOSITO -> " + vista.rdDeposito.isSelected());
            // System.out.println("RDDETIRO -> " + vista.rdRetiro.isSelected());
            vista.txtNotificacion.setText("Por favor, selecciona una opción.");
            return false;
        }
        System.out.println("RDDEPOSITO -> " + vista.rdDeposito.isSelected());
        System.out.println("RDDETIRO -> " + vista.rdRetiro.isSelected());
        if (vista.rdRetiro.isSelected()) {
            
            if(Double.parseDouble(vista.txtValor.getText()) > Double.parseDouble(vista.txtSaldo.getText())) {
                vista.txtNotificacion.setText("EL RETIRO SUPERA EL SALDO ACTUAL.");
                return false;
            }
        }
        return true;
    }

}
