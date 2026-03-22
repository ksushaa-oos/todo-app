import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить задачу");
            System.out.println("2. Показать задачи");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Выход");

            System.out.print("Выбор: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите задачу: ");
                    tasks.add(scanner.nextLine());
                    break;

                case 2:
                    if (tasks.isEmpty()) {
                        System.out.println("Список задач пуст");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Введите номер задачи для удаления: ");
                    int index = scanner.nextInt() - 1;
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                        System.out.println("Задача удалена");
                    } else {
                        System.out.println("Неверный номер");
                    }
                    break;

                case 4:
                    System.out.println("Выход...");
                    return;

                default:
                    System.out.println("Неверный выбор");
            }
        }
    }
}
