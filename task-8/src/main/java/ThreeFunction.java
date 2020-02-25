@FunctionalInterface
public interface ThreeFunction<R, F, S, T> {

    R apply(F first, S second, T third);
}
