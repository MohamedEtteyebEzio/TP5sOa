package metier;


import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Compte {
    private int code =0;
    private double solde=0.0;
    @XmlTransient
    private Date date = new Date();
    public Compte(int code, double solde, Date dateCreation) {

        this.code = code;
        this.solde = solde;
        this.date = dateCreation;
    }
    public Compte (){

    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Date getDateCreation() {
        return date;
    }
    public void setDateCreation(Date dateCreation) {
        this.date = dateCreation;
    }



}
