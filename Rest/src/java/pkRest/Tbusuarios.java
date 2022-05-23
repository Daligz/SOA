package pkRest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "tbusuarios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbusuarios.findAll", query = "SELECT t FROM Tbusuarios t")
    , @NamedQuery(name = "Tbusuarios.findById", query = "SELECT t FROM Tbusuarios t WHERE t.id = :id")
    , @NamedQuery(name = "Tbusuarios.findByNombre", query = "SELECT t FROM Tbusuarios t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tbusuarios.findByUsuario", query = "SELECT t FROM Tbusuarios t WHERE t.usuario = :usuario")
    , @NamedQuery(name = "Tbusuarios.findByPsw", query = "SELECT t FROM Tbusuarios t WHERE t.psw = :psw")})
public class Tbusuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 50)
    @Column(name = "usuario")
    private String usuario;
    @Column(name = "psw")
    private Integer psw;

    public Tbusuarios() {
    }

    public Tbusuarios(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Integer getPsw() {
        return psw;
    }

    public void setPsw(Integer psw) {
        this.psw = psw;
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
        if (!(object instanceof Tbusuarios)) {
            return false;
        }
        Tbusuarios other = (Tbusuarios) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pkRest.Tbusuarios[ id=" + id + " ]";
    }

}
