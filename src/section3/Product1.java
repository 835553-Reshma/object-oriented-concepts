package section3;

public class Product1 {
    private long id;
    private String productName;
    private String supplierName;

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public Product1() {
        // TODO Auto-generated constructor stub
    }

    public Product1(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
        return result;
    }

    @Override

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product1 other = (Product1) obj;
        if (id != other.id)
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        if (supplierName == null) {
            if (other.supplierName != null)
                return false;
        } else if (!supplierName.equals(other.supplierName))
            return false;
        return true;
    }

    public void display() {
        System.out.println("Product id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }

}
