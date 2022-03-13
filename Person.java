
public class Person extends Passenger {

	
		private int numOffspring;
	//-----------------------------------------Default values of Object
		public Person() {
			super();
			this.numOffspring = 0;
				
			}
		
		//--------------------------------------------constructor
		public Person(int numOffspring) {
			this.numOffspring = numOffspring;
		}
		
		Person(String name, int birthYear, double weight, double height,
				char gender, int numCarryOn, int numOffspring) {
			
				super(name, birthYear, weight, height, gender, numCarryOn);
				this.numOffspring = numOffspring;
				}
		
		public void setNumOffspring(int numOffspring) {
			this.numOffspring = numOffspring;
			}
		
		public int getNumOffspring() {
			return numOffspring;
			}
		
		@Override
		public void printDetails() {
		super.printDetails();
		System.out.printf("Person: Number of offspring: %4d\n ",numOffspring);
		}
		
		

		

		@Override
		public String toString() {
		return super.toString()+" "+String.format("Person: Number of offspring: %4d\n ",numOffspring);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (numOffspring != other.numOffspring)
				return false;
			return true;
		}
		
		
		//-----------------------------------------------
    }

