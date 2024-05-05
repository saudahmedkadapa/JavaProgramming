enum Year{
    JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUST,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER;
}




public class MyEnum1 {
    public static void main(String[] args) {
        for(Year obj :Year.values())
        {
              System.out.println(obj);
        }
      
       
       
    }
    
}
