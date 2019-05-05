package demo.service;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demo.dao.AdjectiveClient;
import demo.dao.ArticleClient;
import demo.dao.NounClient;
import demo.dao.SubjectClient;
import demo.dao.VerbClient;
import demo.dao.WordDao;

@Service
public class SentenceServiceImpl implements SentenceService {
//	private WordDao verbService;
	private VerbClient verbClient;
//	private WordDao subjectService;
	private SubjectClient subjectClient;
//	private WordDao articleService;
	private ArticleClient articleClient;
//	private WordDao adjectiveService;
	private AdjectiveClient adjectiveClient;
	private WordDao nounService;
	private NounClient nounClient;

//	/**
//	 * Assemble a sentence by gathering random words of each part of speech:
//	 */
//	public String buildSentence() {
//		String sentence = "There was a problem assembling the sentence!";
////		String subject = subjectService.getWord().getString();
//		sentence = String.format("%s %s %s %s %s.", subjectService.getWord(), // .getString(),
//				verbService.getWord(), // .getString(),
//				articleService.getWord(), // .getString(),
//				adjectiveService.getWord(), // .getString(),
////				nounService.getWord());//.getString() );
//				nounClient.getWord()+" Feign Version");// .getString() );
//		return sentence;
//	}
	
	/**
	 * Assemble a sentence by gathering random words of each part of speech:
	 */
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
//		String subject = subjectService.getWord().getString();
		sentence = String.format("%s %s %s %s %s.", subjectClient.getWord(), // .getString(),
				verbClient.getWord(), // .getString(),
				articleClient.getWord(), // .getString(),
				adjectiveClient.getWord(), // .getString(),
//				nounService.getWord());//.getString() );
				nounClient.getWord());// .getString() );
		return sentence;
	}


//	@Autowired
//	public void setVerbService(WordDao verbService) {
//		this.verbService = verbService;
//	}
//
//	@Autowired
//	public void setSubjectService(WordDao subjectService) {
//		this.subjectService = subjectService;
//	}
//
//	@Autowired
//	public void setArticleService(WordDao articleService) {
//		this.articleService = articleService;
//	}
//
//	@Autowired
//	public void setAdjectiveService(WordDao adjectiveService) {
//		this.adjectiveService = adjectiveService;
//	}
//
//	@Autowired
//	public void setNounService(WordDao nounService) {
//		this.nounService = nounService;
//	}

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

	@Autowired
	public void setNounService(WordDao nounService) {
		this.nounService = nounService;
	}
	
	

}
