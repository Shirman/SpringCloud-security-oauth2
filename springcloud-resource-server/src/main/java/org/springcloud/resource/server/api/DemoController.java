package org.springcloud.resource.server.api;



import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("demo")
public class DemoController {

	@RequestMapping(method = GET)
	public Map<String, String> getTest() {
		Map<String, String> map = new HashMap<>();
		map.put("data", "unprotected_data");
		return map;
	}

}