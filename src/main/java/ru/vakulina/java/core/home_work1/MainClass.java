package ru.vakulina.java.core.home_work1;

/*
1.Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
2.Создайте два класса: беговая дорожка и стена, при прохождении через которые,
участники должны выполнять соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
(успешно пробежал, не смог пробежать и т.д.).
3.Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
4.У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
5*.Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
 */

public class MainClass {
    public static void main(String[] args) {
        JumpableRunnable[] members = {
                new Human(2, 2, "Ivan"),
                new Human(1, 2, "Anna"),
                new Cat(3, 4, "Bars"),
                new Cat(1, 1, "Murka"),
                new Robot(0, 10, 101),
                new Robot(4,7,122)
        };

        Obstaclable[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(4),
                new Wall(1),
                new Wall(3)
        };

        for (JumpableRunnable member : members) {
            System.out.println("К прохождению препятствий приступает " + member);
            boolean winner = true;
            for (Obstaclable obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И у него получается!");
                } else {
                    winner = false;
                    System.out.println("И у него не получается.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл дистанцию!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}
