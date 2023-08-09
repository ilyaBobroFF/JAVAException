public class Parsemade {
    private String input;
    private Contact contact;
    private String[] working;
    private String error;

    public Parsemade(String input) {
        Contact contact = new Contact();
        this.contact = contact;
        this.input = input;
        this.working = input.split("/");
        this.error = "0";
    }

    public String checkInput(){
        if (working.length == 6) error = "0";
        else if (working.length > 6) error = "-100";
        else error = "-200";
        return error;
    }
    public String checkContact(){
        if(contact.toString().contains("null")||contact.toString().contains("0")){
            return error;
        }
        return "0";
    }
    public Contact parseContact() {
            for (String item : working) {
                if (item.contains(":")) {contact.setData(parseDate(item));}
                else if (item.length() == 1) {contact.setGender(parseGender(item));}
                else if (item.contains("0") || item.contains("1") || item.contains("2") || item.contains("3") ||
                        item.contains("4") || item.contains("5") || item.contains("6") || item.contains("7") ||
                       item.contains("8") || item.contains("9")) {contact.setPhone(parsePhone(item));}
                else {
                    if (contact.getFamily() == null)contact.setFamily(parseName(item));
                    else if (contact.getFirstName() == null) {contact.setFirstName(parseName(item));}
                    else  {contact.setLastName(parseName(item));}
                }
            }
            return contact;
    }


    private String parseDate(String in) {
        String[] indata = in.split(":");
        if (indata.length == 3 && indata[0].length() == 2 && indata[1].length() == 2 && indata[2].length() == 4) {
            for (String item : indata){
                try {
                    int check = Integer.parseInt(item);
                }
                catch (RuntimeException e){
                    error = "-310";
                    return null;
                }
            }
            return in;
        }
        else {
            if (!error.equals("-310")) error = "-300";
            return null;
        }
    }

    private char parseGender(String in) {
        if (in.length() == 1 && in.contains("f") || in.contains("m")) {
            return in.charAt(0);
        }
        else{
            error = "-400";
            return '0';
        }
    }

    private int parsePhone(String in) {
        try {
            int number = Integer.parseInt(in);
            return number;
        }
        catch (RuntimeException e){
            error = "-500";
            System.out.println();
        }
            return 0;
    }
    private String parseName(String item){
        return item;
    }
}

