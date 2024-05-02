package samples.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class SampleForm {

	@NotBlank
	@Size(max = 10)
	private String text;

	@Max(10)
	@Min(1)
	@NotNull
	private Integer integer;

}
