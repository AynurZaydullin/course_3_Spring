import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Car extends Transport{
    private String model;

    @Override
    public void start() {
        System.out.println(model + " заведена");
    }

    public String getModel() {
        return model;
    }


    @Override
    public String toString() {
        return "Автомобиль модели: " +
                "'" + model + '\'';
    }
}