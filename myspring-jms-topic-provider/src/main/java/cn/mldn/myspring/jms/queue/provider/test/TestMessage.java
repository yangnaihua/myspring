package cn.mldn.myspring.jms.queue.provider.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.jms.queue.provider.service.IMessageProvider;

public class TestMessage {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-*.xml") ;
		IMessageProvider mp = context.getBean("messageProviderImpl",IMessageProvider.class) ;
		mp.sendMessage("世界很和平，哈哈哈");
	}
}
