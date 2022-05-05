public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ORDER_ID_SEQ")
    @SequenceGenerator(sequenceName = "order_seq", allocationSize = 1, name = "ORDER_ID_SEQ", initialValue = 4)
    Long id;

    @Column(name = "PRODUCT_NAME")
    String product_name;

    @Column(name = "AMOUNT")
    Integer amount;

    @Column(name = "UNIT_PRICE")
    Integer unit_price;

    @Column(name = "CREATE_DATE")
    @CreationTimestamp
    Date create_date;

    @Column(name = "UPDATE_DATE")
    @UpdateTimestamp
    Date update_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getUnitPrice() {
        return unit_price;
    }

    public void setUnitPrice(Integer unit_price) {
        this.unit_price = unit_price;
    }

    public Date getCreateDate() {
        return create_date;
    }

    public void setCreateDate(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdateDate() {
        return update_date;
    }

    public void setUpdateDate(Date update_date) {
        this.update_date = update_date;
    }
}
