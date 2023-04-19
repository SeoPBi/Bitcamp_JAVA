package review.example.exam2;

public class HTTPServletExample {
    public static void main(String[] args) {
        method(new LoginServlet()); // 로그인합니다.
        method(new FileDownLOadServlet()); // 파일 다운로드합니다.
    }

    public static void method(HTTPServlet servlet) {
        servlet.service();
    }
}
