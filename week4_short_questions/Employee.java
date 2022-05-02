public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "EMPLOYEE_ID_SEQ")
    @SequenceGenerator(sequenceName = "employee_seq", allocationSize = 1, name = "EMPLOYEE_ID_SEQ", initialValue = 4)
    Long id;

    @Column(name = "FIRST_NAME")
    String firstName;

    @Column(name = "LAST_NAME")
    String lastName;

    @Column(name = "TITLE")
    String title;

    @Column(name = "JOIN_DATE")
    Date join_date;

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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getJoinDate() {
        return join_date;
    }

    public void setJoinDate(Date join_date) {
        this.join_date = join_date;
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
