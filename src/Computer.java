import javafx.scene.chart.XYChart;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Computer {

    private  String modelPC;
    private int age;
    private  int volumeRAM;
    private int price;
    private HardDrive hardDrive;
    private Processor processor;

}
