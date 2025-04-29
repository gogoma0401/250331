package common;

class FoolException extends RuntimeException {
}

public class test {
    public void sayNick(String nick) {
        if("바보".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("당신의 별명은 "+nick+" 입니다.");
    }

    public static void main(String[] args) {
        test sample = new test();
        sample.sayNick("바보");
        sample.sayNick("야호");
    }
}
