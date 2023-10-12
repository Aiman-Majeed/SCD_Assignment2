import java.util.*;

class GenericStack<T>
{
    public Stack<T> stack = new Stack<>();
    public void push(T item)
    {
        stack.push(item);
    }
    public T pop()
    {
        if(isEmpty() )
        {
            throw new EmptyStackException();
        }
        return stack.pop();
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }
    public int size()
    {
        return stack.size();
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Stack Size: ");
        int size = s.nextInt();
        GenericStack<Integer> intS = new GenericStack<>();
        GenericStack<String> strS = new GenericStack<>();

        System.out.println("Enter Stack Values");
        for(int i = 0; i < size; i++)
        {
            if(s.hasNextInt())
            {
                intS.push(s.nextInt());
            }
            else
            {
                String in = s.next();
                strS.push(in);
            }
        }
    }
}