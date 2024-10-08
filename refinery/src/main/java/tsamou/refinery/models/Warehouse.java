package tsamou.refinery.models;

import jakarta.persistence.*;

import javax.tools.Tool;

@Entity
@Table (name = "warehouse")
public class Warehouse {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @OneToOne
    private Tool tool;

    @ManyToOne
    @JoinColumn (name = "supplier_id", nullable = false)
    private Supplier supplier;

    @Column (name = "stock_level")
    private Integer stockLevel;

    @Column (name = "availability")
    private Boolean available;

    public Warehouse() {
    }

    public Warehouse(Tool tool, Supplier supplier, Integer stockLevel, Boolean available) {
        this.tool = tool;
        this.supplier = supplier;
        this.stockLevel = stockLevel;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Integer getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(Integer stockLevel) {
        this.stockLevel = stockLevel;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
