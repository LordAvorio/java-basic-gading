public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        
        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;
        iniByte = 100;

        System.out.println(iniByte);

        //Konversi primitive ke non primitive
        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        float iniFloat = iniObject.floatValue();

    }
}
