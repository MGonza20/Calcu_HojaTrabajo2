import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


class CalcuuTEST {

	@Test
	public void test() {
		CALCUpostfix test = new CALCUpostfix();
		
        
        String input = ("1 2 + 4 * 3 + ");
        
        String s1 = test.decifrador(input);
        double testCalcu = test.resolver(s1);
		
		assertEquals("15.0", testCalcu);
		

		

		
	}

}
