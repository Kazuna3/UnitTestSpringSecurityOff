package samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import samples.form.SampleForm;
import samples.service.SampleService;

@Controller
@RequiredArgsConstructor
public class MainController {

	private final SampleService ss;

	@GetMapping
	public String index(Model model) {

		model.addAttribute("sampleForm", new SampleForm());
		return "index";

	}

	@PostMapping("input")
	public String input(
		@Valid SampleForm sampleForm,
		BindingResult result,
		Model model
	) {

		if (result.hasErrors()) {

			return "index";

		}

		int textLength = ss.lengthOfSampleService(sampleForm.getText());
		model.addAttribute("textLength", textLength);
		model.addAttribute("integer", sampleForm.getInteger());
		return "input";

	}

}
