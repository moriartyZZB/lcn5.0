package cn.moriartyzzb.lcn.tm;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
@EnableEurekaClient
@EnableTransactionManagerServer
public class TxManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TxManagerApplication.class, args);
    }

}
