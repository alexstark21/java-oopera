import java.util.ArrayList;

public class Show {
    String title;
    int duration;
    Director director;
    ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        listOfActors = new ArrayList<>();
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
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
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).surname.equals(whoChangeSurname)){
                listOfActors.set(i, actor);
                return;
            }
        }
        System.out.println("Нет актёра с фамилией - " + whoChangeSurname + "!");
    }
}
