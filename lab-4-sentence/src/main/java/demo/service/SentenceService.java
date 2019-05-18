package demo.service;

/**
 * Describes a demo.service that will build a sentence, somehow, some way.
 */
public interface SentenceService {

	public String fetchSubject();

	public String fetchVerb();

	public String fetchArticle();

	public String fetchAdjective();

	public String fetchNoun();

}