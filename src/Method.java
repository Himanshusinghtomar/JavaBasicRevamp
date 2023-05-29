
class Computer {

    public void getMePen()
    {
        System.out.println("Hello It's Your Pen");
    }
    public String playMusic(int bit)
    {
        if(bit == 1)
            return ("Music Playing");
        return "Music is Not Playing";
    }
}

public class Method {
    public static void main(String[] args) {
        Computer pc = new Computer();
        System.out.println(pc.playMusic(0));
        pc.getMePen();
    }
}
