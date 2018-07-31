package riscus.Models;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Station
{
    private @Id @GeneratedValue Long id;
    private String name;
    private float lat;
    private float lng;

    private Station() {}

    public Station(String name, float lat, float lng) {
        this.name = name;
        this.lat = lat;
        this.lng = lng;
    }
}
