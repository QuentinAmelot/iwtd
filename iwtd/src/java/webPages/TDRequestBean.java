package webPages;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import business.BO.ITduserBO;
import business.BO.ITrackdayBO;
import business.model.Trackday;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ManagedBean(name = "TDRequestBean")
@SessionScoped
public class TDRequestBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String pricing;
    private String level;
    private Date from;
    private Date to;
    static Logger log = Logger.getLogger(LoginBean.class.getName());

    public TDRequestBean() {
        super();
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public void onDateSelect(SelectEvent event) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        facesContext.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", format.format(event.getObject())));
    }

    public void click() {
        RequestContext requestContext = RequestContext.getCurrentInstance();

        log.info("Hello Mr " + from.toString() + to.toString());
        gatherTD();
    }

    public String getPricing() {
        return pricing;
    }

    public void setPricing(String pricing) {
        this.pricing = pricing;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List gatherTD() {
        ApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath*:spring/config/BeanIwtd.xml");
        ITrackdayBO tdBO;
        tdBO = (ITrackdayBO) appContext.getBean("ITrackdayBO");
        System.out.println("hello");
        List<Trackday> l;
        l = tdBO.findByRequest(from, to);
        log.info(l.get(0).getLevel());
        return l;
    }
    /*
     public void register() {
     ApplicationContext appContext
     = new ClassPathXmlApplicationContext("classpath*:spring/config/BeanIwtd.xml");

     ITduserBO userBO;
     userBO = (ITduserBO) appContext.getBean("ITduserBO");
     if (this.firstname != null && this.lastname != null && this.login != null && this.email != null && this.pw != null) {
     if (userBO.findByLogin(login)==null){
     log.info(firstname + lastname + "registered");
     Tduser u = new Tduser(login, pw, firstname, lastname, email, true);
     log.info(u.getLogin()+"has been registered");
     userBO.save(u);
     }else{
     log.info("Already registed");
     }
     }
     }

     public void login() {
     System.out.println(llogin + lpw);
     ApplicationContext appContext
     = new ClassPathXmlApplicationContext("classpath*:spring/config/BeanIwtd.xml");

     ITduserBO userBO;
     userBO = (ITduserBO) appContext.getBean("ITduserBO");
     if (this.llogin != null && this.lpw != null) {
     luser = userBO.findByLogin(llogin);
     log.info("Hello Mr "+luser.getLastname()+luser.getPassword());
     if(this.lpw.equals(luser.getPassword())){
     log.info("Valid Password");
     log.info("User redirected to search page");
                
     }
     }
     }*/
}
