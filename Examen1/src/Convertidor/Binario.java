package Convertidor;

public class Binario implements Interface{
    @Override
    public String fromDecimal(int numero) {
        return Integer.toBinaryString(numero);
    }

    @Override
    public int toDecimal(String numero) {
        return Integer.parseInt(numero,2);
    }
}

