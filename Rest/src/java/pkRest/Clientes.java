package pkRest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByCedula", query = "SELECT c FROM Clientes c WHERE c.cedula = :cedula")
    , @NamedQuery(name = "Clientes.findByLugarExpedicion", query = "SELECT c FROM Clientes c WHERE c.lugarExpedicion = :lugarExpedicion")
    , @NamedQuery(name = "Clientes.findByNombreCompleto", query = "SELECT c FROM Clientes c WHERE c.nombreCompleto = :nombreCompleto")
    , @NamedQuery(name = "Clientes.findByProfesion", query = "SELECT c FROM Clientes c WHERE c.profesion = :profesion")
    , @NamedQuery(name = "Clientes.findByDireccionResidencial", query = "SELECT c FROM Clientes c WHERE c.direccionResidencial = :direccionResidencial")
    , @NamedQuery(name = "Clientes.findByCiudad", query = "SELECT c FROM Clientes c WHERE c.ciudad = :ciudad")
    , @NamedQuery(name = "Clientes.findByDepartamento", query = "SELECT c FROM Clientes c WHERE c.departamento = :departamento")
    , @NamedQuery(name = "Clientes.findByEmail", query = "SELECT c FROM Clientes c WHERE c.email = :email")
    , @NamedQuery(name = "Clientes.findByTelResidencia", query = "SELECT c FROM Clientes c WHERE c.telResidencia = :telResidencia")
    , @NamedQuery(name = "Clientes.findByTelTrabajo", query = "SELECT c FROM Clientes c WHERE c.telTrabajo = :telTrabajo")
    , @NamedQuery(name = "Clientes.findByNumFactura", query = "SELECT c FROM Clientes c WHERE c.numFactura = :numFactura")
    , @NamedQuery(name = "Clientes.findByFechaCredito", query = "SELECT c FROM Clientes c WHERE c.fechaCredito = :fechaCredito")
    , @NamedQuery(name = "Clientes.findByTipoCartera", query = "SELECT c FROM Clientes c WHERE c.tipoCartera = :tipoCartera")
    , @NamedQuery(name = "Clientes.findByValorCredito", query = "SELECT c FROM Clientes c WHERE c.valorCredito = :valorCredito")
    , @NamedQuery(name = "Clientes.findByNumCuotas", query = "SELECT c FROM Clientes c WHERE c.numCuotas = :numCuotas")})
public class Clientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "CEDULA")
    private Integer cedula;
    @Size(max = 50)
    @Column(name = "LUGAR_EXPEDICION")
    private String lugarExpedicion;
    @Size(max = 100)
    @Column(name = "NOMBRE_COMPLETO")
    private String nombreCompleto;
    @Size(max = 50)
    @Column(name = "PROFESION")
    private String profesion;
    @Size(max = 100)
    @Column(name = "DIRECCION_RESIDENCIAL")
    private String direccionResidencial;
    @Size(max = 50)
    @Column(name = "CIUDAD")
    private String ciudad;
    @Size(max = 50)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TEL_RESIDENCIA")
    private Integer telResidencia;
    @Column(name = "TEL_TRABAJO")
    private Integer telTrabajo;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_FACTURA")
    private Integer numFactura;
    @Column(name = "FECHA_CREDITO")
    @Temporal(TemporalType.DATE)
    private Date fechaCredito;
    @Size(max = 50)
    @Column(name = "TIPO_CARTERA")
    private String tipoCartera;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR_CREDITO")
    private Double valorCredito;
    @Column(name = "NUM_CUOTAS")
    private Integer numCuotas;

    public Clientes() {
    }

    public Clientes(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public void setLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getDireccionResidencial() {
        return direccionResidencial;
    }

    public void setDireccionResidencial(String direccionResidencial) {
        this.direccionResidencial = direccionResidencial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(Integer telResidencia) {
        this.telResidencia = telResidencia;
    }

    public Integer getTelTrabajo() {
        return telTrabajo;
    }

    public void setTelTrabajo(Integer telTrabajo) {
        this.telTrabajo = telTrabajo;
    }

    public Integer getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(Integer numFactura) {
        this.numFactura = numFactura;
    }

    public Date getFechaCredito() {
        return fechaCredito;
    }

    public void setFechaCredito(Date fechaCredito) {
        this.fechaCredito = fechaCredito;
    }

    public String getTipoCartera() {
        return tipoCartera;
    }

    public void setTipoCartera(String tipoCartera) {
        this.tipoCartera = tipoCartera;
    }

    public Double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(Double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public Integer getNumCuotas() {
        return numCuotas;
    }

    public void setNumCuotas(Integer numCuotas) {
        this.numCuotas = numCuotas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numFactura != null ? numFactura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.numFactura == null && other.numFactura != null) || (this.numFactura != null && !this.numFactura.equals(other.numFactura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkRest.Clientes[ numFactura=" + numFactura + " ]";
    }

}
