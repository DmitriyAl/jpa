package one_to_one;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by root on 18.05.16.
 */
@Entity
@Table(name = "jc_gubernator")
public class Gubernator implements Serializable {

    @Id
    @Column(name = "region_id", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long regionId;

    @Column(name = "name")
    private String name;

    @OneToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "gubernator")
    private Region region;

    public Gubernator() {
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
