import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Используйте / - вместо пробела. : - для разделения даты. Введите строку: ");
        String vvod = sc.next();
        Parsemade parsemade = new Parsemade(vvod);
        if (parsemade.checkInput().equals("0")){
            Contact save = parsemade.parseContact();
            if (parsemade.checkContact().equals("0")) {
                Savefile savefile = new Savefile(save);
                savefile.save();
            }
            else {
                Errorprint error = new Errorprint(parsemade.checkContact());
                error.erPrint();
            }
        }
        else {
            Errorprint error = new Errorprint(parsemade.checkInput());
            error.erPrint();
        }


    }
}
