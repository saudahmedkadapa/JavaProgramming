 class TestThreadDemo 
{
    public static void main(String[] args) {
        try {
            Fibonacci fib = new Fibonacci(); /// fib is an object of Fibonacci ==>new
            fib.start();// runnable state
            Thread.sleep(400000);// waiting state
            // Reverse rev = new Reverse();
            // rev.start();
        } catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }

}