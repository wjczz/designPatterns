package com.pattern.decorator;

public class FileLog implements ILog {

	@Override
	public void log(String content) {
		// TODO Auto-generated method stub
		System.out.println("文件记录日志:"+content);
	}

}
