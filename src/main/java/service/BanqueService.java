package service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

import java.util.Date;

import java.util.ArrayList;

@WebService
public class BanqueService
{
    public BanqueService(){}
    public  ArrayList<Compte> comptes= new ArrayList<Compte>();
    @WebMethod
    public ArrayList<Compte> getComptes()
    {
        comptes.add(new Compte(1,0.0,new Date()));
        comptes.add(new Compte(2,0.0,new Date()));
        comptes.add(new Compte(3,0.0,new Date()));
        return comptes;

    }
    @WebMethod
    public double conversion( @WebParam double montant)
    {
        return montant*3.3;
    }





}
