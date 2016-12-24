package com.pattern.decorator;

/**
 * @Description: 格式化日志
 * @author:wjc
 *
 * @date:2016年12月24日
 */
public class SpaceDecorator extends LogDecorator {

	@Override
	public void log(String content){
		content = "\r\n***********************\r\n" + content
				+ "\r\n***********************\r\n";
		componentLog.log(content);
	}
}
