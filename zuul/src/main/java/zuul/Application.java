package zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created by Administrator on 2017/2/20.
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@RestController
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    @RequestMapping("/")
//    String home() {
//        return "Hello World!";
//    }
//
//    @RequestMapping("/registered")
//    public String getRegistered(){
//
//
//        for( String s :  discoveryClient.getServices()){
//            System.out.println("services " + s);
//            List<ServiceInstance> serviceInstances =  discoveryClient.getInstances(s);
//            for(ServiceInstance si : serviceInstances){
//                System.out.println("    services:" + s + ":getHost()=" + si.getHost());
//                System.out.println("    services:" + s + ":getPort()=" + si.getPort());
//                System.out.println("    services:" + s + ":getServiceId()=" + si.getServiceId());
//                System.out.println("    services:" + s + ":getUri()=" + si.getUri());
//                System.out.println("    services:" + s + ":getMetadata()=" + si.getMetadata());
//            }
//
//        }
//
//
//        return null;
//    }
}
