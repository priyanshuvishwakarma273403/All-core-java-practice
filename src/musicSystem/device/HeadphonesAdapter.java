package musicSystem.device;

import musicSystem.external.HeadphonesAPI;
import musicSystem.models.Song;

public class HeadphonesAdapter implements IAudioOutputDevice {
    private HeadphonesAPI headphonesAPI;

    public HeadphonesAdapter(HeadphonesAPI headphonesAPI) {
        this.headphonesAPI = headphonesAPI;
    }

    @Override
    public void playAudio(Song song) {
        String payLoad = song.getTitle() + " By " + song.getArtist();
        headphonesAPI.playSoundViaJack(payLoad);
    }
}
