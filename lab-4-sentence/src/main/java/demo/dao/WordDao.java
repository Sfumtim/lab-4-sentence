package demo.dao;

import demo.domain.Word;

public interface WordDao {
	static final String SUBJECT = "LAB-4-SUBJECT";
	static final String VERB = "LAB-4-VERB";
	static final String ARTICLE = "LAB-4-ARTICLE";
	static final String ADJECTIVE = "LAB-4-ADJECTIVE";
	static final String NOUN = "LAB-4-NOUN";

	String getWord();
}
