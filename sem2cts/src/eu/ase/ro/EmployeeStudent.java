package eu.ase.ro;

public class EmployeeStudent {
	
		int salaryPerHour;
		int salary;
		int hours;

		public void reportHours(int addHours) {
			hours+=addHours;
			//salary=salaryPerHour*hours;
			
		}
		
	public int getFullSalary() {
		return hours*salaryPerHour;
		
	}
		
		public String getExam(int numberExam) throws Exception {
			String[] exams = {ConstantVariables.EXAM_OOP, ConstantVariables.EXAM_DS, ConstantVariables.EXAM_Java, ConstantVariables.EXAM_CS, ConstantVariables.EXAM_Stat};
			if(numberExam <= exams.length && numberExam >0) {
				return exams[numberExam-1];
			}
			else 
				throw new Exception("exam must be in range 1-5");
			/*
			 * switch (numberExam) { case 1: return ConstantVariables.EXAM_OOP; case 2:
			 * return ConstantVariables.EXAM_Java; case 3: return ConstantVariables.EXAM_DS;
			 * case 4: return ConstantVariables.EXAM_CS; case 5: return
			 * ConstantVariables.EXAM_Stat;
			 * 
			 * default: throw new Exception("exam must be in range 1 to 5"); }
			 */
		}

}
