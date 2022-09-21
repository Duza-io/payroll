public class Employee {
    // hours per day
    private int[] arr; // array
    private int upper; // the index of the last element
    private int elemement; // element of array

    // credentials
    private String userName;
    private int userId;
    private int userStatus;

    // constructor
    public Employee(int size) {
        arr = new int[size];
        upper = size;
        elemement = 0;
    }

    // setters
    public void Insert(int item) {
        arr[elemement] = item;
        elemement++;
    }

    public void setName(String un) {
        this.userName = un;
    }

    public void setId(int ui) {
        this.userId = ui;
    }

    public void setStatus(int us) {
        this.userStatus = us;
    }

    // just to be sure that all data is stored in array
    public void displayElement() {
        for (int i = 0; i < upper; i++) {
            System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    // accessors
    public String getName() {
        return userName;
    }

    public int getId() {
        return userId;
    }

    public int getStatus() {
        return userStatus;
    }

    public void computeRate() {
        float rate = 0;

        for (int i = 0; i < arr.length; i++) {
            rate += arr[i] * 5;
        }

        float grossPay = rate * 10;

        // get 2 decimals
        System.out.printf("Employee rate: %.2f\n\n", rate);
        System.out.printf("Gross pay: %.2f", grossPay);

    }

    public void displayData() {
        System.out.println("Employee ID: " + getId());
        System.out.println("Employee name: " + getName());
        System.out.println("Employee status: " + "Type " + getStatus());
        this.computeRate();
    }

}