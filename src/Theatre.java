public class Theatre {

    public static void main(String[] args) {
        Actor batoeva = new Actor("Надежда", "Батоева", Gender.FEMALE, 170);
        Actor ermakov = new Actor("Андрей", "Ермаков", Gender.MALE, 175);
        Actor shakirova = new Actor("Рената", "Шакирова", Gender.FEMALE, 173);
        Actor shakirov = new Actor("Ренат", "Шакирова", Gender.MALE, 176);
        Director gabitov = new Director("Иркин", "Габитов", Gender.MALE, 280);
        Director gergiev = new Director("Валерий", "Гергиев", Gender.MALE, 340);
        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Василий", "Вайнонен", Gender.MALE);
        String theQueenOfSpadesLibretto = "\"О чем \"Пиковая дама\"? Является ли эта опера историей про любовь? " +
                "Отчасти. Собственно, как любая опера. Двое мужчин любили одну девушку. Один – красивый, успешный, " +
                "из хорошей семьи, для которого открыты все пути. И другой – бедный, неизвестный, злой неудачник. " +
                "Но девушка любит второго, что бывает весьма часто.";
        String theNutCrackerLibretto = "Написанная по сценарному плану Мариуса Петипа для сказочного балета-феерии, " +
                "впервые музыка Чайковского прозвучала в спектакле, поставленном Львом Ивановым в 1892 году. ";
        Show usualShow = new Show("Обычный спектакль", 280, gabitov);
        Opera theQueenOfSpades = new Opera("Пиковая дама", 320, gergiev, musicAuthor, 150,
                theQueenOfSpadesLibretto);
        Ballet theNutCracker = new Ballet("Щелкунчик", 320, gergiev, musicAuthor, choreographer,
                theNutCrackerLibretto);

        usualShow.addActor(batoeva);
        usualShow.addActor(ermakov);
        theQueenOfSpades.addActor(shakirova);
        theQueenOfSpades.addActor(ermakov);
        theNutCracker.addActor(batoeva);
        theNutCracker.addActor(shakirova);
        theNutCracker.addActor(shakirov);


        // Для каждого спектакля выведите на экран список актёров
        System.out.println("Список актёров спектакля " + usualShow.title);
        usualShow.printListOfActors();
        System.out.println();
        System.out.println("Список актёров оперы " + theQueenOfSpades.title);
        theQueenOfSpades.printListOfActors();
        System.out.println();
        System.out.println("Список актёров балета " + theNutCracker.title);
        theNutCracker.printListOfActors();
        System.out.println();

        // Замените актёра в одном из спектаклей на актёра из другого спектакля и ещё раз выведите для него список актёров
        theQueenOfSpades.changeActor(batoeva, "Шакирова");
        System.out.println("Список актёров оперы " + theQueenOfSpades.title);
        theQueenOfSpades.printListOfActors();
        System.out.println();

        // Попробуйте заменить в другом спектакле несуществующего актёра
        theNutCracker.changeActor(ermakov, "Бат");
        theNutCracker.changeActor(ermakov, "Шакирова");
        System.out.println("Список актёров балета " + theNutCracker.title);
        theNutCracker.printListOfActors();
        System.out.println();

        // Для оперного и балетного спектакля выведите на экран текст либретто
        System.out.println("Либретто оперы " + theQueenOfSpades.title + ":");
        theQueenOfSpades.printLibrettoText();
        System.out.println();
        System.out.println("Либретто балета " + theNutCracker.title + ":");
        theNutCracker.printLibrettoText();
        System.out.println();
    }
}
