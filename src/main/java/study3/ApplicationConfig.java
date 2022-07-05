package study3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration //스프링설정에 사용되는 클래스
@Component //xml에 자동으로 bean을 등록해준다
public class ApplicationConfig {
	
	@Bean 
	public Person person3() //메서드명이 id로 인식
	{
		List<String> hobby = new ArrayList<String>();
				hobby.add("알까기");
				hobby.add("술래잡기");
				hobby.add("말타기");
		Person p=new Person(hobby);
		p.setAddress("미국 LA");
		return p;
	}
}
