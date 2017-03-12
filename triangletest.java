package java2;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class triangletest {

	private int a;
    private int b;
    private int c;
    private String expected;
    
    public triangletest(int a,int b, int c, String expected){
        this.a = a;
        this.b = b;
        this.c = c;
        this.expected= expected;
        
        }
    
    @Parameters
    public static Collection<Object[]> getData(){
    return Arrays.asList(new Object[][]{
    {6,6,6,"等边三角形"},
    {3,4,5,"一般三角形"},
    {6,7,7,"等腰三角形"},
    {1,2,3,"无法构成三角形"}
    });
    }

	@Test
	public void test() {
		assertEquals(this.expected,S123.triangle(a,b,c));

	}

}
