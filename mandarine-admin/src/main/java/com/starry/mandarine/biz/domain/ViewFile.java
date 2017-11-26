package com.starry.mandarine.biz.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class ViewFile implements Serializable{
	
	private static final long serialVersionUID = -4076595447887669709L;

	/**
	 * 출력 파일 타입
	 */
	private ViewFileType viewFileType;
	
	/**
	 * 파일명
	 */
	private String fileName;
	
	/**
	 * 파일 경로
	 */
	private String filePath;
	
	/**
	 * 파일 수정일
	 */
	private long fileModified;
	
	/**
	 * 파일 크기
	 */
	private long fileSize;

}
