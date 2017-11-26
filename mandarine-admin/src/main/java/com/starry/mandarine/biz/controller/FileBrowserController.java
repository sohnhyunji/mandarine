package com.starry.mandarine.biz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.starry.mandarine.biz.domain.FileBrowser;
import com.starry.mandarine.biz.service.FileBrowserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController //responseBody
@RequestMapping("/fileBrowser")
public class FileBrowserController {
	
	@Autowired
	FileBrowserService fileBrowserService;
	
	@GetMapping //@RequestMapping(method = RequestMethod.GET)
	public FileBrowser fileBrowser() {
		log.debug("/fileBrowser 확인!!!!");	
		FileBrowser getFileBrowser = fileBrowserService.getFileBrowser();
		return getFileBrowser;
	}

}
