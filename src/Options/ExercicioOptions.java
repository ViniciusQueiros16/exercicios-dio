package Options;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class ExercicioOptions {
    public static void main(String[] args) {
        Optional<String> testOption = Optional.of("valor presente");


        System.out.println("Transformando valores");
        testOption.map(s -> s.concat("****")).ifPresent(System.out::println);
        System.out.println("Valor que esta presente");
        testOption.ifPresentOrElse(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        },() -> System.out.println("Não esta presente"));

        System.out.println("Valor que Não esta presente");
        Optional<String> optionaNull = Optional.ofNullable(null);
        optionaNull.ifPresentOrElse(System.out::println,() -> System.out.println("Optional vazio"));

        System.out.println("Valor que Não esta presente");

        Optional<String> optionavazio = Optional.empty();
        optionavazio.orElseThrow(IllegalStateException::new);


    }
}
