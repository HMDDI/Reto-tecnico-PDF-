package org.proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import static net.serenitybdd.core.Serenity.getDriver;

public class ValidarPDF implements Question<String> {
    public static String pdfContent;
    public static ValidarPDF PDF() {
        return new ValidarPDF();
    }

    @Override
    public String answeredBy(Actor actor) {


        WebDriver driver = getDriver();
        String pdfUrl = driver.getCurrentUrl();
        try  {
            URL url = new URL(pdfUrl);
            BufferedInputStream fileToParse = new BufferedInputStream(url.openStream());
            PDDocument document = PDDocument.load(fileToParse);
            PDFTextStripper pdfStripper = new PDFTextStripper();
            pdfContent = pdfStripper.getText(document);
            document.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("El texto esperado no está presente en el PDF." + pdfContent);

        }

        return pdfContent;
    }
}