package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.List;


public final class Validator {

	public static boolean criteriaValidator(Criteria criteria) {
		boolean check;
		if (criteria.getGroupSearchName().equals(SearchCriteria.Oven.class.getSimpleName())) {
			check = criteriaOven(criteria);
		}
		else if (criteria.getGroupSearchName().equals(SearchCriteria.Laptop.class.getSimpleName())) {
			check = criteriaLaptop(criteria);
		}
		else if (criteria.getGroupSearchName().equals(SearchCriteria.Refrigerator.class.getSimpleName())) {
			check = criteriaRefrigerator(criteria);
		}
		else if (criteria.getGroupSearchName().equals(SearchCriteria.Speakers.class.getSimpleName())) {
			check = criteriaSpeakers(criteria);
		}
		else if (criteria.getGroupSearchName().equals(SearchCriteria.TabletPC.class.getSimpleName())) {
			check = criteriaTabletPC(criteria);
		}
		else if (criteria.getGroupSearchName().equals(SearchCriteria.VacuumCleaner.class.getSimpleName())) {
			check = criteriaVacuumCleaner(criteria);
		} else {
			check = false;
		}

		return check;
	}

	private static boolean criteriaOven(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.Oven[] ovens = SearchCriteria.Oven.values();
		List<String> keys = criteria.getKey();
		for (String key : keys) {
			for (SearchCriteria.Oven o : ovens) {
				if (o.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}


	private static boolean criteriaLaptop(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.Laptop[] laptops = SearchCriteria.Laptop.values();
		List<String> keys = criteria.getKey();
		for (SearchCriteria.Laptop l : laptops) {
			for (String key : keys) {
				if (l.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}


	private static boolean criteriaRefrigerator(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.Refrigerator[] refrigerators = SearchCriteria.Refrigerator.values();
		List<String> keys = criteria.getKey();
		for (SearchCriteria.Refrigerator r : refrigerators) {
			for (String key : keys) {
				if (r.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}

	private static boolean criteriaSpeakers(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.Speakers[] speakers = SearchCriteria.Speakers.values();
		List<String> keys = criteria.getKey();
		for (SearchCriteria.Speakers s : speakers) {
			for (String key : keys) {
				if (s.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}


	private static boolean criteriaTabletPC(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.TabletPC[] tabletPCS = SearchCriteria.TabletPC.values();
		List<String> keys = criteria.getKey();
		for (SearchCriteria.TabletPC t : tabletPCS) {
			for (String key : keys) {
				if (t.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}


	private static boolean criteriaVacuumCleaner(Criteria criteria) {
		boolean check = true;
		int count = 0;
		SearchCriteria.VacuumCleaner[] vacuumCleaners = SearchCriteria.VacuumCleaner.values();
		List<String> keys = criteria.getKey();
		for (SearchCriteria.VacuumCleaner v : vacuumCleaners) {
			for (String key : keys) {
				if (v.toString().equals(key)) {
					count++;
				}
			}
		}
		if(count != keys.size()) {
			check = false;
		}

		return check;
	}
}