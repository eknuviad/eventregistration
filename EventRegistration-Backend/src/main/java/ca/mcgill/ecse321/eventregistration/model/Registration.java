package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Set;
import javax.persistence.ManyToMany;
import javax.persistence.Id;

@Entity
public class Registration{
   private RegistrationManager registrationManager;
   
   @ManyToOne(optional=false)
   public RegistrationManager getRegistrationManager() {
      return this.registrationManager;
   }
   
   public void setRegistrationManager(RegistrationManager registrationManager) {
      this.registrationManager = registrationManager;
   }
   
   private Set<Event> event;
   
   @ManyToMany(mappedBy="registration" )
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Person person;
   
   @ManyToOne(optional=false)
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
