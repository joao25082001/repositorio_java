package controller;

import dao.Funcionario;
import controller.util.JsfUtil;
import controller.util.JsfUtil.PersistAction;
import bean.FuncionarioFacade;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("funcionarioController")
@SessionScoped
public class FuncionarioController implements Serializable {

    @EJB
    private bean.FuncionarioFacade ejbFacade;
    private List<Funcionario> items = null;
    private Funcionario selected2;
    private Funcionario selected;

    public FuncionarioController() {

    }

    public Funcionario getSelected() {
        return selected;
    }

    public void setSelected(Funcionario selected) {
        this.selected = selected;
    }

    public Funcionario getSelected2() {
        return selected2;
    }

    public void setSelected2(Funcionario selected2) {
        this.selected2 = selected2;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private FuncionarioFacade getFacade() {
        return ejbFacade;
    }

    public Funcionario prepareCreateCadastrar() {
        System.out.println("passou no prepare");
        selected2 = new Funcionario();
        initializeEmbeddableKey();
        return selected2;
    }

    public boolean validarFunc(Funcionario funcionario) {

        Boolean validar = true;
        if (funcionario.getCpf().length() != 11) {
            JsfUtil.addErrorMessage("Erro: Tamanho invalido do cpf");
            validar = false;
        } else {
// Verificar se CPF é único
            List<Funcionario> funcionarios = getItemsAvailableSelectMany();
            for (Funcionario f : funcionarios) {
                if (!f.getId().equals(funcionario.getId()) && f.getCpf().equals(funcionario.getCpf())) {
                    JsfUtil.addErrorMessage("Erro: CPF já cadastrado");
                    validar = false;
                    break;
                }
            }
        }

        if (funcionario.getEmail().contains("@stefanini")) {
            return validar;
        } else {
            JsfUtil.addErrorMessage("email invalido");
            return false;
        }

    }

    public boolean funcExiste(Funcionario funcionario) {
        List<Funcionario> funcionarios = getItemsAvailableSelectMany();
        Boolean existe = false;
        if(1> 0){
            System.out.println("nesse if");
        for (Funcionario f : funcionarios) {
            if ((!f.getId().equals(funcionario.getId())
                    && f.getCpf().equals(funcionario.getCpf()))
                    && (f.getFkusuario().equals("3"))) {
                System.out.println("passou no if");
                existe = true;
                break;

            }
        }
        
        }else {
                System.out.println("entrou no else");
                JsfUtil.addErrorMessage("funcionario sem acesso");
                return existe = false;
            }
        

        return existe;
    }

    public void entrar() {

        if (funcExiste(selected2)) {
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("/StefaniniControl/faces/funcionario/Listar1.xhtml");
            } catch (IOException ex) {
                Logger.getLogger(FuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JsfUtil.addErrorMessage("funcionario sem acesso");
        }
    }

    public void create() {
        System.out.println("chegou?");
        if (validarFunc(selected2)) {
            persist(PersistAction.CREATE, "Funcionário Adicionado");
        }
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, "Funcionário Atualizado");
    }

    public void destroy() {
        persist(PersistAction.DELETE, "Funcionário Excluído");
        if (!JsfUtil.isValidationFailed()) {
            System.out.println("entrou");
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<Funcionario> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected2 != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected2);
                } else {
                    getFacade().remove(selected2);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public Funcionario getFuncionario(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<Funcionario> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<Funcionario> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = Funcionario.class)
    public static class FuncionarioControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            FuncionarioController controller = (FuncionarioController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "funcionarioController");
            return controller.getFuncionario(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof Funcionario) {
                Funcionario o = (Funcionario) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), Funcionario.class.getName()});
                return null;
            }
        }

    }

}
