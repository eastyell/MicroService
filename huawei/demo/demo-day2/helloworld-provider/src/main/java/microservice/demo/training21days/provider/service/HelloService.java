package microservice.demo.training21days.provider.service;

import java.util.Date;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "hello")        // 鐠囥儲鏁炵憴锝咃紣閺勫氦绻栭弰顖欑娑撶寕EST閹恒儱褰涚猾浼欑礉CSEJavaSDK娴兼碍澹傞幓蹇撳煂鏉╂瑤閲滅猾浼欑礉閺嶈宓佺�瑰啰娈戞禒锝囩垳閻㈢喐鍨氶幒銉ュ經婵傛垹瀹�
@RequestMapping(path = "/provider/v0") // @RequestMapping閺勭柇pring閻ㄥ嫭鏁炵憴锝忕礉鏉╂瑩鍣烽崷銊ゅ▏閻⑩娍pring MVC妞嬪孩鐗稿锟介崣鎱燛ST閹恒儱褰�
public class HelloService {
  @RequestMapping(path = "/hello/{name}", method = RequestMethod.GET)
  public String sayHello(@PathVariable(value = "name") String name) {
    return "Hello," + name;
  }
  @PostMapping(path = "/greeting")
  public GreetingResponse greeting(@RequestBody Person person) {
    GreetingResponse greetingResponse = new GreetingResponse();

    if (Gender.MALE.equals(person.getGender())) {
      greetingResponse.setMsg("Hello, Mr." + person.getName());
    } else {
      greetingResponse.setMsg("Hello, Ms." + person.getName());
    }
    greetingResponse.setTimestamp(new Date());

    return greetingResponse;
  }

}
