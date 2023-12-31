package br.screenmatch.model;

public class Title {
    private String name;
    private int releaseYear;
    private boolean includedInThePlan;
    private double sumEvaluation;
    private int totalEvaluation;
    private int durationTime;



    public void displaysFile(){
        System.out.println("Title: "+ name );
        System.out.println("Release year: "+ releaseYear );
        System.out.println("Evaluation: "+ averageHandle());
        System.out.println("Total evaluations: "+ getTotalEvaluation());
       // System.out.println("Duration time: "+ getDurationTime() + "\n");
    }

    public int getTotalEvaluation(){
        return totalEvaluation;
    }
    public int getDurationTime() {
        return durationTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationTime(int durationTime) {
        this.durationTime = durationTime;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void evaluation(int note){
        sumEvaluation += note;
        totalEvaluation++;
    }

    public double averageHandle(){
        return sumEvaluation/totalEvaluation;
    }





}
