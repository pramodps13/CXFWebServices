package com.psp.jaxws.cxf.endpoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.codenotfound.services.helloworld.Person;
import com.psp.jaxws.cxf.client.HelloWorldClient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/context-requester.xml" })
public class HelloWorldImplIT {

	@Autowired
	private HelloWorldClient helloWorldClientBean;

	@Test
	public void testSayHello() {
		Person person = new Person();
		person.setFirstName("John");
		person.setLastName("Doe");

		assertEquals("Hello John Doe!", helloWorldClientBean.sayHello(person));
	}
}
