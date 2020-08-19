package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("1");
        assertThat(result).contains("2");
        assertThat(result).containsExactly("1","2");
    }

    @Test
    void split2() {
        String result = "(1,2)".substring(1, 4);
        assertThat(result).contains("1,2");
    }

    @Test
    public void charAt() {
        assertThatThrownBy(() ->{
            "abc".charAt(3);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }

}