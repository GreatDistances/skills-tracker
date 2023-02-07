package org.launchcode.skillstracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping("")


@SpringBootApplication
public class SkillsTrackerApplication {

	@GetMapping("form")
	public String languageForm() {
		return "<html>" +
				"<body>" +
				"<form action = '/form/results' method = 'post'>" + // submit a request to /form
				"<label for='yourName'> Name: </label>" +
				"<br>" +
				"<input type = 'text' name = 'name'>" +
				"<p>" +
				"<label for='first'> My favorite language: </label>" +
				"<br>" +
				"<select id='first' name='first' path='firstLanguage'>" +
					"<option value='Java'>Java</option>" +
					"<option value='JavaScript'>JavaScript</option>" +
					"<option value='C#'>C#</option>" +
					"<option value='Python'>Python</option>" +
				"</select>" +
				"<br>" +
				"<label for='second'> My second favorite language: </label>" +
				"<br>" +
				"<select id='second' name='second' path='second'>" +
					"<option value='Java'>Java</option>" +
					"<option value='JavaScript'>JavaScript</option>" +
					"<option value='C#'>C#</option>" +
					"<option value='Python'>Python</option>" +
				"</select>" +
				"<br>" +
				"<label for='third'> My third favorite language: </label>" +
				"<br>" +
				"<select id='third' name='third' path='third'>" +
					"<option value='Java'>Java</option>" +
					"<option value='JavaScript'>JavaScript</option>" +
					"<option value='C#'>C#</option>" +
					"<option value='Python'>Python</option>" +
				"<br>" +
				"</select>" +
				"<p>" +
				"<input type = 'submit' value = 'Submit' >" +
				"</form>" +
				"</body>" +
				"</html>";
	}

/*	@PostMapping("form")
	//@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String resultsWithQueryParam(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
		return "<html>" +
				"<body>" +
				"<h1>" + name + "</h1>" +
				"<ol>" +
					"<li>" + first + "</li>" +
					"<li>" + second + "</li>" +
					"<li>" + third + "</li>" +
				"<ol>" +
				"</body>" +
				"</html>";
	}*/

	@PostMapping("/form/results")
	//@RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
	public String resultsWithQueryParam(@RequestParam String name, @RequestParam String first, @RequestParam String second, @RequestParam String third) {
		return "<html>" +
				"<style>" +
				"table, th, td {" +
					"border:1px solid black;" +
				"}" +
				"</style>" +
				"<body>" +
				"<h1>" + name + "</h1>" +
				"<table style='width:30%'>" +
				"<tr>" +
						"<th>Favorite Language</th>" +
						"<th>2nd Favorite Language</th>" +
						"<th>3rd Favorite Language</th>" +
				"</tr>" +
				"<tr>" +
					"<td> &nbsp"  + first + "</td>" +
					"<td> &nbsp" + second + "</td>" +
					"<td> &nbsp" + third + "</td>" +
				"</tr>" +
				"</body>" +
				"</html>";
	}

		public static void main (String[]args){
			SpringApplication.run(SkillsTrackerApplication.class, args);
		}

	}