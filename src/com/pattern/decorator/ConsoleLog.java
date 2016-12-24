package com.pattern.decorator;

/**
 * @Description: 控制台打印日志
 * @author:wjc
 *
 * @date:2016年12月24日
 */
public class ConsoleLog implements ILog {

	@Override
	public void log(String content) {
		// TODO Auto-generated method stub
		System.out.println("控制台打印:"+content);
	}

}
