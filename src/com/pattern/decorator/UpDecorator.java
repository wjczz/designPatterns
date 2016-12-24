package com.pattern.decorator;

/**
 * @Description: ����־���Сд�ַ��ĳɴ�д
 * @author:wjc
 *
 * @date:2016��12��24��
 */
public class UpDecorator extends LogDecorator {

	@Override
	public void log(String content){
		content = content.toUpperCase();
		componentLog.log(content);
	}
	
}
