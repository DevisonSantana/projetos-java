public class iPhone implements iPod, Internet, Phone{

    public void call(String number) {
        System.out.println("calling... " + number);
    }

    public void message(String text) {
        System.out.println("sending message...");
    }

    public void web(String search) {
        System.out.println("searching for: " + search);
    }

    public void play() {
        System.out.println("music is playing");
    }

    public void pause() {
        System.out.println("music is paused");
    }

}
