package collection_practice;

import java.util.*;

public class PlayerComparator {

    public static void main(String []args) {
        List<Player> team = new ArrayList<>();
        Player player1 = new Player(59, "John", 20);
        Player player2 = new Player(67,"Roger", 22);
        Player player3 = new Player(45,null, 24);


        team.add(player1);
        team.add(player2);
        team.add(player3);

        System.out.println("Sorting by ranking");
        Collections.sort(team, new RankingComparator());
        Collections.sort(team, new RankingComparator().reversed());
        System.out.println(team);

        System.out.println("Sorting by age");
        Collections.sort(team, new AgeComparator());
        Collections.sort(team, new AgeComparator().reversed());
        System.out.println(team);


        System.out.println("Sorting by name");
        Comparator<Player> nameComparator = (n1, n2) ->  n1.getName().compareTo(n2.getName());
        team.sort(nameComparator);
        System.out.println(team);

        //Collections.reverseOrder(Comparator c)

        team.sort(Collections.reverseOrder(nameComparator));
        System.out.println(team);

        /*
        Java 8 Comparator Example: nullsFirst() and nullsLast() method

        Comparator<Player> cm1=Comparator.comparing(Player::getName,Comparator.nullsFirst(String::compareTo));
        Collections.sort(team, cm1);
        System.out.println(team);

        Comparator<Player> cm2=Comparator.comparing(Player::getName,Comparator.nullsLast(String::compareTo));
        Collections.sort(team, cm2);
        System.out.println(team);
        */



       /*
        Avoiding the Subtraction Trick

        Player player1 = new Player(59, "John", Integer.MAX_VALUE);
        Player player2 = new Player(67, "Roger", -1);

        List<Player> players = Arrays.asList(player1, player2);

        Comparator<Player> cm1 = (o1, o2) -> o1.getRanking() - o2.getRanking();
        players.sort(cm1);
        System.out.println(players);*/

    }

    static class RankingComparator implements Comparator<Player>{

        @Override
        public int compare(Player p1, Player p2){
            return Integer.compare(p1.getRanking(), p2.getRanking());
        }
    }

    static class AgeComparator implements Comparator<Player>{

        @Override
        public int compare(Player p1, Player p2){
            return Integer.compare(p1.getAge(), p2.getAge());
        }
    }

    /*class PlayerComparable implements Comparable<Player>{

        @Override
        public int compareTo(Player p1){
            return Integer.compare(getRanking(), p1.getRanking());
        }
    }*/
}
