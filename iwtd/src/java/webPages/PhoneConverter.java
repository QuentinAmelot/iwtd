package webPages;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
 @FacesConverter("PhoneConverter")
public class PhoneConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component,
            String value) {
        if (value==null||"".equalsIgnoreCase(value)) {
            FacesMessage msg = new FacesMessage("erreur de conversion",
                            "Valeur invalide");
            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ConverterException(msg);
        }
        StringBuilder phone = new StringBuilder();
        int index = 0;
        while (index < value.length()) {
            phone.append(" "+value.substring(index, Math.min(index + 2, value.length())));
            index = index + 2;
        }
        return phone;
    }
    @Override
    public String getAsString(FacesContext context, UIComponent component,
            Object value) {
        return value.toString();
    }
}
