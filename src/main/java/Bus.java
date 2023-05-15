import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Bus extends Transport{
    private String model;
    @Override
    public void start() {
        System.out.println(model + " заведён");
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Автобус модели: " +
                "'" + model + '\'';
    }
}
