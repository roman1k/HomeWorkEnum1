import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        ArrayList<Computer> computers  = new ArrayList<>();

        HardDrive hardDrive1 = new HardDrive("SEAGATE", false, 500, Countries.China);
        HardDrive hardDrive2 = new HardDrive("TOSHIBA", false, 1000, Countries.India);
        HardDrive hardDrive3 = new HardDrive("WD", false, 1000, Countries.USA);
        HardDrive hardDrive4 = new HardDrive("HGST", true, 250, Countries.China);
        HardDrive hardDrive5 = new HardDrive("TOSHIBA", true, 120, Countries.India);
        HardDrive hardDrive6 = new HardDrive("HGST", false, 1000, Countries.USA);
        HardDrive hardDrive7 = new HardDrive("SEAGATE", true, 250, Countries.Korea);

        Processor processor1 = new Processor("I7", (byte)2, 1.4, Countries.China);
        Processor processor2 = new Processor("I3", (byte)2, 2.2, Countries.USA);
        Processor processor3 = new Processor("I5", (byte)4, 2.4, Countries.China);
        Processor processor4 = new Processor("I7", (byte)2, 2.0, Countries.USA);
        Processor processor5 = new Processor("I5", (byte)1, 2.8, Countries.Korea);
        Processor processor6 = new Processor("AMD", (byte)4, 1.7, Countries.Korea);
        Processor processor7 = new Processor("I3", (byte)8, 2.4, Countries.India);
        Processor processor8 = new Processor("AND", (byte)4, 3.4, Countries.Korea);

        Computer computer1 = new Computer("PC2000", 2018, 12000,400,hardDrive3,processor1);
        Computer computer2 = new Computer("laptop350", 2016, 2000,500,hardDrive6,processor2);
        Computer computer3 = new Computer("PC2300", 2016, 4000,280,hardDrive4,processor4);
        Computer computer4 = new Computer("laptop10", 2014, 8000,750,hardDrive1,processor5);
        Computer computer5 = new Computer("PC560", 2017, 4000,340,hardDrive5,processor3);
        Computer computer6 = new Computer("laptop270", 2015, 12000,800,hardDrive4,processor8);
        Computer computer7 = new Computer("laptop1000", 2018, 8000,1200,hardDrive6,processor8);
        Computer computer8 = new Computer("PC210", 2013, 1000,560,hardDrive7,processor7);
        Computer computer9 = new Computer("laptop790", 2018, 4000,780,hardDrive3,processor1);
        Computer computer10 = new Computer("PC430", 2015, 8000,650,hardDrive2,processor2);
        Computer computer11 = new Computer("laptop140", 2014, 8000,570,hardDrive5,processor6);
        Computer computer12 = new Computer("PC320", 2016, 4000,200,hardDrive5,processor6);
        Computer computer13 = new Computer("laptop240", 2013, 4000,540,hardDrive7,processor5);
        Computer computer14 = new Computer("PC270", 2018, 4000,760,hardDrive1,processor3);
        Computer computer15 = new Computer("laptop290", 2017, 8000,430,hardDrive6,processor1);
        Computer computer16 = new Computer("PC090", 2018, 16000,1230,hardDrive2,processor4);
        Computer computer17= new Computer("PC100", 2017, 12000,540,hardDrive1,processor2);
        Computer computer18 = new Computer("laptop240", 2016, 8000,400,hardDrive4,processor7);
        Computer computer19 = new Computer("PC320", 2018, 8000,800,hardDrive1,processor3);
        Computer computer20 = new Computer("laptop530", 2018, 12000,400,hardDrive2,processor8);
        Computer computer21 = new Computer("PC080", 2015, 2000,290,hardDrive3,processor2);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        computers.add(computer5);
        computers.add(computer6);
        computers.add(computer7);
        computers.add(computer8);
        computers.add(computer9);
        computers.add(computer10);
        computers.add(computer11);
        computers.add(computer12);
        computers.add(computer13);
        computers.add(computer14);
        computers.add(computer15);
        computers.add(computer16);
        computers.add(computer17);
        computers.add(computer18);
        computers.add(computer19);
        computers.add(computer20);
        computers.add(computer21);

        System.out.println(Sorted.sortSSDPrice(computers));


    }
}
