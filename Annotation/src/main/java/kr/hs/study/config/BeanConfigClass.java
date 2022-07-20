package kr.hs.study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.hs.study.beans.DataBean1;
import kr.hs.study.beans.DataBean2;
import kr.hs.study.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	@Bean(name="d1")
	public DataBean1 d1() {
		DataBean1 data1 = new DataBean1();
		return data1;
	}
	
	@Bean(name="d2")
	public DataBean2 d2() {
		DataBean2 data2 = new DataBean2();
		return data2;
	}
	
	@Bean
	public TestBean1 t1() {
		return new TestBean1();
	}
}
