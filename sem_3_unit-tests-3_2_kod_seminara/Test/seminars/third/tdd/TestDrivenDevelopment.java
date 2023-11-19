package seminars.third.tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class TestDrivenDevelopment {
    private MoodAnalyser moodAnalyser;

    //3.5. Red-Green-Refactor

    @BeforeEach
    void setUp() {
        moodAnalyser = new MoodAnalyser();
    }

    @Test
    void goodMood(){
        assertThat(moodAnalyser.analyseMood("Отличный день")).isEqualTo("Happy");
    }
    @Test
    void badMood(){
        assertThat(moodAnalyser.analyseMood("Ужасный день")).isEqualTo("Unhappy");
    }
    @Test
    void normalMood(){
        assertThat(moodAnalyser.analyseMood("Нормальный день")).isEqualTo("Normal");
    }
}