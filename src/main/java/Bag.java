import java.util.List;

public class Bag<T, S> {
    final T firstField;
    final S secondField;
    final List<String> stringsList;

    public Bag(T firstField, S secondField, List<String> stringsList) {
        this.firstField = firstField;
        this.secondField = secondField;
        this.stringsList = stringsList;
    }
}
