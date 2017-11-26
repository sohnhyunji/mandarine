package com.starry.mandarine.biz.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class FileBrowser implements Serializable {
	
	private static final long serialVersionUID = -7973229445635808764L;

	List<ViewDirectory> viewDirectoryList;
	List<ViewFile> viewFileList;
}
