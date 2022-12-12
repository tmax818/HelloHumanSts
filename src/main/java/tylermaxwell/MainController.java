package tylermaxwell;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@RequestMapping("/")
	public String index(@RequestParam(value="fname", required=false, defaultValue="Human") String fname,
			@RequestParam(value="lname", required=false, defaultValue="") String lname,
			@RequestParam(value="times", required=false, defaultValue="1") Integer times) {
		String str = ("Hello " + fname + " " +  lname+ " ");
		if(times>1) {
			str += ("Hello " + fname + " " +  lname);
		}
		return str;
	}
}
