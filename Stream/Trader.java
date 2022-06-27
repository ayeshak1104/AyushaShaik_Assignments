public class Trader {
   String tname;
  String city; 
    

Trader(String tname,String city)
{
    super();
    this. tname= tname;
    this. city=city; 
      
}

public String getName() {
  return tname;
}
public void setName(String name) {
  this.tname = name;
}
public String getCity() {
  return city;
}
public void setCity(String city) {
  this.city = city;
}



  
}