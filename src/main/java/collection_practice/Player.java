package collection_practice;

public class Player {
    private int ranking;
    private String name;
    private int age;

    public Player(int ranking, String name, int age){
        this.ranking = ranking;
        this.name = name;
        this.age = age;
    }
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
    public int getRanking(){
        return ranking;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String toString(){
        return ranking+","+name+","+age;
    }

}
