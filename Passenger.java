
import java.util.Scanner;

public class Passenger {
	//-----------------------------Start Main--------------------------------
	
	
	
	//----------------------------End Main----------------------------------
	Scanner scnr = new Scanner(System.in);

	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	private double height;
	
	//------------------------Default Object----------------------------
	public Passenger() {
		
		this.name = "";
		this.birthYear = 1900;
		this.weight = 0.0;
		this.height = 0.0;
		this.gender = 'u';
		this.numCarryOn = 0;
		
		
	}
	
	
	//-------------------------Constructor-----------------------
	 public Passenger(String name, int birthYear, double weight, double height, char gender, int numCarryOn) {
	        this.name = name;
	        this.birthYear = birthYear;
	        

	        if(height < 0 ) {
	        	this.height = -1;
	        } else {
	        	this.height = height;
	        }
	        if (weight < 0) {
	            this.weight = -1;
	        } else {
	            this.weight = weight;
	        }

	        if (gender == 'm' || gender == 'f') {
	            this.gender = gender;
	        } else {
	            this.gender = 'u';
	        }

	        if (numCarryOn < 0) {
	            this.numCarryOn = 0;
	        } else if (numCarryOn > 2) {
	            this.numCarryOn = 2;
	        } else {
	            this.numCarryOn = numCarryOn;
	        }
	 
	    }

	    // method to calculate age
	    public int calculateAge(int currentYear) {
	        if (currentYear < birthYear) {
	            return -1;
	        } else {
	            return currentYear - birthYear;
	        }
	    }

	    // method gain weight
	    public void gainWeight() {
	    	
	        weight = weight + 1;
	    }

	    // method to gain weight by amount
	    public void gainWeight(double amount) {
	        if (weight + amount < 0) {
	            System.out.println("Weight cannot drop below 0");
	        } else {
	            weight = weight + amount;
	        }
	    }
	    // method to calculate BMI using pounds and inches BMI = ( weight * 703) / (height^2) 

	    public double calculateBMI() {
	    	double result = (weight * 703) / height*height;
	    	return calculateBMI();
	    }
	    // start of getter and setter
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getBirthYear() {
	        return birthYear;
	    }

	    public void setBirthYear(int birthYear) {
	        this.birthYear = birthYear;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public void setWeight(double weight) {
	        if (weight < 0) {
	            this.weight = -1;
	        } else {
	            this.weight = weight;
	        }
	    }
	    public double getHeight() {
	        return height;
	    }

	    public void setHeight(double height) {
	    	 if (height < 0) {
		            this.height = -1;
		        } else {
	            this.height = height;
		        }
	    }

	    public char getGender() {
	        return gender;
	    }

	    public void setGender(char gender) {
	        if (gender == 'm' || gender == 'f') {
	            this.gender = gender;
	        } else {
	            this.gender = 'u';
	        }
	        
	    }

	    public int getNumCarryOn() {
	        return numCarryOn;
	    }

	    public void setNumCarryOn(int numCarryOn) {
	        if (numCarryOn < 0) {
	            this.numCarryOn = 0;
	        } else if (numCarryOn > 2) {
	            this.numCarryOn = 2;
	        } else {
	            this.numCarryOn = numCarryOn;
	        }
	    }
	    // end of getter and setter

	    // method to check is female
	    public boolean isFemale() {
	        if (gender == 'f') {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // method to check is male
	    public boolean isMale() {
	        if (gender == 'm') {
	            return true;
	        } else {
	            return false;
	        }
	    }

	    // method to loose weight
	    public void loseWeight() {
	        this.weight--;
	    	//this.weight -= weight;
	    }

	    public Scanner getScnr() {
			return scnr;
		}


		public void setScnr(Scanner scnr) {
			this.scnr = scnr;
		}


		// method to loose weight by amount
	    public void loseWeight(double weight) {
	        if (this.weight - weight <= 0) {
	            System.out.println("Weight cannot drop below 0");
	            this.weight = 0;
	        } else {
	            this.weight = this.weight - weight;
	        }
	    }

	    // method print details
	    public void printDetails() {
	        System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f |  Height: %10.2f | Gender: %c | NumCarryOn: %2d\n"
	                , name, birthYear, height, weight, gender, numCarryOn);
	    }
	    @Override
		public String toString() {
			return "Name:               " + name + ", birthYear=" + birthYear + ", weight=" + weight
					+ ", gender=" + gender + ", numCarryOn=" + numCarryOn + ", height=" + height + "]";
		} 
	 


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Passenger other = (Passenger) obj;
			if (birthYear != other.birthYear)
				return false;
			if (gender != other.gender)
				return false;
			if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (numCarryOn != other.numCarryOn)
				return false;
			if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
				return false;
			return true;
		}
	    	
}
