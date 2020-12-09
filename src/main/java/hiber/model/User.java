package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "id")
   private Car userCar;

   @Id
   @Column(name = "id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "name")
   private String name;

   @Column(name = "lastName")
   private String lastName;

   @Column(name = "email")
   private String email;

   public User() {}

   public User(String name, String lastName, String email) {
      this.name = name;
      this.lastName = lastName;
      this.email = email;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public Car getCar() {
      return userCar;
   }

   public void setUserCar(Car car) {
      this.userCar = car;
   }
}