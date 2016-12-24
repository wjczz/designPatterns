package com.pattern.decorator;

/**
 * @Description: ��ʽ����־
 * @author:wjc
 *
 * @date:2016��12��24��
 */
public class SpaceDecorator extends LogDecorator {

	@Override
	public void log(String content){
		content = "\r\n***********************\r\n" + content
				+ "\r\n***********************\r\n";
		componentLog.log(content);
	}
}
