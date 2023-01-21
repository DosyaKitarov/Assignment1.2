import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Choose: \n" +
                "1) Recursive" + "\n"+
                "2) Aspirant"+"\n"+
                "3) Zhivotnoe");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                Recursive.printNumbers(a, b);
                break;
            case 2:
                Student Aspir = new Aspirant("Nill", "Kiggers", "BDA-2209", 5.0, "How to solve racism");
                Student stud = new Student("Eva", "Elfie", "MT-2120", 4.0);
                System.out.println("\n" + Aspir.getFirstName() + " " + Aspir.getLastName() + ":");
                System.out.println(Aspir.getScholarship());
                System.out.println("\n" + Aspir.getFirstName() + " " + Aspir.getLastName() + ":");
                System.out.println(stud.getScholarship());
                break;
            case 3:
                Animal[] animals = {new Dog("bone", "dog house", "Golden Retriever"),
                        new Cat("fish", "living room", true),
                        new Horse("hay", "stable", 5)};

                Veterinary vet = new Veterinary();
                for (Animal i : animals) {
                    vet.treatAnimals(i);
                }break;
        }
    }
}