package jcode.ch_05_multithreading.q_21_threadlocal;

public class ThreadLocal_01 {
    public static void main(String[] args) {
        ThreadLocalWithUserContext firstUser = new ThreadLocalWithUserContext("a");
        ThreadLocalWithUserContext secondUser = new ThreadLocalWithUserContext("b");
        new Thread(firstUser).start();
        new Thread(secondUser).start();
    }
}

class Context {
    private String userName;

    public Context(String userName) {
        this.userName = userName;
    }
}

class ThreadLocalWithUserContext implements Runnable {

    private static ThreadLocal<Context> userContext = new ThreadLocal<>();
    private String userName;

    @Override
    public void run() {
        userContext.set(new Context(userName));
        System.out.println("thread context for given userId: "
                + userName + " is: " + userContext.get());
    }

    // standard constructor
    ThreadLocalWithUserContext(String userName) {
        this.userName = userName;
    }
}
