package examples.optional;

import java.util.Optional;

public class OptionaUtil {

	public OptionaUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> a = Optional.of("a");
		// assertEquals("a", a.get());
		
		Optional emptyOptional = Optional.empty();
		Optional alsoEmpty = Optional.ofNullable(null);
	
		// assertFalse(emptyOptional.isPresent());
		// a is defined above
		//assertTrue(a.isPresent());
		
		//assertEquals("b", emptyOptional.orElse("b"));
		//assertEquals("c", emptyOptional.orElseGet(() -> "c"))
		
	}

	
}