import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Question2 //FirstNonRepeatingStream
{
    public LinkedHashMap<Character, Integer> count;
    public Set<Character> repeatedChar;
    public StringBuilder inBuffer;

    public Question2() //FirstNonRepeatingStream
    {
        count = new LinkedHashMap<>();
        repeatedChar = new HashSet<>();
        inBuffer = new StringBuilder();
    }

    public void add(char c)
    {
        if (repeatedChar.contains(c))
        {
            return;
        }

        count.compute(c, (key, value) -> (value == null) ? 1 : value + 1);
        inBuffer.append(c);

        if (count.get(c) == 1) 
        {
            repeatedChar.remove(c);
        }
        else
        {
            repeatedChar.add(c);
        }
    }
    public String getStream() 
    {
        return inBuffer.toString();
    }
    public char getFirstNonRepeating() 
    {
        for (Map.Entry<Character, Integer> e : count.entrySet()) 
        {
            if (e.getValue() == 1) 
            {
                return e.getKey();
            }
        }
        return '-';
    }

    public static void main(String[] args) 
    {
        Question2 st = new Question2();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a stream of characters: ");
        String input = s.nextLine();

        for (char c : input.toCharArray()) 
        {
            st.add(c);
        }
        System.out.println("Stream: " + st.getStream());
        System.out.println("First non-repeating character: " + st.getFirstNonRepeating());
        s.close();
    }
}
