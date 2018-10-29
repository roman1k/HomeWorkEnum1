import lombok.Data;

import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor

public class Processor {
    private  String model;
    private byte countCore;
    private double frequency;
    private Countries countries;

    public Processor(String model, byte countCore, double frequency, Countries countries) {
        this.model = model;
        this.countCore = countCore;
        this.frequency = frequency;
        this.countries = countries;
    }
}
