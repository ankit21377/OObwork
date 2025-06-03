// public class BankAccount {

//     private String accountNumber;
//     private String accountHolderName;
//     private double balance;

//     public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
//         this.accountNumber = accountNumber;
//         this.accountHolderName = accountHolderName;
//         if (initialBalance >= 0) {
//             this.balance = initialBalance;
//         } else {
//             System.out.println("iNVALID! the first balance cannot be less than 0.");
//         }
//     }

//     public void deposit(double amount) {
//         if (amount > 0) {
//             balance += amount;
//             System.out.println("Deposited: Rs." + amount);
//         } else {
//             System.out.println("Invalid! Deposit must be greater than 0.");
//         }
//     }

//     public void withdraw(double amount) {
//         if (amount > 0) {
//             if (amount <= balance) {
//                 balance -= amount;
//                 System.out.println("Withdrawn: Rs" + amount);
//             } else {
//                 System.out.println("Insufficient amount");
//             }
//         } else {
//             System.out.println("Invalid! amount must be greater than 0.");
//         }
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public String getAccountHolderName() {
//         return accountHolderName;
//     }

//     public void printAccountDetails() {
//         System.out.println("Account Number: " + accountNumber);
//         System.out.println("Account Holder: " + accountHolderName);
//         System.out.println("Current Balance: Rs" + balance);
//     }

//     public static void main(String[] args) {
//         BankAccount account = new BankAccount("045567231", "Angkit Kharel", 500.00);

//         System.out.println("first Account Details  :");
//         account.printAccountDetails();

        
//         account.deposit(150.00);

//         account.withdraw(100.00);

//         account.withdraw(1000.00);
        
//         System.out.println("\nFinal Account Details:");
//         account.printAccountDetails();
//     }
// }
// public class Book {
    
//     private String title;
//     private String author;
//     private int publicationYear;
//     private boolean isAvailable;

//     public Book(String title, String author, int publicationYear) {
//         this.title = title;
//         this.author = author;
//         this.publicationYear = publicationYear;
//         this.isAvailable = true; 
//     }

   
//     public String getTitle() {
//         return title;
//     }

//     public String getAuthor() {
//         return author;
//     }

//     public int getPublicationYear() {
//         return publicationYear;
//     }

//     public boolean isAvailable() {
//         return isAvailable;
//     }


//     public void setTitle(String title) {
//         this.title = title;
//     }

//     public void setAuthor(String author) {
//         this.author = author;
//     }

//     public void setPublicationYear(int publicationYear) {
//         this.publicationYear = publicationYear;
//     }

//     public void borrowBook() {
//         if (isAvailable) {
//             isAvailable = false;
//             System.out.println("Book \"" + title + "\" has been borrowed.");
//         } else {
//             System.out.println("Sorry, \"" + title + "\" is currently not available.");
//         }
//     }

//     public void returnBook() {
//         if (!isAvailable) {
//             isAvailable = true;
//             System.out.println("Book \"" + title + "\" has been returned.");
//         } else {
//             System.out.println("This book wasn't borrowed.");
//         }
//     }

//     public void printBookDetails() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Year: " + publicationYear);
//         System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed"));
//     }

//     public static void main(String[] args) {
//         Book book1 = new Book("java", "Angkit Kharel", 1998);

//         System.out.println("first Book Info:");
//         book1.printBookDetails();

//         System.out.println("Attempting to borrow...");
//         book1.borrowBook();

//         System.out.println("Attempting to borrow again...");
//         book1.borrowBook();


//         System.out.println("Returning the book...");
//         book1.returnBook();


//         System.out.println("Final Book Info:");
//         book1.printBookDetails();
//     }
// }
// 
// public class Circled{
//     private double radius;
//     // private float pi = 3.14f;

//     public void setRadius(double radius){
//         if (radius > 0){
//             this.radius = radius;

//         }else {
//             System.out.println("Invalid radius must be greater than 0.");
//         }
//     }

//     public double getRadius(){
//         return radius;
//     }

//     public double calculateArea(){
//         return Math.PI * radius * radius;
//     }

//     public double calculateCircum(){
//         return 2 *  Math.PI * radius;
//     }

//     public static void main(String[] args){
//         Circled Circ = new Circled();

//         Circ.setRadius(25.0);

//         System.out.println("Radius : " + Circ.getRadius());
//         System.out.println("Area : " + Circ.calculateArea());
//         System.out.println("Circumstances :" + Circ.calculateCircum());
//     }

// // }
// public class Dog {

//     private String name;
//     private String breed;

    
//     public Dog(String name, String breed) {
//         this.name = name;
//         this.breed = breed;
//     }

    
//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setBreed(String breed) {
//         this.breed = breed;
//     }

    
//     public String getName() {
//         return name;
//     }

//     public String getBreed() {
//         return breed;
//     }

    
//     public static void main(String[] args) {
        
//         Dog dog1 = new Dog("hi", "bark");
//         Dog dog2 = new Dog("hello", "not bark");

       
//         dog1.setName("tom");
//         dog1.setBreed("local");

//         dog2.setName("jack");
//         dog2.setBreed("khairey kale");

        
//         System.out.println("Details updated :");
//         System.out.print("Dog1 name: " + dog1.getName() + "    ");
//         System.out.println( "Dog1 Breed: " + dog1.getBreed());
//         System.out.print("Dog2 name: " + dog2.getName()  + "    ");
//         System.out.println("Dog2 Breed: " + dog2.getBreed());
//     }
// }
// public class Employee{
    
//     private String name;
//     private String jobTitle;
//     private double salary;

//     public Employee(String name, String jobTitle, double salary) {
//         this.name = name;
//         this.jobTitle = jobTitle;
//         this.salary = salary;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getJobTitle() {
//         return jobTitle;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public void setJobTitle(String jobTitle) {
//         this.jobTitle = jobTitle;
//     }

//     public void setSalary(double salary) {
//         this.salary = salary;
//     }

//     public void applyRaise(double percentage) {
//         if (percentage > 0) {
//             double increase = salary * (percentage / 100);
//             salary += increase;
//         } else {
//             System.out.println("Invalid! must be greater than 0.");
//         }
//     }

//     public void printDetails() {
//         System.out.println("Name: " + name);
//         System.out.println("Job Title: " + jobTitle);
//         System.out.println("Salary: Rs" + salary);
//     }

//     public static void main(String[] args) {
//         Employee emp = new Employee("Angkit Kharel", "Software Developer", 150000);

//         System.out.println("First Employee Information :");
//         emp.printDetails();

//         emp.applyRaise(10);  

//         System.out.println("After 10% increase:");
//         emp.printDetails();
//     }
// }
// 
// public class Product {
    
//     private String productName;
//     private String productId;
//     private double price;
//     private int stockQuantity;

    
//     public Product(String productName, String productId, double price, int stockQuantity) {
//         this.productName = productName;
//         this.productId = productId;
//         setPrice(price); 
//         this.stockQuantity = stockQuantity;
//     }

    
//     public String getProductName() {
//         return productName;
//     }

//     public String getProductId() {
//         return productId;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public int getStockQuantity() {
//         return stockQuantity;
//     }

    
//     public void setProductName(String productName) {
//         this.productName = productName;
//     }

//     public void setProductId(String productId) {
//         this.productId = productId;
//     }

//     public void setPrice(double price) {
//         if (price >= 0) {
//             this.price = price;
//         } else {
//             System.out.println("Invalid! Price must be greater than 0.");
//         }
//     }

//     public void purchase(int quantity) {
//         if (quantity > 0 && quantity <= stockQuantity) {
//             stockQuantity -= quantity;
//             System.out.println(quantity + "purchased.");
//         } else {
//             System.out.println("Invalid quantity");
//         }
//     }


//     public void restock(int quantity) {
//         if (quantity > 0) {
//             stockQuantity += quantity;
//             System.out.println(quantity + "restocked.");
//         } else {
//             System.out.println("Invalid! must be greater than 0.");
//         }
//     }

//     // Method to display product info
//     public void printDetails() {
//         System.out.println("Product ID : " + productId);
//         System.out.println("Name: " + productName);
//         System.out.println("Price : Rs" + price);
//         System.out.println("Stock: " + stockQuantity);
//     }

//     // Main method to test
//     public static void main(String[] args) {
//         Product p1 = new Product("Earbud", "WM123", 1500.99, 40);

//         System.out.println("First Product Details:");
//         p1.printDetails();

//         p1.purchase(5);
        
//         p1.restock(10);

//         p1.setPrice(-20);

//         System.out.println("\nUpdated Product Details:");
//         p1.printDetails();
//     }
// }
// public class SimpleInterest {
    
//     private double principal;
//     private double time;
//     private double rate;

//     public void setPrincipal(double principal) {
//         this.principal = principal;
//     }

//     public void setTime(double time) {
//         this.time = time;
//     }

//     public void setRate(double rate) {
//         this.rate = rate;
//     }

//     public double getPrincipal() {
//         return principal;
//     }

//     public double getTime() {
//         return time;
//     }

//     public double getRate() {
//         return rate;
//     }
    
//     public double calculateInterest() {
//         return (principal * time * rate) / 100;
//     }
    
//     public static void main(String[] args) {
//         SimpleInterest si = new SimpleInterest();

//         si.setPrincipal(123.98);
//         si.setTime(57.57);
//         si.setRate(69.32);

//         System.out.println("Principal: " + si.getPrincipal());
//         System.out.println("Time (years): " + si.getTime());
//         System.out.println("Rate (%): " + si.getRate());
        
//         System.out.println("Simple Interest: " + si.calculateInterest());
//     }
// }
// public class Student {

//     private String name;
//     private String idNumber;
//     private double gpa;

//     public Student(String name, String idNumber, double gpa) {
//         this.name = name;
//         this.idNumber = idNumber;
//         if (gpa >= 0.0 && gpa <= 4.0) {
//             this.gpa = gpa;
//         } else {
//             System.out.println("Invalid GPA. Must be between 0.0 and 4.0. Setting to 0.0.");
//             this.gpa = 0.0;
//         }
//     }

//     public String getName() {
//         return name;
//     }

//     public void setName(String name) {
//         this.name = name;
//     }

//     public String getIdNumber() {
//         return idNumber;
//     }

//     public void setIdNumber(String idNumber) {
//         this.idNumber = idNumber;
//     }

//     public double getGpa() {
//         return gpa;
//     }

//     public void printStudentInfo() {
//         System.out.println("Student Name: " + name);
//         System.out.println("ID Number: " + idNumber);
//         System.out.println("GPA: " + gpa);
//     }

//     public static void main(String[] args) {
        
//         Student student1 = new Student("Avay Theeng", "240522", 3.8);
        
//         System.out.println("First Student Information : ");
//         student1.printStudentInfo();

//         student1.setName("Avay Lama");
//         student1.setIdNumber("240521");

//         System.out.println("Updated Student Information : ");
//         student1.printStudentInfo();
//     }
// }
