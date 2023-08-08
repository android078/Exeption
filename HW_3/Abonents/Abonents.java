package Abonents;

public class Abonents {
    public int id;
    public String fname = "";
    public String lname = "";
    public String patronomic = "";
    public String birthday = "";
    public String sex = "";
    public String phonenumber = "";
    static public int index =1;

    public Abonents(String fname, String lname, String patronomic, String birthday, String sex,
                    String phonenumber){
            this.id = index;
            this.fname = fname;
            this.lname = lname;
            this.patronomic = patronomic;
            this.birthday = birthday;
            this.sex = sex;
            this.phonenumber = phonenumber;

            index ++;

    }
    
}
