class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
         this.password=pass;
    }

}






public class AccessModifier {
    public static void main(String[] args) {
        Account account1=new Account();
        account1.name="Saud ahmed";
        account1.email="abc@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
    
}
