package com.pattern.decorator;

/**
 * 
 * @Description: ��־װ�γ�����
 * @author:wjc
 *
 * @date:2016��12��24��
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
