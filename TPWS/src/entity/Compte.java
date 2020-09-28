package entity;

import java.util.Date;

public class Compte {
    private int code;
    private double solde;
    private Date date;

    public Compte() {
    }

    public Compte(int code, double solde, Date date) {
        this.code = code;
        this.solde = solde;
        this.date = date;
    }

    public int getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDate() {
        return date;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code=" + code +
                ", solde=" + solde +
                ", date=" + date +
                '}';
    }
}

