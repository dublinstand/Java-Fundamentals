package org._6_oop_in_java._03_gandalfstash;


public class Gandalf {

    private int moodPoints;
    private String mood;

    public Gandalf(int moodPoints) {
        this.moodPoints = moodPoints;
    }

    public int getMoodPoints() {
        return moodPoints;
    }

    public void setMoodPoints(int moodPoints) {
        this.moodPoints = moodPoints;
    }

    public void gandalfEats(String food) {
        switch (food) {
            case "cram":
                moodPoints += 2;
                break;
            case "lembase":
                moodPoints += 3;
                break;
            case "apple":
                moodPoints += 1;
                break;
            case "melon":
                moodPoints += 1;
                break;
            case "honeycake":
                moodPoints += 5;
                break;
            case "mushrooms":
                moodPoints -= 10;
                break;
            default:
                moodPoints -= 1;
                break;
        }
    }

    public String getMood(){
        setMood(moodPoints);
        return mood;
    }

    public void setMood(int moodPoints){
        if (moodPoints > 15){
            mood = "Special JavaScript mood";
        }
        else if ( moodPoints > 0 && moodPoints <= 15){
            mood = "Happy";
        }
        else if ( moodPoints <= 0 && moodPoints > -5){
            mood = "Sad";
        }
        else if ( moodPoints <= -5){
            mood = "Angry";
        }
    }
}
