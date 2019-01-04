package com.jike.chapter01;

public class Person {

	//��IHelloMessage��Ϊһ�����ԣ�������������ʺ���Ϣ
	private IHelloMessage helloMessage;

	
	public IHelloMessage getHelloMessage() {
		return helloMessage;
	}

	public void setHelloMessage(IHelloMessage helloMessage) {
		this.helloMessage = helloMessage;
	}
	
	//���ڵ���IHelloMessage�ӿ����û�����ʺ���Ϣ��
	//������ʺ���Ϣ����Spring�������ļ�������;���
	//1.�������ļ��з����person����HelloWorld��ʵ��ʱ���������Hello World��������Ϣ��
	//2.�������ļ��з����person����HelloChina��ʵ��ʱ���������Hello China��������Ϣ��
	public String sayHello() {
		return this.helloMessage.sayHello();
	}
}
