package org.lionsoul.tankwar.model;

import java.awt.Image;

/**
 * Wall for the map . <br />
 */
public class Wall {
	//地图上的墙壁类
	
	public static final int GRASS_WALL = 0;
	public static final int WOOD_WALL = 1;
	public static final int BRICK_WALL = 2;
	public static final int IRON_WALL = 3;
	
	private Image image = null;
	private int type;
	private int x;
	private int y;
	private int rows;
	private int cols;
	private int serial;
	private boolean alive = true;
	
	/**
	 * construct method . <br />
	 * 
	 * @param	image
	 * @param	t
	 * @param	x
	 * @param	y
	 * @param	cols
	 * @param	rows
	 */
	public Wall( Image image, int t, int serial, int x, int y, int cols, int rows ) {
		this.image = image;
		this.type = t;
		this.serial = serial;
		this.x = x;
		this.y = y;
		this.rows = rows;
		this.cols = cols;
	}
	
	public Image getImage() {
		return image;
	}

	public int getType() {
		return type;
	}

	public void setType(int t) {
		this.type = t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void setAlive( boolean alive ) {
		this.alive = alive;
	}
	
	public void setSerial( int serial ) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return serial;
	}
	
	/**
	 * check the wall is could be broken by the bullets . <br />
	 * 
	 * @param	b
	 */
	//该方法检验子弹是否可以粉碎墙壁
	public boolean couldSmash( Bullet b ) {
		switch ( type ) {
		case GRASS_WALL: return false;
		case WOOD_WALL:
		case BRICK_WALL:
			return true;
		case IRON_WALL:
			if ( b.getType() == Bullet.MISSILE_BULLET ) return true;
			return false;
		}
		
		return false;
	}
}
