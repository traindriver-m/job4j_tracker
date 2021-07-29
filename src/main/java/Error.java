public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void printInfo() {
        System.out.println("Наличие ошибки: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Описание ошибки: " + message);
    }

    public static void main(String[] args) {
        Error absence = new Error();
        Error memory = new Error(true, 2, "Out of memory.");
        Error disc = new Error(true, 4, "Low disc space.");
        Error empty = new Error(false, 10, "Disc empty.");
        absence.printInfo();
        memory.printInfo();
        disc.printInfo();
        empty.printInfo();
    }
}
