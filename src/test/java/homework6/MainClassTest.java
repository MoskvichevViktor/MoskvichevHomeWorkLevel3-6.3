package homework6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static homework6.MainClass.metod1;
import static homework6.MainClass.metod2;

public class MainClassTest {


    //Тест 1а
    @ParameterizedTest
    @MethodSource("metod1ParametersProvider")
    public void shouldTestMetod1(int[] expected, int[] array ) {

        Assertions.assertArrayEquals(new int[]{}, MainClass.metod1(new int[]{}));

    }
    public static Stream<Arguments> metod1ParametersProvider(){
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{ 5}, new int[]{1, 2, 3, 4, 5}));
        out.add(Arguments.arguments(new int[]{ 5, 6, 7}, new int[]{1, 2, 3, 4, 5, 6, 7}));
        out.add(Arguments.arguments(new int[]{ 9}, new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
        return out.stream();
    }
    //Тест 1б
    @Test
    void shouldThrowTest(){
        Assertions.assertThrows(RuntimeException.class,
                () -> metod1(new int[]{1, 5}));
    }

    @ParameterizedTest
    @MethodSource("metod2ParametersProvider")

    public void shouldTestMetod2( boolean bool ){
        Assertions.assertTrue(MainClass.metod2(new int[]{}));

    }
    private static Stream<Arguments> metod2ParametersProvider(){
        return Stream.of(
                Arguments.arguments(MainClass.metod2(new int[]{1, 4, 1, 1})),
                Arguments.arguments(MainClass.metod2(new int[]{1, 1, 1, 1})),
                Arguments.arguments(MainClass.metod2(new int[]{4, 4, 4, 4})),
                Arguments.arguments(MainClass.metod2(new int[]{1, 4, 1, 8}))

        );
    }
}
