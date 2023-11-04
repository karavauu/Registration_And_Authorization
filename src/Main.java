import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать! \nПожалуйста пройдите регистрацию.\n");

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
                System.out.println("Пароль не совпадает с предыдущим.");
        }

        System.out.println("Вы успешно зарегистрировались!\nТеперь зайдите на свой аккаунт");

        byte x = 3;
        for (byte i = 1; i <= 3; i++) {
            x -= 1;
            System.out.print("Введите логин: ");
            String login2 = scan.nextLine();

            System.out.print("Введите пароль: ");
            String password2 = scan.nextLine();

            if (password2.equals(password) && login2.equals(login)) {
                System.out.println("Вы успешно авторизовались!");
                break;
            } else {
                System.out.println("Неверный логин либо пароль, попробуйте еще раз! \n Осталость попыток: " + x);
                System.out.println();
                if (x == 0) {
                    System.out.println("Вы много раз не правильно ввели пароль.\nДоступ заблокирован");
                    break;
                }
            }
        }
    }
}