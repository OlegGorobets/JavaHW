/*
Создать класс Robot с параметрами: name, age, power
Реализовать метод boolean fight(Robot anotherRobot): реализовать механизм драки роботов в зависимости от силы. Метод должен определять, выиграл ли робот, у которого вызвали метод fight (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие: если robot1.fight(robot2) = true, то robot2.fight(robot1) = false
*/
package Exercise_21;

public class Main {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Terminator", 35, 500);
        Robot robot2 = new Robot("Robocope", 40, 1000);

        System.out.println(robot1.fight(robot2));
        System.out.println(robot2.fight(robot1));
    }
}
