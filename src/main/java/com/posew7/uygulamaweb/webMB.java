package com.posew7.uygulamaweb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "webMB")
@RequestScoped
public class webMB {

    private int kenar1;
    private int kenar2;
    private int kenar3;
    private int sayi;

    public webMB() {
    }

    public String tekmiciftmi() {

        if (sayi % 2 == 0) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("bu sayı çifttir", ""));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("bu sayı tektir", ""));
        }

        return "";
    }

    public int getSayi() {
        return sayi;
    }

    public void setSayi(int sayi) {
        this.sayi = sayi;
    }

    public String ucgenMi() {

        if (Math.abs(kenar1 - kenar2) < kenar3 && kenar3 < kenar2 + kenar1
                && Math.abs(kenar1 - kenar3) < kenar2 && kenar2 < kenar1 + kenar3
                && Math.abs(kenar2 - kenar3) < kenar1 && kenar1 < kenar2 + kenar3) {

            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("EVET", "bu bir üçgendir"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("HAYIR", "bu üçgen değildir"));
        }

        return "";
    }

    public int getKenar1() {
        return kenar1;
    }

    public void setKenar1(int kenar1) {
        this.kenar1 = kenar1;
    }

    public int getKenar2() {
        return kenar2;
    }

    public void setKenar2(int kenar2) {
        this.kenar2 = kenar2;
    }

    public int getKenar3() {
        return kenar3;
    }

    public void setKenar3(int kenar3) {
        this.kenar3 = kenar3;
    }

}
