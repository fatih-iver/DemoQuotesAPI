package com.demo.quotes;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class QuoteController {

	private final QuoteService quoteService;

	@GetMapping("/quotes/{quoteId}")
	public String retrieveQuote(@PathVariable Integer quoteId) {
		return quoteService.retrieveQuote(quoteId);
	}

}
