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

    }
}