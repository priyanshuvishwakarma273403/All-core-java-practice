package musicSystem.device;

import musicSystem.external.BluetoothSpeakerAPI;
import musicSystem.models.Song;

public class BluetoothSpeakerAdapter implements IAudioOutputDevice {
    private BluetoothSpeakerAPI bluetoothApi;

    public BluetoothSpeakerAdapter (BluetoothSpeakerAPI bluetoothApi) {
        this.bluetoothApi = bluetoothApi;
    }


    @Override
    public void playAudio(Song song) {
        String payLoad = song.getTitle() + " By " + song.getArtist();
        bluetoothApi.playSoundViaBluetooth(payLoad);
    }
}
