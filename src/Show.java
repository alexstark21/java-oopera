import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public void printListOfActors(){
        for (Actor actor : listOfActors){
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor){
        if (listOfActors.contains(actor)){
            System.out.println("Актёр уже задействован в спектакле");
        } else {
            listOfActors.add(actor);
        }
    }

    public void changeActor(Actor actor, String whoChangeSurname){
        int count = 0;
        int index = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(whoChangeSurname)){
                count++;
                index = i;
            }
        }

        if (count == 0) {
            System.out.println("Нет актёра с фамилией - " + whoChangeSurname + "!");
        } else if (count > 1) {
            System.out.println("Ошибка: найдено несколько актеров с фамилией " +
                    whoChangeSurname + "!");
        } else {
            listOfActors.set(index, actor);
        }
    }
}
