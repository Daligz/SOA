package pkgrest;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "seguimiento_clientes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SeguimientoClientes.findAll", query = "SELECT s FROM SeguimientoClientes s")
    , @NamedQuery(name = "SeguimientoClientes.findById", query = "SELECT s FROM SeguimientoClientes s WHERE s.id = :id")
    , @NamedQuery(name = "SeguimientoClientes.findByCedula", query = "SELECT s FROM SeguimientoClientes s WHERE s.cedula = :cedula")
    , @NamedQuery(name = "SeguimientoClientes.findByLugarExpedicion", query = "SELECT s FROM SeguimientoClientes s WHERE s.lugarExpedicion = :lugarExpedicion")
    , @NamedQuery(name = "SeguimientoClientes.findByNombreCompleto", query = "SELECT s FROM SeguimientoClientes s WHERE s.nombreCompleto = :nombreCompleto")
    , @NamedQuery(name = "SeguimientoClientes.findByProfesion", query = "SELECT s FROM SeguimientoClientes s WHERE s.profesion = :profesion")
    , @NamedQuery(name = "SeguimientoClientes.findByDireccionResidencial", query = "SELECT s FROM SeguimientoClientes s WHERE s.direccionResidencial = :direccionResidencial")
    , @NamedQuery(name = "SeguimientoClientes.findByCiudad", query = "SELECT s FROM SeguimientoClientes s WHERE s.ciudad = :ciudad")
    , @NamedQuery(name = "SeguimientoClientes.findByDepartamento", query = "SELECT s FROM SeguimientoClientes s WHERE s.departamento = :departamento")
    , @NamedQuery(name = "SeguimientoClientes.findByEmail", query = "SELECT s FROM SeguimientoClientes s WHERE s.email = :email")
    , @NamedQuery(name = "SeguimientoClientes.findByTelResidencia", query = "SELECT s FROM SeguimientoClientes s WHERE s.telResidencia = :telResidencia")
    , @NamedQuery(name = "SeguimientoClientes.findByTelTrabajo", query = "SELECT s FROM SeguimientoClientes s WHERE s.telTrabajo = :telTrabajo")
    , @NamedQuery(name = "SeguimientoClientes.findByNumFactura", query = "SELECT s FROM SeguimientoClientes s WHERE s.numFactura = :numFactura")
    , @NamedQuery(name = "SeguimientoClientes.findByTipoCartera", query = "SELECT s FROM SeguimientoClientes s WHERE s.tipoCartera = :tipoCartera")
    , @NamedQuery(name = "SeguimientoClientes.findByFechaMora", query = "SELECT s FROM SeguimientoClientes s WHERE s.fechaMora = :fechaMora")
    , @NamedQuery(name = "SeguimientoClientes.findByDiasMora", query = "SELECT s FROM SeguimientoClientes s WHERE s.diasMora = :diasMora")
    , @NamedQuery(name = "SeguimientoClientes.findByValMora", query = "SELECT s FROM SeguimientoClientes s WHERE s.valMora = :valMora")
    , @NamedQuery(name = "SeguimientoClientes.findByVSeguro", query = "SELECT s FROM SeguimientoClientes s WHERE s.vSeguro = :vSeguro")
    , @NamedQuery(name = "SeguimientoClientes.findByInteresMora", query = "SELECT s FROM SeguimientoClientes s WHERE s.interesMora = :interesMora")
    , @NamedQuery(name = "SeguimientoClientes.findBySaldRestante", query = "SELECT s FROM SeguimientoClientes s WHERE s.saldRestante = :saldRestante")
    , @NamedQuery(name = "SeguimientoClientes.findByTipoCobro", query = "SELECT s FROM SeguimientoClientes s WHERE s.tipoCobro = :tipoCobro")
    , @NamedQuery(name = "SeguimientoClientes.findByFechaAcuerdoUno", query = "SELECT s FROM SeguimientoClientes s WHERE s.fechaAcuerdoUno = :fechaAcuerdoUno")
    , @NamedQuery(name = "SeguimientoClientes.findByAcuerdoUno", query = "SELECT s FROM SeguimientoClientes s WHERE s.acuerdoUno = :acuerdoUno")
    , @NamedQuery(name = "SeguimientoClientes.findByFechaAcuerdoDos", query = "SELECT s FROM SeguimientoClientes s WHERE s.fechaAcuerdoDos = :fechaAcuerdoDos")
    , @NamedQuery(name = "SeguimientoClientes.findByAcuerdoDos", query = "SELECT s FROM SeguimientoClientes s WHERE s.acuerdoDos = :acuerdoDos")
    , @NamedQuery(name = "SeguimientoClientes.findByFechaAcuerdoTres", query = "SELECT s FROM SeguimientoClientes s WHERE s.fechaAcuerdoTres = :fechaAcuerdoTres")
    , @NamedQuery(name = "SeguimientoClientes.findByAcuerdoTres", query = "SELECT s FROM SeguimientoClientes s WHERE s.acuerdoTres = :acuerdoTres")
    , @NamedQuery(name = "SeguimientoClientes.findByFechaAcuerdoCuatro", query = "SELECT s FROM SeguimientoClientes s WHERE s.fechaAcuerdoCuatro = :fechaAcuerdoCuatro")
    , @NamedQuery(name = "SeguimientoClientes.findByAcuerdoCuatro", query = "SELECT s FROM SeguimientoClientes s WHERE s.acuerdoCuatro = :acuerdoCuatro")})
