package com.pattern.decorator;

public class FileLog implements ILog {

	@Override
	public void log(String content) {
		// TODO Auto-generated method stub
		System.out.println("�ļ���¼��־:"+content);
	}

}
