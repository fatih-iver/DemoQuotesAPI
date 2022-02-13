package com.demo.quotes;

import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class QuoteService {

	private final Map<Integer, String> QUOTES_MAP = Map.of(
			1, "It’s not a bug – it’s an undocumented feature. (Anonymous)",
			2, "One man’s crappy software is another man’s full-time job. (Jessica Gaston)",
			3, "It works on my machine",
			4, "Any non-trivial program contains at least one bug.",
			5, "Premature optimization is the root of all evil in programming."
	);

	@Log
	public String retrieveQuote(Integer quoteId) {
		if (quoteId < 0) {
			throw new IllegalArgumentException("Quote id cannot be negative!");
		}
		return QUOTES_MAP.get(quoteId);
	}

}
