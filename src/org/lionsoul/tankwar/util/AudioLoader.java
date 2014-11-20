package org.lionsoul.tankwar.util;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.InputStream;

public class AudioLoader {

	// “Ù¿÷◊ ‘¥º”‘ÿ∆˜

	/**
	 * load audio . <br />
	 * 
	 * @param _file
	 * @return AudioClip
	 */
	public static AudioClip loadAudio(String _file) {
		return Applet.newAudioClip(AudioLoader.class.getResource("/res/sound/"
				+ _file));
	}

	public static InputStream getAudioAsStream(String _file) {
		return AudioLoader.class.getResourceAsStream("/res/sound/" + _file);
	}
}
