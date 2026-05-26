interface Playable {
    void play();
}

class Football implements Playable {
    public void play() {
        System.out.println("Playing Football");
    }
}

class Cricket implements Playable {
    public void play() {
        System.out.println("Playing Cricket");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        Playable p1 = new Football();
        Playable p2 = new Cricket();

        p1.play();
        p2.play();
    }
}
