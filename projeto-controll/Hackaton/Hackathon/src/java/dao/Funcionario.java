package dao;

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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author stefanini
 */
@Entity
@Table(name = "funcionario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "funcionario.findAll", query = "SELECT u FROM Funcionario u"),
    @NamedQuery(name = "funcionario.findById", query = "SELECT u FROM Funcionario u WHERE u.id = :idfuncionario"),
    @NamedQuery(name = "funcionario.findByName", query = "SELECT u FROM Funcionario u WHERE u.nome = :nome"),
    @NamedQuery(name = "funcionario.findByEmail", query = "SELECT u FROM Funcionario u WHERE u.email = :email"),
    @NamedQuery(name = "funcionario.findByCpf", query = "SELECT u FROM Funcionario u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "funcionario.findallCpf", query ="SELECT F.cpf from Funcionario F"),
    @NamedQuery(name = "funcionario.findByArea", query = "SELECT u FROM Funcionario u WHERE u.area = :area"),
    @NamedQuery(name = "funcionario.findBySetor", query = "SELECT u FROM Funcionario u WHERE u.setor = :setor")})
    
public class Funcionario implements Serializable{
     private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfuncionario")
    private Long id;
    @Basic(optional = false)

    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)

    @Column(name = "email")
    private String email;
    @Basic(optional = false)

    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
  
    @Column(name = "area")
    private String area;
    @Basic(optional = false)
    
    @Column(name = "setor")
    private String setor;
    @Basic(optional = false)

    @Column(name = "fkusuario")
    private String fkusuario;
    
    

    public Funcionario() {
    }

    public Funcionario(Long id) {
        this.id = id;
    }

    public Funcionario(Long id, String nome, String email, String cpf, String area, String setor, String fkusuario) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.area = area;
        this.setor = setor;
        this.fkusuario = fkusuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        nome.replaceAll("[0-9]", "");
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        cpf.replaceAll("[^0-9]","");
        this.cpf = cpf;
    }
    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFkusuario() {
        return fkusuario;
    }

    public void setFkusuario(String fkusuario) {
         if("RH".equals(fkusuario)){
        fkusuario = "3";
        }else if("estoque".equals(fkusuario)){
        fkusuario = "2";
        }else{
        fkusuario = "1";
        }
        this.fkusuario = fkusuario;
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
        if (!(object instanceof Funcionario)) {
            return false;
        }
        Funcionario other = (Funcionario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dao.Funcionario[ id=" + id + " ]";
    }
    
}
