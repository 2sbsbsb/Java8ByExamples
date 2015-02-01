package examples.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @author santoshb
 */
public class FilterBetweenMinAndMax {

	public static class Subject {		
		private final String name;
		private final int index;

		/**
		 * @param name
		 */
		public Subject(String name, int index) {
			super();
			this.name = name;
			this.index = index; 
		}

		public String getName() {
			return name;
		}

		public int getIndex() {
			return index;
		}

		@Override
		public String toString() {
			return "Subject [name=" + name + ", index=" + index + "]";
		} 	
	}
	
	private final int MAX_SIZE = 500000;
	private final List<Subject> subjects;
	
	/**
	 * @param subjects
	 */
	public FilterBetweenMinAndMax() {
		super();
		Random r = new Random();
		int Low = 0;
		int High = MAX_SIZE;
			this.subjects = new ArrayList<>();
		for(int i=0; i< MAX_SIZE; i++){
			int index = r.nextInt(High-Low) + Low;			
			subjects.add(new Subject("S"+index, index));
		}
	}

	/**
	 * @param minIndex
	 * @param maxIndex
	 * @return subjects with index between minIndex and maxIndex both included
	 */
	public List<Subject> filterPreJava8(int minIndex, int maxIndex) {
		List<Subject> results = new ArrayList<FilterBetweenMinAndMax.Subject>();
		for(int i=0;i<subjects.size();i++) {
			Subject subject = subjects.get(i);
			if(subject!=null && subject.getIndex()>=minIndex && subject.getIndex()<=maxIndex) {
				results.add(subject);
			}
		}
		return results;
	}
	
	/**
	 * @param minIndex
	 * @param maxIndex
	 * @return subjects with index between minIndex and maxIndex both included
	 */
	public List<Subject> filterJava8(int minIndex, int maxIndex) {
		// No external for boilerplate code loop
		return subjects.stream().filter((Subject subject) -> subject.getIndex()>=minIndex && subject.getIndex()<=maxIndex).collect(Collectors.toList());
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilterBetweenMinAndMax f = new FilterBetweenMinAndMax();
		List<Subject> results1 = f.filterPreJava8(500, 1000);		
		List<Subject> results2 = f.filterJava8(500, 1000);		
		System.out.println("Testing reports are equal = " + results1.equals(results2));		
	}

}
