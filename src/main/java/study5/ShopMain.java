package study5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShopMain {

		public static void main(String[] args) {
			ApplicationContext context=
					new ClassPathXmlApplicationContext("shopContext2.xml");
			
			ShopController shop1=(ShopController)context.getBean("myshop");
			shop1.add("Ű??",3200);
			shop1.add("????",4500);
			shop1.delete("????");
			}
}
