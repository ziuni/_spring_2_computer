package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;

public class ClassMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext atx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 BCC1 = atx.getBean("t1", TestBean1.class);
		System.out.println("d1 : " + BCC1.getData1() + "   d2 : " + BCC1.getData2());
		
		atx.close();
	}

}
