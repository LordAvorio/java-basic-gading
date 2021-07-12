public class Looping {
    public static void main(String[] args) {

        //For Loop
        for(var counter = 1 ; counter <= 10 ; counter++){
            System.out.println("Perulangan");
        }

        //While Loop
        var counterWhile = 1;

        while(counterWhile <= 10){
            System.out.println("Perulangan " + counterWhile);
            counterWhile++;
        }

        //Do While Loop
        var counterDoWhile = 100;

        do{
            System.out.println("Perulangan " + counterDoWhile);
            counterDoWhile++;
        }while(counterDoWhile <= 10);


        //Example Break
        var breakCounter = 1;

        while(true){
            System.out.println("Perulangan " + breakCounter);
            breakCounter++;
            //Akan berhenti bila memenuhi syarat
            if(breakCounter > 10){
                break;
            }

        }

        //Example Continue
        for(var countCont = 1; countCont <= 100; countCont++){
            if(countCont % 2 ==0){
                continue;
            }

            System.out.println("Perulangan Ganjil " + countCont);
        }


        //For Each
        String[] teman = {
            "Gading", "Raka", "Adit", "Agit", "Gaby"
        };

        for(var name: teman){
            System.out.println(name);
        };


    }
}
