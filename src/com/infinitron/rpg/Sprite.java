package com.infinitron.rpg;

import android.graphics.Bitmap;

public class Sprite {

	private Bitmap bitmap;
	
	public Sprite(GridSpriteSheet spriteSheet, int index) {
		this.bitmap = spriteSheet.cut(index);
	}
	
	public Bitmap getImage() {
		return this.bitmap;
	}
}