public class Artist {
   // TODO: Declare private fields - artistName, birthYear, deathYear
   private String artistName;
   private int birthYear;
   private int deathYear;
   // TODO: Define default constructor
   public Artist(){
      this.artistName = "None";
      this.birthYear = 0;
      this.deathYear = 0;
      }
   // TODO: Define second constructor to initialize 
   //       private fields (artistName, birthYear, deathYear)
   public Artist(String artistName, int birthYear, int deathYear){
      this.artistName = artistName;
      this.birthYear = birthYear;
      this.deathYear = deathYear;
      }
   // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()
   public String getName(){return this.artistName;}
   public int getBirthYear(){return this.birthYear;}
   public int getDeathYear(){return this.deathYear;}
   // TODO: Define printInfo() method
   //      If deathYear is entered as -1, only print birthYear
   public void printInfo(){
      // Artist: Brice Marden, born 1938
     
      if (this.deathYear == -1) {
         System.out.println("Artist: " + this.artistName + ", " + "born " + this.birthYear);
      }
      else{
         System.out.println("Artist: " + this.artistName + " (" + this.birthYear + "-" + this.deathYear + ")"); 
         }
         }
      
      
      }

