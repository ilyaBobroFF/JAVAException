public class Contact {
    private String family;
    private String firstName;
    private String lastName;
    private String data;
    private int phone;
    private char gender;
    public Contact (){
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFamily() {
        return this.family;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName(){return this.firstName;}

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    @Override
    public String toString(){
        return "Фамилия: "+this.family+",\n"
                + "Имя: "+this.firstName+", \n"
                + "Отчество: "+this.lastName+", \n"
                + "Дата: " +this.data+", \n"
                + "Номер: " +this.phone+", \n"
                + "Пол: " +this.gender+ ", \n"
                ;
    }
}
