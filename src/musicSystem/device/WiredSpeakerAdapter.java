package musicSystem.device;

import musicSystem.external.WiredSpeakerAPI;
import musicSystem.models.Song;

public class WiredSpeakerAdapter implements IAudioOutputDevice{
    private WiredSpeakerAPI wiredApi;

    public WiredSpeakerAdapter(WiredSpeakerAPI wiredApi) {
        this.wiredApi = wiredApi;
    }

    @Override
    public void playAudio(Song song) {
        String payLoad = song.getTitle() + " By " + song.getArtist();
        wiredApi.playSoundViaCable(payLoad);

    }
}
