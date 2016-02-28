package webPages;

import business.BO.ITduserBO;
import business.model.Tduser;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ManagedBean
@RequestScoped
public class LoginBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String firstname;
    private String lastname;
    private String email;
    private String pw;
    private String login;
    private String lpw;
    private String llogin;

    public String getLpw() {
        return lpw;
    }

    public void setLpw(String lpw) {
        this.lpw = lpw;
    }

    public String getLlogin() {
        return llogin;
    }

    public void setLlogin(String llogin) {
        this.llogin = llogin;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void register() {
        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath*:spring/config/BeanIwtd.xml");

        ITduserBO userBO;
        userBO = (ITduserBO) appContext.getBean("ITduserBO");
        if (this.firstname != null /*&& this.lastname != null && this.login != null*/ && this.email!=null) {
            
            System.out.println(firstname+lastname+userBO.findByTrackCode("1").getFirstname()+"chaussette");
        }
    }
    
    public void login() {
        System.out.println(llogin+lpw);
        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath*:spring/config/BeanIwtd.xml");

        ITduserBO userBO;
        userBO = (ITduserBO) appContext.getBean("ITduserBO");
        if (this.llogin != null && this.lpw!=null) {
            
            System.out.println("chaussette");
        }
    }
}
