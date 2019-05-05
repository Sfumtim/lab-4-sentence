package demo.dao;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("lab-4-noun")
public interface NounClient {
	@GetMapping("/")
	public String getWord();
}
