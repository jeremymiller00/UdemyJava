import java.util.ArrayList;

public class App {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());

        showList(list1);


        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());
        list2.add(new Camera());

        showList(list2);

    }

     public static void showList(ArrayList<? extends Machine> lst) { // `?` mean now an ArrayList of any type of parameter
         for(Machine value: lst) {                  // but then they will be treated as type Object
             System.out.println(value);             // Machine and Camera methods will not be available
             value.start();                         // Machine or a sublcass
             value.snap();
         }
    }
    public static void showList2(ArrayList<? super Camera> lst) { // `?` mean now an ArrayList of any type of parameter
        for (Machine value : lst) {                  // but then they will be treated as type Object
            System.out.println(value);             // Machine and Camera methods will not be available
            value.start();                         // Camera or a superclass; less useful
            value.snap();
        }
    }
    public static void showList(ArrayList<?> lst) { // `?` mean now an ArrayList of any type of parameter
        for(Machine value: lst) {                  // but then they will be treated as type Object
            System.out.println(value);             // Machine and Camera methods will not be available
            value.start();                         // Machine or a sublcass
            value.snap();
        }
    }

}

