import java.io.FileWriter;
import java.io.IOException;

public class Savefile {
    private String filename;
    private Contact contact;

    public Savefile(Contact contact) {
        this.contact = contact;
        this.filename = contact.getFamily();
    }

    public void save() {
        try (FileWriter writer = new FileWriter(filename, true)) {
            writer.write(contact.toString());
            System.out.println("Запись в файл выполнена");
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл");
            e.printStackTrace();
        }

    }
}
