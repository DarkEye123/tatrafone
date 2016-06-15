package fi.muni.pv207.tatrafone.processes.ppc.database;

import java.util.ArrayList;

/**
 * Created by darkeye on 15/06/16.
 */
public class CampaignDatabase {

    class Pair { // Pair as a javafx class was problematic
        Double cost;
        Double income;
        Pair(Double cost, Double income){
            this.cost = cost;
            this.income = income;
        }
    }

    private ArrayList<Pair> database = new ArrayList<>();

    public void addCostIncome(double cost, double income){
        database.add(new Pair(cost, income));
    }

    public ArrayList<Pair>  getDatabase() {
        return database;
    }

}
