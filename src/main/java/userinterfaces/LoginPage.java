package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target TXT_USER = Target.the("Campo de texto para el usuario").
            located(By.id("user-name"));

    public static final Target TXT_PASSWORD = Target.the("Campo de texto para el Password").
            located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("boton para el login").
            located(By.id("login-button"));

    public static final Target lbl_producto= Target.the("boton para el login").
            located(By.xpath("//span[contains(text(),'Products')]"));


}
