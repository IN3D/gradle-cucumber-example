package io.mekmanager.example;

import java.util.List;
import java.util.stream.Collectors;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

public final class LearningService {
    private static List<Integer> standardXP;
    private static List<Integer> fastXP;
    private static List<Integer> slowXP;

    private LearningService() {
        standardXP = List.of(20, 30, 50, 80, 120, 170, 230, 300, 380, 470, 570);
        fastXP = standardXP
                .stream()
                .map(x -> (int)Math.floor(x * 0.9))
                .collect(Collectors.toList());
        slowXP = standardXP
                .stream()
                .map(x -> (int)Math.floor(x * 1.1))
                .collect(Collectors.toList());
    }

    @Contract(pure = true)
    public static Iterable<Integer> xpList(@NotNull Learning learning) {
        switch (learning) {
            case FAST:
                return fastXP;
            case SLOW:
                return slowXP;
            default:
                return standardXP;
        }
    }
}
