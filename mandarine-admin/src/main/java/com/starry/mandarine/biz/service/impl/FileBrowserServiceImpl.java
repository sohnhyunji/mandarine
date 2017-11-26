package com.starry.mandarine.biz.service.impl;

import org.springframework.stereotype.Service;

import com.starry.mandarine.biz.domain.FileBrowser;
import com.starry.mandarine.biz.service.FileBrowserService;

@Service
public class FileBrowserServiceImpl implements FileBrowserService{

	@Override
	public FileBrowser getFileBrowser() {
		FileBrowser fileBrowser = new FileBrowser();
		return fileBrowser;
	}

}
