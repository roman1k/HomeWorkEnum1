import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class HardDrive {
    private String model;
    private boolean ssd;
    private int volumeHD;
    private Countries countries;


}
