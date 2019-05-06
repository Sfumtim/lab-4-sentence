package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import demo.service.SentenceService;

@RestController
public class SentenceController {
	@Autowired
	RestTemplate template;
	@Autowired
	SentenceService sentenceService;

	/**
	 * Display a small list of Sentences to the caller:
	 */
	@GetMapping("/sentence")
	public @ResponseBody String getSentences() {
		return "<h3>Some Sentences</h3><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>"
				+ sentenceService.buildSentence() + "<br/><br/>" + sentenceService.buildSentence() + "<br/><br/>";
	}
//
//	@GetMapping("/sentence")
//	  public @ResponseBody String getSentence() {
//	    return 
//	      getWord("LAB-4-SUBJECT") + " "
//	      + getWord("LAB-4-VERB") + " "
//	      + getWord("LAB-4-ARTICLE") + " "
//	      + getWord("LAB-4-ADJECTIVE") + " "
//	      + getWord("LAB-4-NOUN") + "."
//	      ;
//	  }
//
//	public String getWord(String service) {
//		return template.getForObject("http://" + service, String.class);
//	}
}
