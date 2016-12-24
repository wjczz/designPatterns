package com.pattern.decorator;

/**
 * 
 * @Description: 日志装饰抽象类
 * @author:wjc
 *
 * @date:2016年12月24日
 */
public abstract class LogDecorator implements ILog{

	protected ILog componentLog;

	public ILog getComponentLog() {
		return componentLog;
	}

	public void setComponentLog(ILog componentLog) {
		this.componentLog = componentLog;
	}
	
}
