package Convertidor;

public class Hexadecimal implements Interface{
    @Override
    public String fromDecimal(int numero) {
        return Integer.toHexString(numero);
    }

    @Override
    public int toDecimal(String numero) {
        return Integer.parseInt(numero, 16);
    }
}