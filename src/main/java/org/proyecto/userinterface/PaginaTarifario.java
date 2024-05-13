package org.proyecto.userinterface;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class PaginaTarifario extends PageObject {
   // public static final By btn_abrir_pdf = By.xpath("//a[@href='/wps/wcm/connect/www.banistmo.com11237/7279f731-b6fa-4208-aa21-277f005357ff/Tarifas-de-cuentas-de-Depositos.pdf?MOD=AJPERES&CVID=oZp4Rma']");
    public static final By btn_abrir_pdf = By.xpath("//td[@data-th='Documentos' and contains(text(), 'Tarifas de Cuentas de Depósitos')]/following-sibling::td/a[@target='_blank']");


}
