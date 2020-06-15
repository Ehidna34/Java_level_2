public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        Cat cat = new Cat();
        Robot robot = new Robot();

        System.out.println("Человек подпрыгнул на высоту " + person.getJump() + " метров и пробежал: " + person.getRun() + " метров.");
        System.out.println("Кот подпрыгнул на высоту " + cat.getJump() + " метров и пробежал: " + cat.getRun() + " метров.");
        System.out.println("Робот подпрыгнул на высоту " + robot.getJump() + " метров и пробежал: " + robot.getRun() + " метров.");
    }
}
