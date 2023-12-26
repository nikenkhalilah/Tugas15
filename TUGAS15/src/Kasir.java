import java.util.Scanner;

public class Kasir implements Input {
    String password = "niken10";
    String captcha = "2RNo12J";
    String inputCaptcha;
    String inputPassword;

    //method login
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------- LOGIN ----------");

        //Captcha
        System.out.println("Kode captcha = " + captcha);
        System.out.println("Masukkan captcha");
        inputCaptcha = scanner.next();

        while(!inputCaptcha.equalsIgnoreCase(captcha)){
        System.out.println("Masukkan captcha");
        inputCaptcha = scanner.next();
        scanner.close();
        }

        //Password
        System.out.println("Masukkan Password");
        inputPassword = scanner.next();

        while(!inputPassword.equals(password)){
            System.out.println("PASSWORD SALAH\n");
            System.out.println("Masukkan password : ");
            inputPassword = scanner.next();
        }
        System.out.println("BERHASIL\n\n");

    }

}
