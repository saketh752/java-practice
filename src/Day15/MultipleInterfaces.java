package Day15;
interface Camera {
    void takePhoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera, MusicPlayer{
    public void takePhoto(){
        System.out.println("Photo Captured");
    }
    public void playMusic(){
        System.out.println("Music playing");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.takePhoto();
        s.playMusic();
    }
}
