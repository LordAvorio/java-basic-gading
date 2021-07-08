public class KonversiNumber {
    public static void main(String[] args) {

        //Konversi ada 2 widening casting(otomatis) dan narrowing casting(manual)

        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;

        byte iniByte2 = (byte) iniInt;

    }
}
