package seminars.third.tdd;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.toLowerCase().contains("отличный")) return "Happy";
        if (message.toLowerCase().contains("ужасный")) return "Unhappy";
        return "Normal";
    }

}