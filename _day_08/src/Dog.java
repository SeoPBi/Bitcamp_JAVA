public class Dog {
    public String name;
    public int age;
    public String kind;
    public String hoppy;
    public String height;

    public Dog(String nm, int a, String k, String he, String ho) {
        name = "뭉치";
        age = a;
        kind = "스피치";
        height = he;
        hoppy = ho;
    }
    public void showInfo() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(kind);
        System.out.println(hoppy);
        System.out.println(height);
    }

}
