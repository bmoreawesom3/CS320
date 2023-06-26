package TaskService;
public class Task {

		private String ID;
		private String name;
		private String description;
	
		public Task(String ID, String name, String description) {		
			if(ID == null || ID.length()>10) {
				throw new IllegalArgumentException("Invald ID");
			}
			if(name == null || name.length()>20) {
				throw new IllegalArgumentException("Invald Name");
			}
			if(description == null || description.length()>50) {
				throw new IllegalArgumentException("Invald description");
			}
		
			this.ID = ID;
			this.name = name;
			this.description = description;
		}
	
		public String getID() {
			return ID;
		}
	
		public String getname() {
			return name;
		}
	
		public String getdescription() {
			return description;
		}
}
