package org.lionsoul.tankwar.util;

import javax.swing.ImageIcon;

public class ImageLoader {

	// ͼ����Դ������

	/**
	 * load the image from the resource directory . <br />
	 * 
	 * @param _file
	 * @return ImageIcon
	 */
	public static ImageIcon loadImageIcon(String _file) {
		return new ImageIcon(ImageLoader.class.getResource("/res/image/"
				+ _file));
	}
}
