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
        System.out.println("Perform Stack Operations");
        while (true) 
        { 
            String opr = s.next();
            switch(opr)
            {
                case "pop":
                    try
                    {
                        Integer popped = intS.pop();
                        System.out.println("Popped: " + popped);
                    }
                    catch(EmptyStackException ex)
                    {
                        System.out.println("Stack is Empty.");
                    }
                    break;
                case "size":
                    System.out.println("Stack Size: " + intS.size());
                    break;
                case "isEmpty":
                    System.out.println(intS.isEmpty() ? "Stack is empty." : "Stack is not empty.");
                    break;
                case "Quit":
                    System.out.println("Program Exited!");
                    return;
                default:
                    System.out.println("Invalid input.");
            }
        }
    }
}