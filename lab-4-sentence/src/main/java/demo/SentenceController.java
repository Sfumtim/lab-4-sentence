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
		return "<h3>Some Sentences</h3><br/>" + buildSentence() + "<br/><br/>" + buildSentence() + "<br/><br/>"
				+ buildSentence() + "<br/><br/>" + buildSentence() + "<br/><br/>" + buildSentence() + "<br/><br/>";
	}

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence = String.format("%s %s %s %s %s.", sentenceService.fetchSubject(), sentenceService.fetchVerb(),
				sentenceService.fetchArticle(), sentenceService.fetchAdjective(), sentenceService.fetchNoun());
		return sentence;
	}

}
