package demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import demo.dao.AdjectiveClient;
import demo.dao.ArticleClient;
import demo.dao.NounClient;
import demo.dao.SubjectClient;
import demo.dao.VerbClient;

@Service
public class SentenceServiceImpl implements SentenceService {
	private VerbClient verbClient;
	private SubjectClient subjectClient;
	private ArticleClient articleClient;
	private AdjectiveClient adjectiveClient;
	private NounClient nounClient;

	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence = String.format("%s %s %s %s %s.", fetchSubject(), fetchVerb(), fetchArticle(), fetchAdjective(),
				fetchNoun());
		return sentence;
	}

	@HystrixCommand(fallbackMethod = "getFallbackSubject")
	public String fetchSubject() {
		String subject = subjectClient.getWord();
		return subject;
	}

	public String getFallbackSubject() {
		return "Simeon";
	}

	@HystrixCommand(fallbackMethod = "getFallbackVerb")
	public String fetchVerb() {
		String verb = verbClient.getWord();
		return verb;
	}

	public String getFallbackVerb() {
		return "coupe";
	}

	@HystrixCommand(fallbackMethod = "getFallbackArticle")
	public String fetchArticle() {
		String article = articleClient.getWord();
		return article;
	}

	public String getFallbackArticle() {
		return "la";
	}

	@HystrixCommand(fallbackMethod = "getFallbackAdjective")
	public String fetchAdjective() {
		String verb = adjectiveClient.getWord();
		return verb;
	}

	public String getFallbackAdjective() {
		return "pompeuse";
	}

	@HystrixCommand(fallbackMethod = "getFallbackNoun")
	public String fetchNoun() {
		String verb = nounClient.getWord();
		return verb;
	}

	public String getFallbackNoun() {
		return "petite";
	}

	@Autowired
	public void setNounClient(NounClient nounClient) {
		this.nounClient = nounClient;
	}

	@Autowired
	public void setVerbClient(VerbClient verbClient) {
		this.verbClient = verbClient;
	}

	@Autowired
	public void setSubjectClient(SubjectClient subjectClient) {
		this.subjectClient = subjectClient;
	}

	@Autowired
	public void setArticleClient(ArticleClient articleClient) {
		this.articleClient = articleClient;
	}

	@Autowired
	public void setAdjectiveClient(AdjectiveClient adjectiveClient) {
		this.adjectiveClient = adjectiveClient;
	}

}
