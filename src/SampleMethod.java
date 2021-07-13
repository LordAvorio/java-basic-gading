public class SampleMethod {
    public static void main(String[] args) {
        // sayHelloWorld();
        // sayHello("Gading", "Prakoso");
        // System.out.println(sum(200,100));
        // System.out.println(hitung("-",200,100));

        // int[] values = {80, 50, 50, 50, 80};
        // sayCongrats("Eko", values);

        // sayOverHello();
        // sayOverHello("Gading", "Prakoso");

        System.out.println(factorialLoop(10));
        System.out.println(factorialRecursive(10));

    }

    static void sayHelloWorld(){
        System.out.println("Hello World");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int sum(int value1, int value2){
        var total = value1+value2;
        return total;
    }

    static int hitung(String operasi, int value1, int value2){
        switch(operasi){
            case "+":
                return value1 + value2;
            case "-":
                return value1 - value2;
            default:
                return 0;
        }
    }


    //Method Variable Arguments
    static void sayCongrats(String name, int... values){
        var total = 0;
        for (var value : values){
            total += value;
        }
        var finalValue = total / values.length;

        if(finalValue >= 75){
            System.out.println("Selamat " + name + ", Anda Lulus !");
        }else{
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");
        }

    }

    //Method Overloading : nama method boleh sama asal parameter memiliki nilai berbeda
    static void sayOverHello(){
        System.out.println("Hello");
    }

    static void sayOverHello(String firstName, String lastName){
        System.out.println("Hello "+ firstName + " " + lastName);
    }

    //Recursive Method(Kemampuan Method memanggil methodnya sendiri)

        //Contoh Method Factorial
    static int factorialLoop(int value){
        var res = 1;
        for(var count = 1; count <= value; count++) {
            res *= count;
        }
        return res;
    }

    static int factorialRecursive(int value){
        if(value == 1){
            return 1;
        }else{
            return value * factorialRecursive(value - 1);
        }
    }

}
