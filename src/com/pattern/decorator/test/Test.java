package com.pattern.decorator.test;

import com.pattern.decorator.ConsoleLog;
import com.pattern.decorator.FileLog;
import com.pattern.decorator.SpaceDecorator;
import com.pattern.decorator.UpDecorator;

/**
 * 
 * @Description: 装饰模式测试类
 * @author:wjc
 *
 * @date:2016年12月24日
 */
public class Test {

	public static void main(String[] args) {
		/**
		 * 消息日志装饰模式demo
		 */
		ConsoleLog clog = new ConsoleLog();
		FileLog flog = new FileLog();
		
		UpDecorator up = new UpDecorator();
		SpaceDecorator space = new SpaceDecorator();
		
		//控制台打印,可以随意进行对象组合,给日志增加职责
		up.setComponentLog(clog);
		space.setComponentLog(up);
		space.log("marry christmas!");
		
		//文件打印
		up.setComponentLog(flog);;
//		up.setComponentLog(space);
		up.log("marry christmas too!");
	}

}
