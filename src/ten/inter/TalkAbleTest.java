package ten.inter;

import five.korean;

public class TalkAbleTest {
    static void speak(TalkAble t){ // speak에 TalkAble t 를 넣어 t에 할당하고 
        t.talk();
    };

    public static void main(String[] args) {
        speak(new Korean()); // speak에 new korean을 넣어 talk 메소드가 실행되게 만듬 
        speak(new America());
    }
}
