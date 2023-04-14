package encap.good;

public class MyBirthday {

    private int year;
    private int month;
    private int day;

    public MyBirthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    void showDateInfo() {
        System.out.println("내 생일은");
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }

    /*
        은닉된 변수에 접근하기 위해서는
        클래스 설계시 미리 설정해둔 setter/getter 메서드를
        이용해 데이터에 접근해야 합니다.
     */

    /*
        -setter 메서드 선언.
        1. setter메서드는 은닉변수에 값을 저장(세팅)하기 위해 선업합니다.
        2. 메서드의 접근제한자는 public으로 설정하고
            이름은 일반적으로 set+변수명으로 지정합니다.
     */

    public void setDay(int day) {
        if(day < 1 || day > 31) {
            day = 1; // 잘못 들어온 수에 대한 처리는 알아서.
        }
    }

    /*
        - getter 메서드 선언
        1. getter 메서드는 말 그대로 수를 get 하는 용도입니다.
        2. 값을 조회만 할 수 있고 변경은 불가능하기때문에 보안성을 높여줍니다.
        3. 이름은 마찬가지로 get+변수명을 사용해 만듭니다.
     */

    public int getDay() {
        return this.day;
    }

    // year, month에 대해서도 여러분들이 setter/getter를 모두 만들어주세요.


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
}

