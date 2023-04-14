public class Member {
    public String name;
    public String id;
    public String password;
    public int age;

    void Member(String nM, String id, String pw, int age){
        name = nM;
        id = id;
        password = pw;
        age = age;
    }

    public void showInfo() {
        System.out.println(name);
        System.out.println(id);
        System.out.println(password);
        System.out.println(age);
    }

}
