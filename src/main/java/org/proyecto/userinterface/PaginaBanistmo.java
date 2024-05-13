package org.proyecto.userinterface;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.banistmo.com/")
public class PaginaBanistmo extends PageObject {
    public static final By btn_tarifario = By.xpath("//a[@href='/wps/portal/banistmo/acerca-de/tarifario']");
    public static final By btn_aceptar_cookies = By.id("btn-aceptar-cookies");

}
