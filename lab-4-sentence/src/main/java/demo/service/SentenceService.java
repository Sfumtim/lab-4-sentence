package demo.service;

import org.springframework.stereotype.Service;

/**
 * Describes a demo.service that will build a sentence, somehow, some way.
 */
@Service
public interface SentenceService {

	public String buildSentence();

}