interface father{
    float HT=6.2f;
    void height();
}
interface mother{
    float HT=5.6f;
    void height();

}

class child implements father,mother{
    public void height()
    {
        float HT = (father.HT + mother.HT)/2;
        System.out.println("child height" +HT);
    }
}

public class Interf
{

    public static void main(String[] args) {
        child ch=new child();
        ch.height();

        
    }
}