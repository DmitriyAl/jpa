package one_to_one;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by root on 18.05.16.
 */
public class Region implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long regionId;

    @Column(name = "region_name")
    private String regionName;

    @OneToOne(mappedBy = "region", cascade = CascadeType.ALL)
    private Gubernator gubernator;

    public Region() {
    }

    public Long getRegionId() {
        return regionId;
    }

    public void setRegionId(Long regionId) {
        this.regionId = regionId;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Gubernator getGubernator() {
        return gubernator;
    }

    public void setGubernator(Gubernator gubernator) {
        this.gubernator = gubernator;
    }
}
