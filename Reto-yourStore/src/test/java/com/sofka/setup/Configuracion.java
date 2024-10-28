package com.sofka.setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static com.google.common.base.StandardSystemProperty.USER_DIR;
import static com.sofka.utils.Log4j.LOG4J_PROPERTIES_FILE_PATH;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class Configuracion {

    private static final String SWITCHES="--remote-allow-origins=*";
    private static final String SWITCHES_DOS="--start-maximized";
    private static final String ACTOR="Ivan";

    @Managed()
    protected WebDriver webDriver;
    private void setUpUser(){
        configurarDriver();
        OnStage.setTheStage(new OnlineCast());
        theActorCalled(ACTOR).can(BrowseTheWeb.with(webDriver));
    }

    private void configurarDriver(){
        ChromeOptions co=new ChromeOptions();
        co.addArguments(SWITCHES);
        co.addArguments(SWITCHES_DOS);
        co.addArguments("--incognito");
        co.addArguments("--allow-insecure-localhost");
        co.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        webDriver=new ChromeDriver(co);
    }

    protected void quitarDriver(){
        webDriver.quit();
    }
    private void setUpLog4j(){
        PropertyConfigurator.configure(USER_DIR.value()+LOG4J_PROPERTIES_FILE_PATH.getValue());
    }
    protected void configurarNavegador(){
        setUpUser();
        setUpLog4j();
    }
}
