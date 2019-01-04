package com.jike.chapter01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class Main {

    public static void main(String[] args) {

    	//����FileSystemResource��ȡ�����ļ�
        Resource r = new FileSystemResource("helloMessage.xml");
        //����XmlBeanFactory�����������ļ�������IOC����
        BeanFactory f = new XmlBeanFactory(r);
        //��IOC�����л�ȡPerson���ʵ��
        Person person = (Person) f.getBean("person");
        //personʵ����������ʺ���Ϣ
        String s = person.sayHello();
        //��ϵͳ����̨�д�ӡ�ʺ���Ϣ�����������������ļ���������HelloWorld��ʵ����
        //���ԣ��������ӡ�����ַ�����HelloWorld
        System.out.println("The Person is currently saying: "+s);
    }

}
