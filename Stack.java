
    int pop()
    {
        if(top==-1)
        {
        return -9999;
        }
        else
        {
        return arr[top--];
        }
    }
    int 
    
    int pack()
    {
        if(top!= -1)
        {
        return arr[top];
        }
        else
        {
        return -9999;
        }
    }
    public class Stack
    {
        public static void main(String[] args)
         {
            stack obj=new stack(5);
            obj.push(5);
            obj.push(7);
            obj.push(9);
            System.out.println(obj.pop());
            System.out.println(obj.peek());

            
        }
    }


    

