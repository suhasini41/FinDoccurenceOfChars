package package1;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfOccurenceOfCharsInAString {

	private  String findOccurence(String s) {
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i],map.getOrDefault(ch[i], 0)+1);
		}
		String mapstr = map.toString();
		return mapstr;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("a=1"));
	}
	@Test
	public void testCase2()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("u=1"));
	}
	@Test
	public void testCase3()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("n=1"));
	}
	@Test
	public void testCase4()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("h=1"));
	}
	@Test
	public void testCase5()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("s=2"));
	}
	@Test
	public void testCase6()
	{
		Assert.assertTrue(findOccurence("suhasini").contains("i=2"));
	}

}
