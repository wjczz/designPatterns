package com.pattern.decorator.test;

import com.pattern.decorator.ConsoleLog;
import com.pattern.decorator.FileLog;
import com.pattern.decorator.SpaceDecorator;
import com.pattern.decorator.UpDecorator;

/**
 * 
 * @Description: װ��ģʽ������
 * @author:wjc
 *
 * @date:2016��12��24��
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * ��Ϣ��־װ��ģʽdemo
		 */
		ConsoleLog clog = new ConsoleLog();
		FileLog flog = new FileLog();
		
		UpDecorator up = new UpDecorator();
		SpaceDecorator space = new SpaceDecorator();
		
		//����̨��ӡ,����������ж������,����־����ְ��
		up.setComponentLog(clog);
		space.setComponentLog(up);
		space.log("marry christmas!");
		
		//�ļ���ӡ
		up.setComponentLog(flog);;
//		up.setComponentLog(space);
		up.log("marry christmas too!");
	}

}
