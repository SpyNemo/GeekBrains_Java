package homework.competitors;

public class Team {
    private String title;
    private Competitor[] competitors;

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public Team(String title, Competitor... competitors) {
        this.title = title;
        this.competitors = competitors;
    }

    public void showResults(){
        System.out.println("Team: " + title);
        for (Competitor o: competitors){
            if (o.isOnDistance()){
                o.showResult();
            }
        }
    }


}
