import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException {

        // Тщетные попытки утсановить кириллицу в консоле :)
        /*
        String ru = "Русский язык";
        PrintStream ps = new PrintStream(System.out, true, "UTF-8");
        System.out.println(ru.length());
        System.out.println(ru);
        ps.println(ru);

        // Да, тут дальше идет немецкий и потом вообще корейский,
        // но это должны были быть рабочие примеры с формумов, но увы и даже они не пашут :(

        String inputString = "Entwickeln Sie mit Vergnügen";
        byte[] bytes = inputString.getBytes(StandardCharsets.UTF_8);

        String utf8EncodedString = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("German string is :: " + inputString);
        System.out.println("utf8 Encoded String is ::" + utf8EncodedString);
        System.out.println("Both String Equals:: " + inputString.equals(utf8EncodedString));

        String str = "hey\u6366";
        byte[] charset = str.getBytes("UTF-8");
        String result = new String(charset, "UTF-8");
        System.out.println(result);

         */


        Scanner scanner = new Scanner(System.in);
        Race race = new Race();
        String name;
        double speed;
        Car car;
        for(int i = 0;i < 3;i++) {
            System.out.println("Name of car number " + (i+1) + ":");
            name = scanner.next();
            do {
                System.out.println("Speed of car number " + (i+1) + ":");
                speed = scanner.nextDouble();
                car = new Car(name, speed);
                if(!car.isCorrectSpeed()) System.out.println("Incorrect speed!");
            } while (!car.isCorrectSpeed());
            race.addCar(car);
        }
        Car winner = race.getWinner();
        System.out.println("The faster car -> " + winner.getName());
    }
}