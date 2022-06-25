package MainApp;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import ConvertidorBeans.MySpringNumBeansWithDependecy;

public class MainApp {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext context = new ClassPathXmlApplicationContext("file:META-INF/beans.xml");
        BeanFactory factory = context;
        MySpringNumBeansWithDependecy test = (MySpringNumBeansWithDependecy)
                factory.getBean("MySpringNumBeansWithDependecy");

        System.out.print("Inserte un numero decimal para convertirlo: ");
        test.leerDecimal(Integer.parseInt(in.readLine()));
        System.out.print("Inserte un numero hexadecimal o binario para convertirlo a decimal: ");
        test.leerOtro(in.readLine());

    }
}