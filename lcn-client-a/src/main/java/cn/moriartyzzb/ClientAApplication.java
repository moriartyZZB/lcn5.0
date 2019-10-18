package cn.moriartyzzb;


import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@MapperScan("com.zzb.repository")
@EnableEurekaClient
@EnableDistributedTransaction
@EnableFeignClients(basePackages = {"cn.moriartyzzb.remote"})
public class ClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientAApplication.class, args);
    }

}
