import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

    public  static List sortChina(ArrayList<Computer> list){
        List<Computer> china = list.stream()
                .filter(computer -> computer.getAge() > 2017)
                .filter(computer -> computer.getHardDrive().getCountries().getName().equals("China"))
                .collect(Collectors.toList());
        return china;

    }
    public  static List filterNoChina(ArrayList<Computer> list){
        List<Computer> noChina = list.stream()
                .filter(computer -> computer.getAge() > 2017)
                .filter(computer -> !computer.getHardDrive().getCountries().getName().equals("China"))
                .collect(Collectors.toList());
        return noChina;
    }
    public  static List sortPrice(ArrayList<Computer> list) {
        List<Computer> prices = list.stream()
                .filter(computer -> computer.getProcessor().getModel().equals("I7"))
                .sorted((o1, o2) -> o1.getPrice()-o2.getPrice())
                .collect(Collectors.toList());
        return prices;
    }
    public  static List sortSSDPrice(ArrayList<Computer> list) {
        List<Computer> prices = list.stream()
                .filter(computer -> computer.getHardDrive().isSsd())
                .filter(computer -> computer.getProcessor().getModel().equals("I7"))
                .sorted((o1, o2) -> o1.getPrice()-o2.getPrice())
                .collect(Collectors.toList());
        return prices;
    }


}