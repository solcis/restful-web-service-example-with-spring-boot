package it.begear.RESTfulWebService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController marks class as controller, where every method returns a domain object instead of a view
//shorthand for @Controller and @ResponseBody
@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@Request Mapping -> ensures HTTP requests to /greeting are mapped to  greeting()
    //maps all HTTP operations by default -> (GET, POST, PUT, etc) @RequestMapping(method=GET) to narrow this mapping
    //@RequestParam binds value of query string parameter 'name' into name parameter of greeting(), if no 'name' parameter -> defaultValue
    //this RESTful web service controller populates and returns a Greeting object. The object data will be written directly to the HTTP response as JSON
    @RequestMapping("/greeting")       
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
}
