package com.ngu_software.wbdb.modules;

import java.io.File;
import java.util.List;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Gallery {
	
	// just like FSTODO need to hard code path from USB.
	
	private List<Image> imgList;
	private static final File IMG_DIRECTORY = new File("~/nguyen/img/");
	
	public Gallery() {
		importPictures();
	}
	
	private void importPictures() {
		if (IMG_DIRECTORY.isDirectory()) {
			File[] imgArr = IMG_DIRECTORY.listFiles();
			for (File imgFile : imgArr) {
				imgList.add(new Image("File:" + imgFile.toString()));
			}
		}
	}

}
