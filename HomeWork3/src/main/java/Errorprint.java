public class Errorprint {
    String error;
    public Errorprint(String error){
        this.error = error;
    }
    public void erPrint(){
        switch (error){
            case "-100":
                System.out.println("Большое количество элементов");
                break;
            case "-200":
                System.out.println("Недостаточное количество элементов");
                break;
            case "-300":
                System.out.println("Неверный формат даты");
                break;
            case "-310":
                System.out.println("Присутствуют лишние символы в дате");
                break;
            case "-400":
                System.out.println("Не верно указан пол");
                break;
            case "-500":
                System.out.println("Не верно указан номер телефона");
                break;
            default:
                System.out.println("Неизвестная ошибка");
        }
    }
}
