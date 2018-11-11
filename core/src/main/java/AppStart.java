import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Desc
 * @LastPeson xuxu
 **/
@SpringBootApplication
@ComponentScan("com.step.*")
@MapperScan("com.step.demo.mapper")
public class AppStart {

    public static void main(String[] args){

        SpringApplication.run(AppStart.class);

    }

}
