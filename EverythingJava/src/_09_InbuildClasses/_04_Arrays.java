package _09_InbuildClasses;

import java.util.Arrays;

public class _04_Arrays {
	public static boolean isDigitLog(String log)
    {
        int firstSpace = log.indexOf(' ');
        return (Character.isDigit(log.charAt(firstSpace+1)));
    }

	public static void main(String[] args) {
		
		String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"};
		Arrays.sort(logs, (o1,o2)->{
			if(isDigitLog(o1)||isDigitLog(o2))
			{
				if(isDigitLog(o1)&&isDigitLog(o2))
					return 0;
				else if(isDigitLog(o1))
					return 1;
				else
					return -1;
			}

			int d=  o1.substring(o1.indexOf(' ')+1).compareTo(o2.substring(o2.indexOf(' ')+1));

			if(d!=0)
				return d;

			return o1.compareTo(o2);

		});
		
		
		System.out.println(Arrays.toString(logs));
		
	}
}
