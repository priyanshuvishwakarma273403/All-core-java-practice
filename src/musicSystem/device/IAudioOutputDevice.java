package musicSystem.device;

import musicSystem.models.Song;

public interface IAudioOutputDevice {
    void playAudio(Song song);
}
