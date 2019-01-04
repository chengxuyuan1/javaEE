package com.jike.chapter01;

public class HelloWorld implements IHelloMessage{
	
	//�̳к�ʵ����IHelloMessage�ӿ��е�sayHello������
	//���������Hello China����Ϣ
	@Override
	public String sayHello() {
		return "Hello World!";
	}

}
