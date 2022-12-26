import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GetDate timeTask = new GetDate();
        String tDate = timeTask.getDaate();
        String tTime = timeTask.getTiime();

        int id;
        String someTask;
        String deadLine;
        String name;
        String prior;

        Scanner in = new Scanner(System.in);
        System.out.print("Введите задачу: ");
        someTask = in.nextLine();
        System.out.print("Введите срок окончания задачи: ");
        deadLine = in.nextLine();
        System.out.print("Введите ФИО исполнителя: ");
        name = in.nextLine();   
        System.out.print("Введите приоритет задачи: ");
        prior = in.nextLine();
        System.out.print("Введите номер задачи: ");
        id = in.nextInt();
        in.close();

        Task generalTask = new Task(id, someTask, tDate, tTime, deadLine, name, prior);

        // Task taskOne = new Task(1, 
        //                         "doSomthing", 
        //                         tDate, 
        //                         tTime, 
        //                         "29.12.22", 
        //                         "Sidorov Ivan Petrovich",
        //                         "low");

        // Task taskTwo = new Task(2, 
        //                         "doSomthingElse", 
        //                         tDate, 
        //                         tTime, 
        //                         "29.12.22", 
        //                         "Petrov Ivan Petrovich",
        //                         "middle");

        // Task taskThree = new Task(3, 
        //                         "doSomthingThird", 
        //                         tDate, 
        //                         tTime, 
        //                         "29.12.22", 
        //                         "Krasin Ivan Petrovich",
        //                         "high");

        String strTaskGeneral = generalTask.getTask();

        // String strTaskOne = taskOne.getTask();
        // String strTaskTwo = taskTwo.getTask();
        // String strTaskThree = taskThree.getTask();

        Set<String> mySet = new HashSet<>();

        mySet.add(strTaskGeneral);

        // mySet.add(strTaskOne);
        // mySet.add(strTaskTwo);
        // mySet.add(strTaskThree);

        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            WriteToCsv someWrite = new WriteToCsv();
            someWrite.writeCsv(next);
        }
    }
}