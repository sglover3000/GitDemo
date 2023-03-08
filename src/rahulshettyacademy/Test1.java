package rahulshettyacademy;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 {
	
	public void streamMap()
	{
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
	}
	
}
