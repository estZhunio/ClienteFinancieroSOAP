package model.clases;

import ws.InicioFinanciero_Service;
import ws.InicioFinanciero;

public class ClienteModel {
    private InicioFinanciero_Service service;
    private InicioFinanciero cliente;

    public ClienteModel() {
        service = new InicioFinanciero_Service();
        cliente = service.getInicioFinancieroPort(); 
    }
    
    public ws.Cliente login(String user, String password) {
        return cliente.login(user, password);
    }
    
    public Boolean registrar(ws.Cliente clienteNuevo) {
        return cliente.register(clienteNuevo);
    } 
    
    public ws.Cliente transaccionar(ws.Cliente clienteNuevo, String opcion, double valor) {
        return cliente.realizarTransaccion(opcion, clienteNuevo, valor);
    } 
    
    
}
