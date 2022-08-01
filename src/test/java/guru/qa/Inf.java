package guru.qa;



public class Inf {
    String fname,lname,email,gender,phone,birth,pict,address,state,city;
    String[] subj,hobbies;
    public Inf(String fname,String lname,String email,String gender,String phone,String birth,String subj,String hobbies,String pict,String address,String state,String city){
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.birth = birth;
        this.subj = subj.split(" ");
        this.hobbies = hobbies.split(" ");
        this.pict = pict;
        this.address = address;
        this.state = state;
        this.city = city;
    }
}
