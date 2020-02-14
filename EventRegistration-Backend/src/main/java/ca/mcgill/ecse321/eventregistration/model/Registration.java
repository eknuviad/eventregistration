package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class Registration{
   private RegistrationManager registrationManager = null;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private Event event;
   
   @ManyToMany(mappedBy="registration", cascade = { CascadeType.ALL } )
   public Event getEvent() {
      return this.event;
   }
   
   public void setEvent(Event event2) {
      this.event = event2;
   }
   
   private Person person;
   
   @ManyToOne(optional=false,  cascade = { CascadeType.ALL })
   public Person getPerson() {
      return this.person;
   }
   
   public void setPerson(Person person) {
      this.person = person;
   }
   
   private Integer id;

public void setId(Integer value) {
    this.id = value;
}
@Id
public Integer getId() {
    return this.id;
}
}
