package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
import java.util.Set;
import javax.persistence.ManyToMany;

@Entity
public class Event{
   private String name;

public void setName(String value) {
    this.name = value;
}
@Id
public String getName() {
    return this.name;
}
private Date date;

public void setDate(Date value) {
    this.date = value;
}
public Date getDate() {
    return this.date;
}
private Time startTime;

public void setStartTime(Time value) {
    this.startTime = value;
}
public Time getStartTime() {
    return this.startTime;
}
private Time endTime;

public void setEndTime(Time value) {
    this.endTime = value;
}
public Time getEndTime() {
    return this.endTime;
}
   private Set<Event> event;
   
   @ManyToMany
   public Set<Event> getEvent() {
      return this.event;
   }
   
   public void setEvent(Set<Event> events) {
      this.event = events;
   }
   
   private Set<Event> event1;
   
   @ManyToMany(mappedBy="event" )
   public Set<Event> getEvent1() {
      return this.event1;
   }
   
   public void setEvent1(Set<Event> event1s) {
      this.event1 = event1s;
   }
   
   }
