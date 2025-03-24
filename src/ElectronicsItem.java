/**
 * Class: CSC-331-002
 * @author Gabriel Strickland
 * Date: 3/27/2025
 * Purpose: Electronics I
 */

public class ElectronicsItem {
    private String Name;
    private String ElectronicType;
    private Double ElectronicCost;
    private String ElectronicBrand;

    public ElectronicsItem(String Name, String ElectronicType, Double ElectronicCost, String ElectronicBrand){
        this.Name = Name;
        this.ElectronicType = ElectronicType;
        this.ElectronicCost = ElectronicCost;
        this.ElectronicBrand = ElectronicBrand;
    }

    //Accessors

    /**
     *
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     *
     * @return void
     */
    public String getElectronicType() {
        return ElectronicType;
    }

    /**
     *
     * @return
     */
    public Double getElectronicCost() {
        return ElectronicCost;
    }

    /**
     *
     * @return
     */
    public String getElectronicBrand() {
        return ElectronicBrand;
    }

    //Mutators
    public void setName(String name) {
        Name = name;
    }

    public void setElectronicType(String electronicType) {
        ElectronicType = electronicType;
    }

    public void setElectronicCost(Double electronicCost) {
        ElectronicCost = electronicCost;
    }

    public void setElectronicBrand(String electronicBrand) {
        ElectronicBrand = electronicBrand;
    }
}
