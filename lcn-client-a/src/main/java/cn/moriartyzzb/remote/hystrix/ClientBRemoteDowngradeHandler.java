package cn.moriartyzzb.remote.hystrix;


import cn.moriartyzzb.remote.ClientBRemoteI;
import org.springframework.stereotype.Component;

@Component
public class ClientBRemoteDowngradeHandler implements ClientBRemoteI {

    @Override
    public Object add() {
        return "熔断处理";
    }
}
