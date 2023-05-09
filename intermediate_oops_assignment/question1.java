package intermediate_oops_assignment;

class Singleton {
    private static Singleton singleInstance = null;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }

        return singleInstance;
    }
}

class Dummy extends Singleton {
    // This will give error as Singleton class has private constructor
    // So we cannot inherit from a Singleton class
}

public class question1 {
    public static void main(String[] args) {
        Singleton singletonObj = Singleton.getSingleInstance();
    }
}
