public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai) {
            case "A" -> {
                System.out.println("Wow Anda Lulus Dengan Baik !");
            }
            case "B", "C" -> {
                System.out.println("Nilai anda cukup baik !");
            }
            case "D" -> {
                System.out.println("Anda tidak lulus !");
            }
            default -> {
                System.out.println("Mungkin anda salah jurusan !");
            }
        }

        
        String ucapan = switch(nilai) {
            case "A":
                yield "Wow Anda Lulus Dengan Baik !";
            case "B", "C":
                yield "Nilai Anda Cukup Baik !";
            case "D" :
                yield "Anda tidak lulus !";
            default :
                yield "Mungkin anda salah jurusan !";
        };


    }
}
