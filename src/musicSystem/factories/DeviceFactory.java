package musicSystem.factories;


import musicSystem.device.BluetoothSpeakerAdapter;
import musicSystem.device.HeadphonesAdapter;
import musicSystem.device.IAudioOutputDevice;
import musicSystem.device.WiredSpeakerAdapter;
import musicSystem.enums.DeviceType;
import musicSystem.external.BluetoothSpeakerAPI;
import musicSystem.external.HeadphonesAPI;
import musicSystem.external.WiredSpeakerAPI;

public class DeviceFactory {
    public static IAudioOutputDevice createDevice(DeviceType deviceType){
        switch (deviceType){
                case BLUETOOTH:
                    return new BluetoothSpeakerAdapter(new BluetoothSpeakerAPI());
                case WIRED:
                    return new WiredSpeakerAdapter(new WiredSpeakerAPI());
                case HEADPHONES:
                default:
                    return new HeadphonesAdapter(new HeadphonesAPI());
        }
    }
}
