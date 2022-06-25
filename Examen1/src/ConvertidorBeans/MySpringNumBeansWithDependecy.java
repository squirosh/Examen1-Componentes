package ConvertidorBeans;
import Convertidor.Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class MySpringNumBeansWithDependecy {
    //objeto de la interfaz
    Interface anInterface;

    @Autowired
    public void setConvertidor(Interface convertir){
        this.anInterface = convertir;
    }

    public void leerDecimal(int pDecimal){
        System.out.println("El numero convertido a hexadecimal o binario es: "+ anInterface.fromDecimal(pDecimal));
    }

    public void leerOtro(String pNoDecimal){
        System.out.println("El numero convertido de hexadecimal o binario a decimal es: "+ anInterface.toDecimal(pNoDecimal));
    }
}