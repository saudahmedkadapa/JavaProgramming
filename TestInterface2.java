interface Bank {
    float rateOfInterest();
}

class SBI implements Bank {
    public float rateOfInterest() {
        return 9.15f;
    }
}

class PNB implements Bank {
    public float rateOfInterest() {
        return 9.7f;
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        // Bank b=new SBI();
        // Bank p=new PNB();
        SBI b = new SBI();
        PNB p = new PNB();
        System.out.println("SBI ROI: " + b.rateOfInterest());
        System.out.println("PNB ROI: " + p.rateOfInterest());
    }
}