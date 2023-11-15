package ten.arr;

/**
 * ControllerTest
 */
public class ControllerTest {

    public static void main(String[] args) {
        Controller[] c = {new Tv(true), new Radio(false)};

        for(Controller controller : c) // c객체(배열) 안에서 controller가 반복한다. 
        controller.show();
    }
}