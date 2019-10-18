package cn.moriartyzzb.remote;

import cn.moriartyzzb.remote.hystrix.ClientBRemoteDowngradeHandler;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description TODO
 * @Date 2019/10/18 14:38
 * @Created moriartyzzb
 */
@Component
@FeignClient(name = "LCN-CLIENT-B", fallback = ClientBRemoteDowngradeHandler.class)
public interface ClientBRemoteI {

    @GetMapping("/addUser")
    Object add();
}
