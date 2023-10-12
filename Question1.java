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
public class Question1 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Stack Size: ");
        int size = s.nextInt();
        GenericStack<Integer> intS = new GenericStack<>();
        GenericStack<String> strS = new GenericStack<>();
        GenericStack<Float> floatS = new GenericStack<>();

        System.out.println("Enter Stack Values");
        for(int i = 0; i < size; i++)
        {
            if(s.hasNextInt())
            {
                intS.push(s.nextInt());
            }
            else if(s.hasNextFloat())
            {
                floatS.push(s.nextFloat());
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
            String oper = s.next();
            switch(oper)
            {
                case "pop":
                    try
                    {
                        if (!intS.isEmpty()) 
                        {
                            System.out.println("Popped from Integer Stack: " + intS.pop());
                        } 
                        else if (!floatS.isEmpty())
                        {
                            System.out.println("Popped from Float Stack: " + floatS.pop());
                        } 
                        else
                        {
                            System.out.println("Popped from String Stack: " + strS.pop());
                        } 
                    }
                    catch(EmptyStackException ex)
                    {
                        System.out.println("Stack is Empty.");
                    }
                    break;
                case "size":
                    System.out.println("Stack Size: " + intS.size());
                    System.out.println("floatStack size: " + floatS.size());
                    System.out.println("stringStack size: " + strS.size());
                    break;
                case "isEmpty":
                    System.out.println(intS.isEmpty() ? "Integer Stack is empty." : "Integer Stack is not empty.");
                    System.out.println(floatS.isEmpty() ? "Float Stack is empty." : "Float Stack is not empty.");
                    System.out.println(strS.isEmpty() ? "String Stack is empty." : "String Stack is not empty.");
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