package ten.http;

public class HttpServeletExample {
    public static void main(String[] args) {
       method(new LoginServelet()); // 로그인 합니다 
       method(new FileDownloadServelet()); // 파일 다운로드 합니다.
    }    
    public static void method(HttpServlet servlet){
        servlet.service();
    }
}