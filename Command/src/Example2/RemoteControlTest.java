package Example2;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOffCommand lightOff = new LightOffCommand(light);

        remote.setCommand(lightOff);
        remote.buttonWasPressed();
    }
}
