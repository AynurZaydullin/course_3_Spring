import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Создаем класс AppConfig, который будет содержать
// конфигурацию бинов для внедрения зависимостей
@Configuration
public class AppConfig {

    // Создаем бин Car с моделью "BMW"
    @Bean(name = "car")
    public Car getCarBean() {
        return new Car("X5");
    }

    @Bean(name = "bus")
    public Bus getBusBean() {
        return new Bus("Ikarus435");
    }

    @Bean(name = "pickup")
    public Bus getPickupBean() {
        return new Bus("GWM");
    }
    // Создаем бин Driver с именем "Вася"
    @Bean(name = "driver1")
    public Driver getDriver1() {
        return new Driver("Вася", getCarBean());
    }
    // Создаем бин Driver с именем "Петя"
    @Bean(name = "driver2")
    public Driver getDriver2() {
        return new Driver("Вася", getBusBean());
    }
    // Создаем бин Driver с именем "Олег"
    @Bean(name = "driver3")
    public Driver getDriver3() {
        return new Driver("Вася",getPickupBean());
    }
}