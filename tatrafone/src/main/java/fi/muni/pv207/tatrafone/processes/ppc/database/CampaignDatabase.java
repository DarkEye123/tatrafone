package fi.muni.pv207.tatrafone.processes.ppc.database;

import javafx.util.Pair;

import java.util.ArrayList;

/**
 * Created by darkeye on 15/06/16.
 */
public class CampaignDatabase {

    private ArrayList<Pair<Double, Double>> database = new ArrayList<>();

    public void addCostIncome(double cost, double income){
        database.add(new Pair<>(cost, income));
    }

    public ArrayList<Pair<Double, Double>>  getDatabase() {
        return database;
    }


}
