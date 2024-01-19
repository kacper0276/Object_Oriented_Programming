package MetodaGeneryczna;

public class MetodaPorownanie {
    static <T extends Person> T findMax(T el1, T el2) {
        return el1.age > el2.age ? el1 : el2;
    }
}
