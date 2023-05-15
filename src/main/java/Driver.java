import org.springframework.beans.factory.annotation.Autowired;

// Создаем класс Driver с полями name и car
public class Driver {

    private String name;
    private Transport transport;

    // Конструктор с параметрами name и car
    public Driver(String name, Transport transport) {
        this.name = name;
        this.transport = transport;
    }

    public void startTheTransport() {
        System.out.println(name + " сел(а) в " + transport);
        transport.start();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", transport=" + transport +
                '}';
    }
}