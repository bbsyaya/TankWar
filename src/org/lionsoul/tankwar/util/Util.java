package org.lionsoul.tankwar.util;

import java.awt.Point;

public class Util {

	/**
	 * count the x and y Coordinate with its center coordinate and the its size. <br />
	 * 
	 * @param x
	 * @param y
	 * @param w
	 * @param h
	 */

	// ����ָ��λ��ָ�������ľ��ε��е�
	public static Point center(int x, int y, int w, int h) {
		return new Point(x - w / 2, y - h / 2);
	}
}