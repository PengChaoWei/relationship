package chao.com.cn.relationship;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
/*@ServletComponentScan( basePackages = "chao.com.cn.relationship.*")  
@ComponentScan( basePackages = "chao.com.cn.relationship.*")  */
@SpringBootApplication
@MapperScan("chao.com.cn.relationship.dao")//将项目中对应的mapper类的路径加进来就可以了
public class RelationshipApplication {

	public static void main(String[] args) {
		SpringApplication.run(RelationshipApplication.class, args);
	}
}
