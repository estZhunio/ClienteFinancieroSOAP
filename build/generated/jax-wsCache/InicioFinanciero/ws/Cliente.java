
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para cliente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="cliente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id_cli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="password_cli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="saldo_cli" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="usuario_Cli" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cliente", propOrder = {
    "idCli",
    "passwordCli",
    "saldoCli",
    "usuarioCli"
})
public class Cliente {

    @XmlElement(name = "id_cli")
    protected String idCli;
    @XmlElement(name = "password_cli")
    protected String passwordCli;
    @XmlElement(name = "saldo_cli")
    protected double saldoCli;
    @XmlElement(name = "usuario_Cli")
    protected String usuarioCli;

    /**
     * Obtiene el valor de la propiedad idCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdCli() {
        return idCli;
    }

    /**
     * Define el valor de la propiedad idCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdCli(String value) {
        this.idCli = value;
    }

    /**
     * Obtiene el valor de la propiedad passwordCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordCli() {
        return passwordCli;
    }

    /**
     * Define el valor de la propiedad passwordCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordCli(String value) {
        this.passwordCli = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoCli.
     * 
     */
    public double getSaldoCli() {
        return saldoCli;
    }

    /**
     * Define el valor de la propiedad saldoCli.
     * 
     */
    public void setSaldoCli(double value) {
        this.saldoCli = value;
    }

    /**
     * Obtiene el valor de la propiedad usuarioCli.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuarioCli() {
        return usuarioCli;
    }

    /**
     * Define el valor de la propiedad usuarioCli.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuarioCli(String value) {
        this.usuarioCli = value;
    }

}
