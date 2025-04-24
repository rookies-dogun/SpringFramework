package myspring.di.xml;


// Assertions 에 포함된 모든 static method 를 import
// static method 가 아닌 경우에는?
// static 이 안붙고 그냥 import인 경우에는 Assertion에 static 이 있어도 부르지 않는지?
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloJunitTest {

	
	@Test
	void helloBean() {
		// 1. Container 객체 생성
		ApplicationContext context = new GenericXmlApplicationContext("classpath:hello-di.xml");
		
		// 2. Container 객체가 생성한 Spring Bean 을 요청 ( name = xml의 bean id )
		Hello helloById = (Hello)context.getBean("hello");
		
		Hello helloByType = context.getBean("hello", Hello.class);
		
		// 주소 비교 (singleton 확인)
		System.out.println(helloById == helloByType);
//		assertSame(helloById, helloByType);		
		
		
	}
	
}
