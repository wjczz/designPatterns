package com.pattern.decorator;

/**
 * @Description: ����̨��ӡ��־
 * @author:wjc
 *
 * @date:2016��12��24��
 */
public class ConsoleLog implements ILog {

	@Override
	public void log(String content) {
		// TODO Auto-generated method stub
		System.out.println("����̨��ӡ:"+content);
	}

}
