package localize;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class LocalizerTest {

	private Localizer myLocation = new Localizer();

	// @Test
	public void localizerReturnLocation() {
		assertThat(myLocation.returnLocation(), containsString("long:"));
	}

}