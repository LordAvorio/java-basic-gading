public class AplikasiTodolist {


    public static String[] model = new String[10];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        // testShowTodoList();
        // testAddTodoList();
        // testRemoveTodoList();
        // testInput();
        // testViewShowTodoList();
        // testViewAddToDoList();
        // testViewRemoveTodoList();
        viewShowTodoList();
    }

    //Menampilkan To Do List
    public static void showToDoList(){
        System.out.println("xxxxxTO DO LISTxxxxx");
        for(var i = 0; i < model.length; i++){
            var todo = model[i];
            var no = i + 1;

            if(todo != null){
                System.out.println(no + ". " + todo);
            }
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxx");
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Belajar Javascript";
        showToDoList();
    }

    //Menambah To Do ke List
    public static void addToDoList(String todo){

        //cek apakah model penuh
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }            
        }

        //Jika Penuh akan resize 2 kali lipat
        if(isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }


        //tambahkan data di array null
        for(var i =0; i < model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
       for (int i = 0; i < 25; i++) {
           addToDoList("Contoh To Do Ke " + i);
       }
       showToDoList();
    }

    //Menghapus To Do dari List
    public static boolean removeToDoList(Integer number){
        if((number - 1) >= model.length){
            return false;
        }else if(model[number-1] == null){
            return false;
        }else{
            for (int i = number - 1; i < model.length; i++) {
                if(i == model.length -1){
                    model[i] = null;
                }else{
                    model[i] = model[i + 1];
                }
            }

            return true;
        }
    }

    public static void testRemoveTodoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");

        var result = removeToDoList(20);
        System.out.println(result);

        result = removeToDoList(2);
        System.out.println(result);

        showToDoList();

    }

    
    
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        var name = input("nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    //Menampilkan view to do list
    public static void viewShowTodoList(){
        while(true){
            
            showToDoList();
    
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Delete");
            System.out.println("3. Keluar");
    
            var pilihMenu = input("Pilih Menu");
    
            if(pilihMenu.equals("1")){
                viewAddTodoList();
            }else if(pilihMenu.equals("2")){
                viewRemoveTodoList();
            }else if(pilihMenu.equals("3")){
                break;
            }else{
                System.out.println("Wrong Choose !");
            }

        }
    }

    public static void testViewShowTodoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        addToDoList("Empat");
        addToDoList("Lima");
        viewShowTodoList();
    }

    //Menampilkan view add to do list
    public static void viewAddTodoList(){
        System.out.println("ADD TO DO LIST");
        var todo = input("Todo (ketik NO jika batal)");
        if(todo.equals("NO")) {
            // batal
        }else{
            addToDoList(todo);
        }
    }

    public static void testViewAddToDoList(){
        viewAddTodoList();

        showToDoList();
    }

    //Menampilkan view hapus to do list
    public static void viewRemoveTodoList(){
        System.out.println("DELETE TO DO LIST");
        var number = input("Nomor yang dihapus (ketik NO jika batal)");

        if(number.equals("NO")){
            //batal
        }else{
            boolean success = removeToDoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus to do list : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList(){
        addToDoList("Satu");
        addToDoList("Dua");
        addToDoList("Tiga");
        addToDoList("Empat");
        addToDoList("Lima");

        showToDoList();

        viewRemoveTodoList();

        showToDoList();
    }

}
