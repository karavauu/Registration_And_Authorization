import java.util.Scanner;

public class Main {
    static final String RESET = "\u001b[0m";
    static final String RED = "\u001b[31m";
    static final String GREEN = "\u001b[32m";
    static final String YELLOW = "\u001b[33m";
    static final String CYAN = "\u001b[36m";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(CYAN + "Добро пожаловать!" + RESET + "\nПожалуйста пройдите регистрацию.\n");

        System.out.print("Придумайте логин : ");
        String login = scan.nextLine();

        System.out.print("Придумайте пароль : ");
        String password = scan.nextLine();


        for (byte a = 1; a <= 1; a--) {
            System.out.print("Введите придуманный пароль повторно : ");
            String ReplayPassword = scan.nextLine();
            System.out.println();
            if (ReplayPassword.equals(password))
                break;
            else
                System.out.println(RED + "Пароль не совпадает с предыдущим!" + RESET);
        }

        {
            System.out.println(GREEN + "Вы успешно зарегистрировались!" + RESET);
            System.out.println("Теперь зайдите на свой аккаунт");
        }

        byte x = 3;
        for (byte i = 1; i <= 3; i++) {
            x -= 1;
            System.out.print("Введите логин: ");
            String login2 = scan.nextLine();

            System.out.print("Введите пароль: ");
            String password2 = scan.nextLine();

            if (password2.equals(password) && login2.equals(login)) {
                System.out.println(GREEN + "Вы успешно авторизовались!" + RESET);
                break;
            } else {
                System.out.println(RED + "Неверный логин либо пароль, попробуйте еще раз!" + YELLOW + "\n             Осталость попыток: " + RESET + x);
                System.out.println();
                if (x == 0) {
                    System.out.println(RED + "Вы много раз не верно ввели данные!\nДоступ заблокирован." + RESET);
                    break;
                }
            }
        }
    }
}
