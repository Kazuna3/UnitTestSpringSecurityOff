package samples.service;

import org.springframework.stereotype.Service;

/**
 * ControllerにDIする対象。
 * 実装自体に意味はない。
 */
@Service
public class SampleService {

	public int lengthOfSampleService(String target) {

		return target.length();

	}

}
