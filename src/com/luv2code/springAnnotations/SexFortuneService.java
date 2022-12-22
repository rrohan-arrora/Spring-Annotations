package com.luv2code.springAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SexFortuneService implements FortuneService {

	public String getLuckySexDay() {
		return "Today is the lucky day for enough sex";

	}

}
