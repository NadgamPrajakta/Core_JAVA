package basics;

class ChatUser extends Thread {
    String user;

    ChatUser(String user) {
        this.user = user;
    }

    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println(user + " sent message " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        ChatUser u1 = new ChatUser("Alice");
        ChatUser u2 = new ChatUser("Bob");

        u1.start();
        u2.start();
    }
}