public class SeguimientoClientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
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
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUM_FACTURA")
    private int numFactura;
    @Size(max = 50)
    @Column(name = "TIPO_CARTERA")
    private String tipoCartera;
    @Column(name = "FECHA_MORA")
    @Temporal(TemporalType.DATE)
    private Date fechaMora;
    @Column(name = "DIAS_MORA")
    private Integer diasMora;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VAL_MORA")
    private Double valMora;
    @Column(name = "V_SEGURO")
    private Double vSeguro;
    @Column(name = "INTERES_MORA")
    private Double interesMora;
    @Column(name = "SALD_RESTANTE")
    private Double saldRestante;
    @Size(max = 50)
    @Column(name = "TIPO_COBRO")
    private String tipoCobro;
    @Column(name = "FECHA_ACUERDO_UNO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcuerdoUno;
    @Size(max = 255)
    @Column(name = "ACUERDO_UNO")
    private String acuerdoUno;
    @Column(name = "FECHA_ACUERDO_DOS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcuerdoDos;
    @Size(max = 255)
    @Column(name = "ACUERDO_DOS")
    private String acuerdoDos;
    @Column(name = "FECHA_ACUERDO_TRES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcuerdoTres;
    @Size(max = 255)
    @Column(name = "ACUERDO_TRES")
    private String acuerdoTres;
    @Column(name = "FECHA_ACUERDO_CUATRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAcuerdoCuatro;
    @Size(max = 255)
    @Column(name = "ACUERDO_CUATRO")
    private String acuerdoCuatro;

    public SeguimientoClientes() {
    }

    public SeguimientoClientes(Integer id) {
        this.id = id;
    }

    public SeguimientoClientes(Integer id, int numFactura) {
        this.id = id;
        this.numFactura = numFactura;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getTipoCartera() {
        return tipoCartera;
    }

    public void setTipoCartera(String tipoCartera) {
        this.tipoCartera = tipoCartera;
    }

    public Date getFechaMora() {
        return fechaMora;
    }

    public void setFechaMora(Date fechaMora) {
        this.fechaMora = fechaMora;
    }

    public Integer getDiasMora() {
        return diasMora;
    }

    public void setDiasMora(Integer diasMora) {
        this.diasMora = diasMora;
    }

    public Double getValMora() {
        return valMora;
    }

    public void setValMora(Double valMora) {
        this.valMora = valMora;
    }

    public Double getVSeguro() {
        return vSeguro;
    }

    public void setVSeguro(Double vSeguro) {
        this.vSeguro = vSeguro;
    }

    public Double getInteresMora() {
        return interesMora;
    }

    public void setInteresMora(Double interesMora) {
        this.interesMora = interesMora;
    }

    public Double getSaldRestante() {
        return saldRestante;
    }

    public void setSaldRestante(Double saldRestante) {
        this.saldRestante = saldRestante;
    }

    public String getTipoCobro() {
        return tipoCobro;
    }

    public void setTipoCobro(String tipoCobro) {
        this.tipoCobro = tipoCobro;
    }

    public Date getFechaAcuerdoUno() {
        return fechaAcuerdoUno;
    }

    public void setFechaAcuerdoUno(Date fechaAcuerdoUno) {
        this.fechaAcuerdoUno = fechaAcuerdoUno;
    }

    public String getAcuerdoUno() {
        return acuerdoUno;
    }

    public void setAcuerdoUno(String acuerdoUno) {
        this.acuerdoUno = acuerdoUno;
    }

    public Date getFechaAcuerdoDos() {
        return fechaAcuerdoDos;
    }

    public void setFechaAcuerdoDos(Date fechaAcuerdoDos) {
        this.fechaAcuerdoDos = fechaAcuerdoDos;
    }

    public String getAcuerdoDos() {
        return acuerdoDos;
    }

    public void setAcuerdoDos(String acuerdoDos) {
        this.acuerdoDos = acuerdoDos;
    }

    public Date getFechaAcuerdoTres() {
        return fechaAcuerdoTres;
    }

    public void setFechaAcuerdoTres(Date fechaAcuerdoTres) {
        this.fechaAcuerdoTres = fechaAcuerdoTres;
    }

    public String getAcuerdoTres() {
        return acuerdoTres;
    }

    public void setAcuerdoTres(String acuerdoTres) {
        this.acuerdoTres = acuerdoTres;
    }

    public Date getFechaAcuerdoCuatro() {
        return fechaAcuerdoCuatro;
    }

    public void setFechaAcuerdoCuatro(Date fechaAcuerdoCuatro) {
        this.fechaAcuerdoCuatro = fechaAcuerdoCuatro;
    }

    public String getAcuerdoCuatro() {
        return acuerdoCuatro;
    }

    public void setAcuerdoCuatro(String acuerdoCuatro) {
        this.acuerdoCuatro = acuerdoCuatro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SeguimientoClientes)) {
            return false;
        }
        SeguimientoClientes other = (SeguimientoClientes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkgrest.SeguimientoClientes[ id=" + id + " ]";
    }

}
