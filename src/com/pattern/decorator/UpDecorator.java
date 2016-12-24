package com.pattern.decorator;

/**
 * @Description: 把日志里的小写字符改成大写
 * @author:wjc
 *
 * @date:2016年12月24日
 */
public class UpDecorator extends LogDecorator {

	@Override
	public void log(String content){
		content = content.toUpperCase();
		componentLog.log(content);
	}
	
}
