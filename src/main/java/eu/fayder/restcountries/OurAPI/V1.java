package eu.fayder.restcountries.OurAPI;

import eu.fayder.restcountries.v1.rest.CountryService;
import eu.fayder.restcountries.v1.domain.Country;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Scanner;

public class V1 {
    CountryService dummy;
    @Test
    public void getALLInfoByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(name+" Capital:- "+dum.get(0).getCapital());
        System.out.println(name+" Population :- "+dum.get(0).getPopulation());
        System.out.println(name+" Area:- "+dum.get(0).getArea());
        System.out.println(name+" Borders are:- "+dum.get(0).getBorders());
        System.out.println(name+" TimeZones:- "+dum.get(0).getTimezones());
        System.out.println(name+" Region is :- "+dum.get(0).getRegion());
        System.out.println(name+" Languages is :- "+dum.get(0).getLanguages());
        System.out.println(name+" Currencies is:- "+dum.get(0).getCurrencies());
        System.out.println(name+" Spellings :- "+dum.get(0).getAltSpellings());
        System.out.println(name+" Gini :- "+dum.get(0).getGini());
    }
    @Test
    public void getPopByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getPopulation());
    }
    @Test
    public void getAreaByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getArea());
    }
    @Test
    public void getBordersByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getBorders());
    }
    @Test
    public void getTimezonesByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getTimezones());
    }
    @Test
    public void getRegionByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getRegion());
    }
    @Test
    public void getLanguagesByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getLanguages());
    }
    @Test
    public void getCurrenciesByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getCurrencies());
    }
    @Test
    public void getAltSpellingsByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getAltSpellings());
    }
    @Test
    public void getAlpha2CodeByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getAlpha2Code());
    }
    @Test
    public void getAlpha3CodeByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getAlpha3Code());
    }
    @Test
    public void getCapitalByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getCapital());
    }
    @Test
    public void getGiniByName() {
        String name = "Egypt";
        List<Country> dum = dummy.getInstance().getByName(name, false);
        System.out.println(dum.get(0).getGini());
    }


}
