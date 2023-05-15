import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Transport {
    private String brand;

    public abstract void start();

    @Override
    public String toString() {
        return "Бренд транспорта: " + brand;
    }
}
